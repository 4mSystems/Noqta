package grand.app.aber_provider.pages.auth.changePassword;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import java.util.Objects;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentChangePasswordBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class ChangePasswordFragment extends BaseFragment {
    @Inject
    ChangePasswordViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChangePasswordBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);

        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.CHANGE_PASSWORD)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
//                showSuccessDialog();
                finishActivity();
            } else if (((Mutable) o).message.equals(Constants.NOT_MATCH_PASSWORD)) {
                showError(getResources().getString(R.string.password_not_match));
            }
        });
    }

    private void showSuccessDialog() {
        Dialog deleteDialog = new Dialog(requireContext(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setBackgroundColor(ResourceManager.getColor(R.color.white));
        binding.optionDone.setBackgroundColor(ResourceManager.getColor(R.color.white));
        binding.optionDone.setEnabled(false);
        binding.optionCancel.setEnabled(false);
        binding.dialogHeader.setVisibility(View.GONE);
        binding.dialogHeader1.setVisibility(View.VISIBLE);
        binding.rcFilter.setText(getString(R.string.change_password_successfully));
        deleteDialog.setOnCancelListener(dialog -> finishActivity());
        deleteDialog.show();
    }
}
