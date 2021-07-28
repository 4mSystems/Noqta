package grand.app.aber_provider.pages.auth.forgetPassword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentForgetPasswordBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

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
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_FORGET, viewModel.getRequest().getPhone()), null, ConfirmCodeFragment.class.getName(), null);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
