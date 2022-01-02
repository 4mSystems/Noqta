package te.app.nottaa.base;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.messaging.FirebaseMessaging;

import es.dmoral.toasty.Toasty;
import te.app.nottaa.R;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.auth.login.LoginFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.LauncherHelper;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.resources.ResourceManager;
import te.app.nottaa.utils.services.RealTimeReceiver;
import te.app.nottaa.utils.session.LanguagesHelper;
import te.app.nottaa.utils.session.MyContextWrapper;
import te.app.nottaa.utils.session.UserHelper;

public class ParentActivity extends AppCompatActivity implements
        ConnectivityReceiver.ConnectivityReceiverListener, RealTimeReceiver.MessageReceiverListener, RealTimeReceiver.NotificationCounterListener {
    public MutableLiveData<Mutable> mutableLiveData;
    ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
    RealTimeReceiver realTimeReceiver = new RealTimeReceiver();
    public ActivityResultLauncher<Intent> someActivityResultLauncher;
    public MutableLiveData<Integer> notificationsCount = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mutableLiveData = new MutableLiveData<>();
        initializeLanguage();
        initializeToken();
        initializeProgress();
        launchActivityResult();
    }

    protected boolean notification_checked = false;

    protected void initializeLanguage() {
        LanguagesHelper.changeLanguage(this, LanguagesHelper.getCurrentLanguage());
        LanguagesHelper.changeLanguage(MyApplication.getInstance(), LanguagesHelper.getCurrentLanguage());
    }

    protected void initializeToken() {
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        return;
                    }
                    UserHelper.getInstance(MyApplication.getInstance()).addToken(task.getResult());
                });
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().setConnectivityListener(this);
        MyApplication.getInstance().setMessageReceiverListener(this);
        MyApplication.getInstance().setNotificationsCount(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(connectivityReceiver, intentFilter);
        IntentFilter chatFilter = new IntentFilter("app.te.receiver");
        chatFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(realTimeReceiver, chatFilter);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(connectivityReceiver);
        unregisterReceiver(realTimeReceiver);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
            super.attachBaseContext(MyContextWrapper.wrap(newBase, LanguagesHelper.getCurrentLanguage()));
        } else {
            super.attachBaseContext(newBase);
        }
    }

    protected Dialog dialogLoader;

    public void initializeProgress() {
        View view = LayoutInflater.from(this).inflate(R.layout.loader_animation, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customDialog);
        builder.setView(view);
        dialogLoader = builder.create();
        dialogLoader.setOnCancelListener(dialogInterface -> dialogLoader.dismiss());
    }

    public void showProgress() {
        //show dialog
        if (dialogLoader != null && !this.isFinishing()) {
            dialogLoader.show();
        }
    }

    public void hideProgress() {
        if (dialogLoader != null && dialogLoader.isShowing() && !this.isFinishing())
            dialogLoader.dismiss();
    }


    public void handleActions(Mutable mutable) {
        Log.e("handleActions", "handleActions: " + mutable.message);
        if (mutable.message.equals(Constants.SHOW_PROGRESS)) showProgress();
        else if (mutable.message.equals(Constants.HIDE_PROGRESS)) hideProgress();
        else if (mutable.message.equals(Constants.SERVER_ERROR) && mutable.object == null) {
            hideProgress();
            toastError(ResourceManager.getString(R.string.msg_server_error));
        } else if (mutable.message.equals(Constants.ERROR) && mutable.object instanceof String) {
            hideProgress();
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.NOT_VERIFIED) && mutable.object instanceof String) {
            hideProgress();
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_TOAST) && mutable.object instanceof String) {
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_NOT_FOUND) && mutable.object instanceof String) {
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.FAILURE_CONNECTION)) {
            hideProgress();
        } else if (mutable.message.equals(Constants.LOGOUT)) {
            if (UserHelper.getInstance(this).getUserData() != null) {
                try {
                    // clearing app data
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec("pm clear" + MyApplication.getInstance().getPackageName());
                    UserHelper.getInstance(this).loggout();
                    MovementHelper.startActivityBase(this, LoginFragment.class.getName(), null, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void noConnection() {
        Resources resources = getResources();
        toastError(resources.getString(R.string.connection_invaild_body)); // Optional
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        if (!isConnected) {
            noConnection();
        }
    }

    public void showError(String msg) {
        Snackbar snackBar = Snackbar.make(findViewById(R.id.ll_base_container),
                msg, Snackbar.LENGTH_LONG);
        View view = snackBar.getView();
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        snackBar.show();
    }

    public void toastMessage(String message, int icon, int color) {
        Toasty.custom(this, message, icon, color, Toasty.LENGTH_SHORT, true, true).show();
    }

    public void toastError(String message) {
        Toasty.error(this, message, Toasty.LENGTH_SHORT, true).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constants.CUSTOM_REQUEST_CODE)
            try {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_home_container);
                assert fragment != null;
                if (fragment instanceof BaseFragment)
                    ((BaseFragment) fragment).launchActivityResult(requestCode, resultCode, data);
            } catch (Exception ex) {
                ex.printStackTrace();
//            Toast.makeText(this, ResourceManager.getString(R.string.please_select_another_file), Toast.LENGTH_SHORT).show();
            }
    }

    private static final String TAG = "ParentActivity";

    private void launchActivityResult() {
        LauncherHelper.onActivityResult(this, (request, resultCode, result) -> {
            try {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_home_container);
                assert fragment != null;
                if (fragment instanceof BaseFragment)
                    ((BaseFragment) fragment).launchActivityResult(request, resultCode, result);
            } catch (Exception ex) {
                ex.printStackTrace();
                Toast.makeText(this, ResourceManager.getString(R.string.please_select_another_file), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onNotificationsCounter(int count) {
        notificationsCount.setValue(count);
    }

}
