package grand.app.aber_provider.pages.postDetails.viewModels;


import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.postDetails.models.postReacts.ReactsData;
import grand.app.aber_provider.pages.profile.adapters.FollowersAdapter;
import grand.app.aber_provider.pages.profile.models.UserActionRequest;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ReactionsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    PostRepository postRepository;
    ReactsData followersResponse;
    FollowersAdapter followersAdapter;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    String reactType;
    UserActionRequest actionRequest;

    @Inject
    public ReactionsViewModel(PostRepository postRepository) {
        setReactType(Constants.ALL_REACTIONS);
        followersResponse = new ReactsData();
        this.postRepository = postRepository;
        actionRequest = new UserActionRequest();
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void reactions(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.reActions(getPassingObject().getId(), page, showProgress, getReactType()));
    }

    public void changeFollowStatus(String cancelType,String url) {
        actionRequest.setUserId(getFollowersAdapter().lastSelected);
        actionRequest.setType(cancelType);
        compositeDisposable.add(postRepository.changeFollowStatus(actionRequest,url));
    }

    public void buttonActions(String action) {
        followersAdapter.getUserDataList().clear();
        setReactType(action);
        reactions(1, true);
    }

    @Bindable
    public ReactsData getFollowersResponse() {
        return followersResponse;
    }

    @Bindable
    public void setFollowersResponse(ReactsData followersResponse) {
        getFollowersAdapter().isFollowVisible = true;
        if (getFollowersAdapter().getUserDataList().size() > 0) {
            getFollowersAdapter().loadMore(followersResponse.getMainFollowersData().getUserDataList());
        } else {
            getFollowersAdapter().update(followersResponse.getMainFollowersData().getUserDataList());
            notifyChange(BR.followersAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.followersResponse);
        this.followersResponse = followersResponse;
    }


    public PostRepository getPostRepository() {
        return postRepository;
    }

    @Bindable
    public FollowersAdapter getFollowersAdapter() {
        return this.followersAdapter == null ? this.followersAdapter = new FollowersAdapter() : this.followersAdapter;
    }

    public UserActionRequest getActionRequest() {
        return actionRequest;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Bindable
    public String getReactType() {
        return reactType;
    }

    @Bindable
    public void setReactType(String reactType) {
        notifyChange(BR.reactType);
        this.reactType = reactType;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }
}
