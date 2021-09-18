package te.app.notta.activity;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import te.app.notta.R;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.customViews.actionbar.HomeActionBarView;
import te.app.notta.customViews.views.NavigationDrawerView;
import te.app.notta.databinding.ActivityMainBinding;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
//    @Inject
//    HomeViewModels viewModel;
    HomeActionBarView homeActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();
    public NavigationDrawerView navigationDrawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        activityMainBinding.setViewModel(viewModel);
        homeActionBarView = new HomeActionBarView(this);
        navigationDrawerView = new NavigationDrawerView(this);
        activityMainBinding.llBaseActionBarContainer.addView(homeActionBarView);
//        setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
//        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();
    }

    private void setEvents() {
        activityMainBinding.swipeContainer.setOnRefreshListener(() -> refreshingLiveData.setValue(true));

    }


    public void setHomeActionTitle(String title, String notificationVisible) {
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
