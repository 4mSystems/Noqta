package grand.app.aber_provider.pages.profile.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.PostsAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.profile.adapters.QuestionedPostsAdapter;
import grand.app.aber_provider.repository.ServicesRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import grand.app.aber_provider.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class ProfilePostsViewModels extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PostsAdapter postsAdapter;
    private QuestionedPostsAdapter questionedPostsAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    MainData mainData;

    @Inject
    public ProfilePostsViewModels(ServicesRepository postRepository) {
        mainData = new MainData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void profilePosts(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.userProfilePosts(page, getPassingObject().getObject(), showProgress));
    }

    public void deletePost(int postId) {
        compositeDisposable.add(postRepository.deletePost(postId));
    }

    public void hidePost(int postId) {
        compositeDisposable.add(postRepository.hidePost(postId));
    }

    public void sharePost() {
        compositeDisposable.add(postRepository.sharePost(getPostsAdapter().lastSelected));
    }

    public void reactPost(String reactType) {
        compositeDisposable.add(postRepository.reactPost(getPostsAdapter().lastSelected, reactType));
    }


    public void liveDataActions(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public PostsAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new PostsAdapter() : this.postsAdapter;
    }

    @Bindable
    public QuestionedPostsAdapter getQuestionedPostsAdapter() {
        return this.questionedPostsAdapter == null ? this.questionedPostsAdapter = new QuestionedPostsAdapter() : this.questionedPostsAdapter;
    }

    @Bindable
    public MainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(MainData mainData) {
        if (!TextUtils.isEmpty(getPassingObject().getObject()) && getPassingObject().getObject().contains(URLS.QUESTIONED_POSTS)) {
            getPostsAdapter().isPostShare = 0;
            if (getQuestionedPostsAdapter().getPostDataList().size() > 0) {
                getQuestionedPostsAdapter().loadMore(mainData.getPostDataList());
            } else {
                getQuestionedPostsAdapter().update(mainData.getPostDataList());
                notifyChange(BR.questionedPostsAdapter);
            }
        } else if (!TextUtils.isEmpty(getPassingObject().getObject()) && getPassingObject().getObject().contains(URLS.COMMENTED_POSTS)) {
            getPostsAdapter().isPostShare = 0;
            if (getPostsAdapter().getPostDataList().size() > 0) {
                getPostsAdapter().loadMore(mainData.getPostDataList());
            } else {
                getPostsAdapter().update(mainData.getPostDataList());
                notifyChange(BR.postsAdapter);
            }
        } else {
            getPostsAdapter().isPostShare = Constants.IS_POST_SHARED;
            getPostsAdapter().userProfile = UserHelper.getInstance(MyApplication.getInstance()).getUserProfile();
            if (getPostsAdapter().getPostDataList().size() > 0) {
                getPostsAdapter().loadMore(mainData.getPostDataList());
            } else {
                getPostsAdapter().update(mainData.getPostDataList());
                notifyChange(BR.postsAdapter);
            }
        }
        searchProgressVisible.set(false);
        notifyChange(BR.mainData);
        this.mainData = mainData;
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
