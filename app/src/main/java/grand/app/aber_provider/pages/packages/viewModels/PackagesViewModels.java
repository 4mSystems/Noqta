package grand.app.aber_provider.pages.packages.viewModels;

import android.annotation.SuppressLint;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.PostsAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class PackagesViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PostsAdapter postsAdapter;
    @Inject
    PostRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    public String search;
    MainData mainData;

    @Inject
    public PackagesViewModels(PostRepository postRepository) {
        mainData = new MainData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void posts(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.getPosts(page, showProgress));
    }

    public void getLivesStreams(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.getLives(page, showProgress));
    }

    public void followersPosts(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.getFollowersPosts(page, showProgress));
    }

    public void deletePost() {
        compositeDisposable.add(postRepository.deletePost(getPostsAdapter().lastSelected));
    }

    public void hidePost() {
        compositeDisposable.add(postRepository.hidePost(getPostsAdapter().lastSelected));
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
    public MainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(MainData mainData) {
        if (getPostsAdapter().getPostDataList().size() > 0) {
            getPostsAdapter().loadMore(mainData.getPostDataList());
        } else {
            getPostsAdapter().update(mainData.getPostDataList());
            notifyChange(BR.postsAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.mainData);
        this.mainData = mainData;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }


    @BindingMethods({
            @BindingMethod(
                    type = BottomNavigationView.class,
                    attribute = "app:onNavigationItemSelected",
                    method = "setOnNavigationItemSelectedListener"
            ),
    })
    public class DataBindingAdapter {
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onNavigationClick(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuHome:
                liveData.setValue(new Mutable(Constants.MENU_HOME));
                return true;
            case R.id.menuFollowers:
                liveData.setValue(new Mutable(Constants.MENU_FOLLOWERS));
                return true;
            case R.id.menuAccount:
                liveData.setValue(new Mutable(Constants.MENU_ACCOUNT));
                return true;
            case R.id.menuLive:
                liveData.setValue(new Mutable(Constants.MENU_LIVE));
                return true;
            case R.id.menuMore:
                liveData.setValue(new Mutable(Constants.MORE));
                return true;
            default:
                return true;
        }
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
