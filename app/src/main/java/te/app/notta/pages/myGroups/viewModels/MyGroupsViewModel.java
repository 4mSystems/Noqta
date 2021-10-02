package te.app.notta.pages.myGroups.viewModels;

import android.text.TextUtils;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.BR;
import te.app.notta.R;
import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.adapters.GroupsAdapter;
import te.app.notta.pages.home.models.HomeData;
import te.app.notta.pages.myGroups.adapters.MyGroupsAdapter;
import te.app.notta.repository.GroupRepository;
import te.app.notta.utils.Constants;


public class MyGroupsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    HomeData homeData;
    MyGroupsAdapter groupsAdapter;
    public String searchText = "";

    @Inject
    public MyGroupsViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void home(int page, boolean showProgress) {
        compositeDisposable.add(repository.getHome(page, showProgress, searchText));
    }

    public void studentTasks(int page, boolean showProgress) {
        compositeDisposable.add(repository.studentTasks(page, showProgress));
    }

    public void removeGroup(int groupId) {
        compositeDisposable.add(repository.deleteGroup(groupId));
    }

    public void leaveGroup(int groupId) {
        compositeDisposable.add(repository.leaveGroup(groupId));
    }

    @Bindable
    public HomeData getHomeData() {
        return this.homeData == null ? this.homeData = new HomeData() : this.homeData;
    }

    public void setHomeData(HomeData homeData) {
        if (!TextUtils.isEmpty(searchText)) { // if search required
            if (homeData.getCurrentPage() > 1) {
                getGroupsAdapter().loadMore(homeData.getGroupItemList());
            } else {
                getGroupsAdapter().update(homeData.getGroupItemList());
                notifyChange(BR.inviteStudentsAdapter);
            }
        } else {
            if (getGroupsAdapter().getGroupItemList().size() > 0) {
                getGroupsAdapter().loadMore(homeData.getGroupItemList());
            } else {
                getGroupsAdapter().update(homeData.getGroupItemList());
                notifyChange(BR.groupsAdapter);
            }
        }
        searchProgressVisible.set(false);
        notifyChange(BR.homeData);
        this.homeData = homeData;
    }

    @Bindable
    public MyGroupsAdapter getGroupsAdapter() {
        return this.groupsAdapter == null ? this.groupsAdapter = new MyGroupsAdapter() : this.groupsAdapter;
    }

    public GroupRepository getRepository() {
        return repository;
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
