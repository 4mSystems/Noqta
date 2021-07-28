package grand.app.aber_provider.activity;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.customViews.actionbar.HomeActionBarView;
import grand.app.aber_provider.databinding.ActivityMainBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.services.FragmentConfirmOrder;
import grand.app.aber_provider.pages.services.WinchFragment;
import grand.app.aber_provider.pages.home.viewModels.HomeViewModels;
import grand.app.aber_provider.pages.home.HomeFragment;
import grand.app.aber_provider.pages.settings.SocialMedia;
import grand.app.aber_provider.pages.settings.MyAccountSettingsFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModels viewModel;
    HomeActionBarView homeActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(viewModel);
        homeActionBarView = new HomeActionBarView(this);
        activityMainBinding.llBaseActionBarContainer.addView(homeActionBarView);
        viewModel.liveData.setValue(new Mutable(Constants.MENU_HOME));
        setEvents();
    }

    private void setEvents() {
        viewModel.liveData.observe(this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;
                case Constants.MENU_FOLLOWERS:
                    setHomeActionTitle(getResources().getString(R.string.menuFollowers), "Visible");
                    MovementHelper.replaceFragment(this, new FragmentConfirmOrder(), "");
                    break;
                case Constants.MENU_ACCOUNT:
                    setHomeActionTitle(getResources().getString(R.string.menuCart), null);
                    MovementHelper.replaceFragment(this, new MyAccountSettingsFragment(), "");
                    break;
                case Constants.MENU_LIVE:
                    setHomeActionTitle(getResources().getString(R.string.menuFavorite), "Visible");
                    MovementHelper.replaceFragment(this, new WinchFragment(), "");
                    break;
                case Constants.MORE:
                    setHomeActionTitle(getResources().getString(R.string.menuCategories), null);
                    MovementHelper.replaceFragment(this, new SocialMedia(), "");
                    break;

            }
        });
        activityMainBinding.swipeContainer.setOnRefreshListener(() -> refreshingLiveData.setValue(true));
    }


    private void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
        if (notificationVisible != null) {
            homeActionBarView.notificationVisible(View.VISIBLE);
        } else
            homeActionBarView.notificationVisible(View.GONE);
    }

    public void enableRefresh(boolean status) {
        activityMainBinding.swipeContainer.setEnabled(status);
    }

    public void stopRefresh(boolean status) {
        activityMainBinding.swipeContainer.setRefreshing(status);
    }

    public MutableLiveData<Boolean> getRefreshingLiveData() {
        return refreshingLiveData;
    }

}
