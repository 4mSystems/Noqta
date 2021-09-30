package te.app.notta.pages.home.viewModels;

import android.text.TextUtils;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.R;
import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.adapters.GroupsAdapter;
import te.app.notta.pages.home.models.HomeData;
import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.repository.GroupRepository;
import te.app.notta.utils.Constants;


public class HomeViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    HomeData homeData;
    GroupsAdapter groupsAdapter;
    public String searchText = "";

    @Inject
    public HomeViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void home(int page, boolean showProgress) {
        compositeDisposable.add(repository.getHome(page, showProgress, searchText));
    }

    public void studentJoinRequest(int groupId) {
        compositeDisposable.add(repository.studentJoinRequest(groupId));
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

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!TextUtils.isEmpty(s)) {
            searchText = s.toString();
            home(1, false);
            searchProgressVisible.set(true);
        }
    }

    @Bindable
    public GroupsAdapter getGroupsAdapter() {
        return this.groupsAdapter == null ? this.groupsAdapter = new GroupsAdapter() : this.groupsAdapter;
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
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

    public boolean onNavigationClick(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuHome) {
            liveData.setValue(new Mutable(Constants.MENU_HOME));
            return true;
        } else if (item.getItemId() == R.id.menuTasks) {
            liveData.setValue(new Mutable(Constants.MENU_TASKS));
            return true;
        } else if (item.getItemId() == R.id.menuAdd) {
            liveData.setValue(new Mutable(Constants.MENU_GIFTS));
            return true;
        } else if (item.getItemId() == R.id.menuAccount) {
            liveData.setValue(new Mutable(Constants.MENU_ACCOUNT));
            return true;
        } else if (item.getItemId() == R.id.menuMore) {
            liveData.setValue(new Mutable(Constants.MORE));
            return true;
        }
        return false;
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
