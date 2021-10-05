package te.app.notta.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.customViews.actionbar.BackActionBarView;
import te.app.notta.databinding.ActivityBaseBinding;
import te.app.notta.pages.groupDetails.GroupDetailsFragment;
import te.app.notta.pages.notifications.NotificationsFragment;
import te.app.notta.pages.points.MyPointsFragment;
import te.app.notta.pages.splash.SplashFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class BaseActivity extends ParentActivity {
    ActivityBaseBinding activityBaseBinding;
    public BackActionBarView backActionBarView;
    MutableLiveData<Boolean> refreshingLiveData = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        backActionBarView = new BackActionBarView(this);
        getNotification();
        if (!notification_checked) {
            if (getIntent().hasExtra(Constants.PAGE)) {
                String fragmentName = getIntent().getStringExtra(Constants.PAGE);
                if (fragmentName != null) {
                    try {
//                        if (fragmentName.equals(OrderDetailsFragment.class.getName()))
//                            backActionBarView.flag = 1;
                        Fragment fragment = (Fragment) Class.forName(fragmentName).newInstance();
                        MovementHelper.replaceFragmentTag(this, getBundle(fragment), fragmentName, "");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                MovementHelper.replaceFragment(this, new SplashFragment(), "");
            }
        }
        activityBaseBinding.swipeContainer.setEnabled(false);
        activityBaseBinding.swipeContainer.setOnRefreshListener(() -> refreshingLiveData.setValue(true));
    }

    private void setTitleName(@Nullable String title) {
        if (title != null) {
            backActionBarView.setTitle(title);
        } else {
            if (getIntent().hasExtra(Constants.NAME_BAR)) {
                backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
            }
        }
        activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);

    }

    public void getNotification() {
        if (getIntent() != null && getIntent().getBooleanExtra("is_notification", false)) {
            if (getIntent().getSerializableExtra(Constants.TYPE) != null) {
                notification_checked = true;
                String typeNotifications = getIntent().getStringExtra(Constants.TYPE);
                String postId = getIntent().getStringExtra(Constants.GROUP_ID);
                Log.e("getNotification", "getNotification: " + postId);
                Bundle bundle = new Bundle();
                backActionBarView.flag = 1;
                if (typeNotifications.equals("1")) {
                    GroupDetailsFragment homeMainFragment = new GroupDetailsFragment();
                    bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(postId))));
                    homeMainFragment.setArguments(bundle);
                    MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                } else if (typeNotifications.equals("2")) {
                    MyPointsFragment homeMainFragment = new MyPointsFragment();
                    MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                } else {
                    NotificationsFragment homeMainFragment = new NotificationsFragment();
                    MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                }
            }
        }
    }

    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName(null);
        }
        return fragment;
    }

    @Override
    public void onBackPressed() {
        try {
            if (dialogLoader != null && dialogLoader.isShowing()) {
                dialogLoader.dismiss();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        super.onBackPressed();
        if (backActionBarView.flag == 1) {
            if (isTaskRoot()) {
                // This activity is at root of task, so launch main activity
                MovementHelper.startActivityMain(this);
            } else {
                // This activity isn't at root of task, so just finish()
                finish();
            }
        } else
            finish();
    }

    public void enableRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setEnabled(status);
    }

    public void stopRefresh(boolean status) {
        activityBaseBinding.swipeContainer.setRefreshing(status);
    }

    public MutableLiveData<Boolean> getRefreshingLiveData() {
        return refreshingLiveData;
    }


}