package te.app.notta.pages.auth.forgetPassword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentForgetPasswordBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class ForgetPasswordFragment extends BaseFragment {
    FragmentForgetPasswordBinding binding;
    @Inject
    ForgetPasswordViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, container, false);
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
            if (((Mutable) o).message.equals(Constants.FORGET_PASSWORD)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                finishActivity();
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_FORGET, viewModel.getRequest().getEmail()), null, ConfirmCodeFragment.class.getName(), null);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
