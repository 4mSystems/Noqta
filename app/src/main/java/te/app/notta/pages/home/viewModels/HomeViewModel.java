package te.app.notta.pages.home.viewModels;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.adapters.GroupsAdapter;
import te.app.notta.pages.home.models.HomeData;
import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.repository.GroupRepository;


public class HomeViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    HomeData homeData;
    GroupsAdapter groupsAdapter;

    @Inject
    public HomeViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void home(int page, boolean showProgress) {
        compositeDisposable.add(repository.getHome(page, showProgress));
    }

    @Bindable
    public HomeData getHomeData() {
        return this.homeData == null ? this.homeData = new HomeData() : this.homeData;
    }

    public void setHomeData(HomeData homeData) {
        if (getGroupsAdapter().getGroupItemList().size() > 0) {
            getGroupsAdapter().loadMore(homeData.getGroupItemList());
        } else {
            getGroupsAdapter().update(homeData.getGroupItemList());
            notifyChange(BR.groupsAdapter);
        }
        notifyChange(BR.homeData);
        this.homeData = homeData;
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
//        if (item.getItemId() == R.id.menuHome) {
//            liveData.setValue(new Mutable(Constants.MENU_HOME));
//            return true;
//        } else if (item.getItemId() == R.id.menuFavorites) {
//            liveData.setValue(new Mutable(Constants.MENU_FAVORITE));
//            return true;
//        } else if (item.getItemId() == R.id.menuAccount) {
//            liveData.setValue(new Mutable(Constants.MENU_ACCOUNT));
//            return true;
//        } else if (item.getItemId() == R.id.menuConversations) {
//            liveData.setValue(new Mutable(Constants.MENU_CONVERSATIONS));
//            return true;
//        } else if (item.getItemId() == R.id.menuAdd) {
//            liveData.setValue(new Mutable(Constants.MENU_ADD_AD));
//            return true;
//        } else
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
