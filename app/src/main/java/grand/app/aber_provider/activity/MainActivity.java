package grand.app.aber_provider.activity;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import com.mobeedev.library.SlidingMenuBuilder;
import com.mobeedev.library.SlidingNavigation;
import com.mobeedev.library.dragstate.DragStateListener;
import com.mobeedev.library.gravity.SlideGravity;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.customViews.actionbar.HomeActionBarView;
import grand.app.aber_provider.customViews.views.NavigationDrawerView;
import grand.app.aber_provider.databinding.ActivityMainBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.HomeFragment;
import grand.app.aber_provider.pages.home.viewModels.HomeViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModels viewModel;
    HomeActionBarView homeActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();
    public SlidingNavigation menuBuilder;
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
        activityMainBinding.llBaseActionBarContainer.addView(homeActionBarView);
        setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        menuBuilder = new SlidingMenuBuilder(this)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(true)
                .withMenuView(navigationDrawerView)
                .withToolbarMenuToggle(homeActionBarView.layoutActionBarHomeBinding.toolbar)
                .addDragStateListener(new DragStateListener() {
                    @Override
                    public void onDragStart() {
                        menuBuilder.openMenu(true);
                    }

                    @Override
                    public void onDragEnd(boolean b) {

                    }
                })
                .withGravity(SlideGravity.RIGHT) //If LEFT you can swipe a menu from left to right, if RIGHT - the direction is opposite.
                .withSavedState(savedInstanceState) //If you call the method, layout will restore its opened/closed state
                .withDragDistance(250) //Horizontal translation of a view. Default == 180dp
                .withRootViewScale(0.9f) //Content view's scale will be interpolated between 1f and 0.7f. Default == 0.65f;
                .withRootViewElevation(10) //Content view's elevation will be interpolated between 0 and 10dp. Default == 8.
                .withRootViewYTranslation(4) //Content view's translationY will be interpolated between 0 and 4. Default == 0
                .inject();
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
