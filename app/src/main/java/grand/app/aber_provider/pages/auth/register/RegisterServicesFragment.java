package grand.app.aber_provider.pages.auth.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentRegisterServicesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.aber_provider.pages.auth.models.MainServicesResponse;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class RegisterServicesFragment extends BaseFragment {
    @Inject
    RegisterViewModel viewModel;
    FragmentRegisterServicesBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_services, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        viewModel.authServices();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.SERVICES:
                    viewModel.getServicesAdapter().update(((MainServicesResponse) mutable.object).getSubServices());
                    viewModel.notifyChange(BR.servicesAdapter);
                    break;
                case Constants.REGISTER:
                    toastMessage(((UsersResponse) ((Mutable) o).object).mMessage);
                    finishActivity();
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, ((UsersResponse) ((Mutable) o).object).getData().getPhone()), null, ConfirmCodeFragment.class.getName(), null);
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
