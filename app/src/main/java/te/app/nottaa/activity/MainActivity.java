package te.app.nottaa.activity;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.nottaa.R;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.base.ParentActivity;
import te.app.nottaa.customViews.actionbar.HomeActionBarView;
import te.app.nottaa.customViews.views.NavigationDrawerView;
import te.app.nottaa.databinding.ActivityMainBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.home.HomeFragment;
import te.app.nottaa.pages.points.PointsFragment;
import te.app.nottaa.pages.home.TasksFragment;
import te.app.nottaa.pages.home.viewModels.HomeViewModel;
import te.app.nottaa.pages.settings.MoreFragment;
import te.app.nottaa.pages.settings.ProfileFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModel viewModel;
    HomeActionBarView homeActionBarView;
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
        viewModel.liveData.observe(this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;
                case Constants.MENU_TASKS:
                    MovementHelper.replaceFragment(this, new TasksFragment(), "");
                    break;
                case Constants.MENU_GIFTS:
                    MovementHelper.replaceFragment(this, new PointsFragment(), "");
                    break;
                case Constants.MENU_ACCOUNT:
                    MovementHelper.replaceFragment(this, new ProfileFragment(), "");
                    break;
                case Constants.MORE:
                    MovementHelper.replaceFragment(this, new MoreFragment(), "");
                    break;
            }
        });
    }


    public void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
        if (notificationVisible != null) {
            homeActionBarView.notificationVisible(View.VISIBLE);
        } else
            homeActionBarView.notificationVisible(View.GONE);
    }

}
