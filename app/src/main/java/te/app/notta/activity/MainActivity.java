package te.app.notta.activity;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.customViews.actionbar.HomeActionBarView;
import te.app.notta.customViews.views.NavigationDrawerView;
import te.app.notta.databinding.ActivityMainBinding;
import te.app.notta.pages.home.HomeFragment;
import te.app.notta.pages.home.viewModels.HomeViewModel;
import te.app.notta.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModel viewModel;
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
        activityMainBinding.setViewModel(viewModel);
        homeActionBarView = new HomeActionBarView(this);
        navigationDrawerView = new NavigationDrawerView(this);
//        activityMainBinding.llBaseActionBarContainer.addView(homeActionBarView);
//        setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();
    }

    private void setEvents() {

    }


    public void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
        if (notificationVisible != null) {
            homeActionBarView.notificationVisible(View.VISIBLE);
        } else
            homeActionBarView.notificationVisible(View.GONE);
    }

}
