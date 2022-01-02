package te.app.nottaa.pages.auth.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;
import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentLoginBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.nottaa.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.nottaa.pages.auth.models.UsersResponse;
import te.app.nottaa.pages.auth.register.RegisterFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.session.UserHelper;


public class LoginFragment extends BaseFragment {
    @Inject
    LoginViewModel viewModel;
    FragmentLoginBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
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
            switch (((Mutable) o).message) {
                case Constants.LOGIN:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) mutable.object).getData());
                    MovementHelper.startActivityMain(requireActivity());
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivity(requireActivity(), ForgetPasswordFragment.class.getName(), null, null);
                    break;
                case Constants.REGISTER:
                    MovementHelper.startActivity(requireActivity(), RegisterFragment.class.getName(), null, null);
                    break;
                case Constants.ERROR_NOT_FOUND:
                    showError(String.valueOf(mutable.object));
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.loginRequest.getEmail()), null, ConfirmCodeFragment.class.getName(), null);
                    break;
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
