package grand.app.aber_provider.pages.auth.login;

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
import grand.app.aber_provider.databinding.FragmentLoginBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.aber_provider.pages.auth.countries.CountriesFragment;
import grand.app.aber_provider.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.pages.auth.register.RegisterFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;


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
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    MovementHelper.startActivityBase(requireActivity(), CountriesFragment.class.getName(), getString(R.string.country), null);
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivity(requireActivity(), ForgetPasswordFragment.class.getName(), null, null);
                    break;
                case Constants.REGISTER:
                    MovementHelper.startActivity(requireActivity(), RegisterFragment.class.getName(), getString(R.string.register_title), null);
                    break;
                case Constants.ERROR_NOT_FOUND:
                    showError(String.valueOf(mutable.object));
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.loginRequest.getPhone()), null, ConfirmCodeFragment.class.getName(), null);
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
