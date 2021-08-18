package grand.app.aber_provider.pages.profile.viewModels;


import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.profile.adapters.FollowersAdapter;
import grand.app.aber_provider.pages.profile.models.MainFollowersData;
import grand.app.aber_provider.pages.profile.models.UserActionRequest;
import grand.app.aber_provider.repository.ServicesRepository;
import grand.app.aber_provider.utils.URLS;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class ProfileFollowersViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private FollowersAdapter followersAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    MainFollowersData mainFollowersData;
    UserActionRequest actionRequest;

    @Inject
    public ProfileFollowersViewModels(ServicesRepository postRepository) {
        actionRequest = new UserActionRequest();
        mainFollowersData = new MainFollowersData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void userFollowers(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.userProfileFollowers(page, getPassingObject().getObject(), showProgress));
    }

    public void cancelFollow(String cancelType) {
        actionRequest.setType(cancelType);
        actionRequest.setUserId(getFollowersAdapter().lastSelected);
        compositeDisposable.add(postRepository.changeFollowStatus(actionRequest, URLS.CHANGE_FOLLOW_ACTIONS));
    }


    public void liveDataActions(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public MainFollowersData getMainFollowersData() {
        return mainFollowersData;
    }

    @Bindable
    public void setMainFollowersData(MainFollowersData mainFollowersData) {
        getFollowersAdapter().isFollowVisible = true;
        if (!TextUtils.isEmpty(getPassingObject().getObject()) && getPassingObject().getObject().contains(URLS.USER_FOLLOWERS))
            getFollowersAdapter().followBtnText = ResourceManager.getString(R.string.ordinary_wash);
        else if (!TextUtils.isEmpty(getPassingObject().getObject()) && getPassingObject().getObject().contains(URLS.USER_FOLLOWING))
            getFollowersAdapter().followBtnText = ResourceManager.getString(R.string.tire_desc);
        if (getFollowersAdapter().getUserDataList().size() > 0) {
            getFollowersAdapter().loadMore(mainFollowersData.getUserDataList());
        } else {
            getFollowersAdapter().update(mainFollowersData.getUserDataList());
            notifyChange(BR.followersAdapter);
        }
        this.mainFollowersData = mainFollowersData;
    }

    @Bindable
    public FollowersAdapter getFollowersAdapter() {
        return this.followersAdapter == null ? this.followersAdapter = new FollowersAdapter() : this.followersAdapter;
    }

    public ServicesRepository getPostRepository() {
        return postRepository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

}
