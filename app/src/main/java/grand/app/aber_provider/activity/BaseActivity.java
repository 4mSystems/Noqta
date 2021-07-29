package grand.app.aber_provider.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.customViews.actionbar.BackActionBarView;
import grand.app.aber_provider.databinding.ActivityBaseBinding;
import grand.app.aber_provider.pages.splash.SplashFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

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
//                        if (fragmentName.equals(ProductDetailsFragment.class.getName()) || fragmentName.equals(LiveDetailsFragment.class.getName()))
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
                String postId = getIntent().getStringExtra(Constants.POST_ID);
                String userId = getIntent().getStringExtra(Constants.FOLLOWER_ID);
                String commentId = getIntent().getStringExtra(Constants.COMMENT_ID);
                Log.e("getNotification", "getNotification: " + postId);
                Bundle bundle = new Bundle();
                backActionBarView.flag = 1;
//                if (!TextUtils.isEmpty(postId) || !TextUtils.isEmpty(userId) || !TextUtils.isEmpty(commentId)) {
//                    if (Constants.POST_TYPE.equals(typeNotifications)) {  // post details
//                        setTitleName("");
//                        ProductDetailsFragment homeMainFragment = new ProductDetailsFragment();
//                        bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(postId))));
//                        homeMainFragment.setArguments(bundle);
//                        MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
//                    } else {
//                        MovementHelper.startActivityMain(this);
//                    }
//                }
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