package grand.app.aber_provider.pages.home.viewModels;

import android.text.TextUtils;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.SearchPostsAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.profile.adapters.FollowersAdapter;
import grand.app.aber_provider.pages.profile.models.MainFollowersData;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class SearchViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private SearchPostsAdapter postsAdapter;
    FollowersAdapter followersAdapter;
    @Inject
    PostRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    public String search;
    MainData mainData;
    MainFollowersData mainFollowersData;
    public ObservableField<String> buttonsVisible = new ObservableField<>();

    @Inject
    public SearchViewModels(PostRepository postRepository) {
        mainData = new MainData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
        buttonsVisible.set(Constants.POSTS);
    }

    public void search(int page, boolean showProgress) {
        if (buttonsVisible.get().equals(Constants.POSTS))
            compositeDisposable.add(postRepository.search(page, showProgress, search, "posts"));
        else
            compositeDisposable.add(postRepository.searchPeople(page, showProgress, search, "users"));
    }

    public void liveDataActions(String action) {
        buttonsVisible.set(action);
        searchProgressVisible.set(true);
        getFollowersAdapter().getUserDataList().clear();
        getPostsAdapter().getPostDataList().clear();
        notifyChange(BR.followersAdapter);
        notifyChange(BR.postsAdapter);
        search(1, false);
    }

    @Bindable
    public SearchPostsAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new SearchPostsAdapter() : this.postsAdapter;
    }

    @Bindable
    public FollowersAdapter getFollowersAdapter() {
        return this.followersAdapter == null ? this.followersAdapter = new FollowersAdapter() : this.followersAdapter;
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

    @Bindable
    public MainFollowersData getMainFollowersData() {
        return mainFollowersData;
    }

    @Bindable
    public void setMainFollowersData(MainFollowersData mainFollowersData) {
        if (getFollowersAdapter().getUserDataList().size() > 0) {
            getFollowersAdapter().loadMore(mainFollowersData.getUserDataList());
        } else {
            getFollowersAdapter().update(mainFollowersData.getUserDataList());
            notifyChange(BR.followersAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.mainFollowersData);
        this.mainFollowersData = mainFollowersData;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!TextUtils.isEmpty(s)) {
            searchProgressVisible.set(true);
            search = s.toString();
            search(1, false);
        } else
            searchProgressVisible.set(false);
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

    private static final String TAG = "HomeViewModel";

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
