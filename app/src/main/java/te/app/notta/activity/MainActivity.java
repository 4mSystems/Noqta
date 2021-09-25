package te.app.notta.activity;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.customViews.actionbar.HomeActionBarView;
import te.app.notta.customViews.views.NavigationDrawerView;
import te.app.notta.databinding.ActivityMainBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.HomeFragment;
import te.app.notta.pages.home.PointsFragment;
import te.app.notta.pages.home.TasksFragment;
import te.app.notta.pages.home.viewModels.HomeViewModel;
import te.app.notta.pages.settings.MoreFragment;
import te.app.notta.pages.settings.ProfileFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

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
