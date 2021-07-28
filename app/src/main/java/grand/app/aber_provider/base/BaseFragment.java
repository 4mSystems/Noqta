package grand.app.aber_provider.base;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import grand.app.aber_provider.R;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.activity.MainActivity;
import grand.app.aber_provider.databinding.ExistLayoutBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.upload.FileOperations;


public class BaseFragment extends Fragment {
    private Context context;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }


    protected void pickImageDialogSelect() {
        FileOperations.pickImage(context);
    }

    protected void pickPostMedia(Context context) {
        FileOperations.verifyStoragePermissions(context);
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

    public ParentActivity getActivityBase() {
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

    public void exitDialog(String text) {
        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ExistLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.exist_layout, null, false);
        dialog.setContentView(binding.getRoot());
        binding.logoutTxt.setText(text);
        binding.agree.setOnClickListener(v -> {
            dialog.dismiss();
            handleActions(new Mutable(Constants.LOGOUT));
        });
        binding.decline.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }

    public void launchActivityResult(int request, int resultCode, Intent result) {
    }
}
