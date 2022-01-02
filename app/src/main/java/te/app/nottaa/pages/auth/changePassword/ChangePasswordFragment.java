package te.app.nottaa.pages.auth.changePassword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;


import javax.inject.Inject;

import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentChangePasswordBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.utils.Constants;

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

}
