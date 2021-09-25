package te.app.notta.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import te.app.notta.R;
import te.app.notta.activity.BaseActivity;
import te.app.notta.activity.MainActivity;
import te.app.notta.model.base.Mutable;
import te.app.notta.utils.upload.FileOperations;


public class BaseFragment extends Fragment {
    private Context context;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }


    protected void pickImageDialogSelect(int request) {
        FileOperations.pickImage(context, request);
    }


    protected void pickVideo(Context context) {
        FileOperations.pickVideo(context);
    }


    public void handleActions(Mutable mutable) {
        ((ParentActivity) context).handleActions(mutable);
    }

    public void showError(String msg) {
        if (context != null) {
            ((ParentActivity) context).showError(msg);
        }
    }

    public ParentActivity getParentActivity() {
        return ((ParentActivity) context);
    }

    public BaseActivity baseActivity() {
        return ((BaseActivity) context);
    }

    public MainActivity mainActivity() {
        return ((MainActivity) context);
    }

    public void toastMessage(String message, int icon, int color) {
        ((ParentActivity) context).toastMessage(message, icon, color);
    }

    public void toastMessage(String message) {
        ((ParentActivity) context).toastMessage(message, R.drawable.ic_check_white_24dp, R.color.successColor);
    }

    public void toastErrorMessage(String message) {
        ((ParentActivity) context).toastError(message);
    }

    public void closeKeyboard() {
        View view = requireActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        requireActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }

    protected void finishActivity() {
        ((ParentActivity) context).finish();
    }

    protected void finishAllActivities() {
        ((ParentActivity) context).finishAffinity();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private static final String TAG = "BaseFragment";

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;

    }

    public void launchActivityResult(int request, int resultCode, Intent result) {
        Log.e(TAG, "launchActivityResult: " + request);
    }
}
