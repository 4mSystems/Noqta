package grand.app.aber_provider.pages.packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentPackagesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.packages.models.PackagesResponse;
import grand.app.aber_provider.pages.packages.viewModels.PackagesViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;

public class PackagesFragment extends BaseFragment {
    @Inject
    PackagesViewModels viewModel;
    FragmentPackagesBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_packages, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.getPackages();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (Constants.PACKAGES.equals(((Mutable) o).message)) {
                viewModel.getPackagesAdapter().update(((PackagesResponse) mutable.object).getData());
                viewModel.notifyChange(BR.packagesAdapter);
            } else if (Constants.SUBSCRIPTION.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.userData.setPackageId(String.valueOf(viewModel.getPackagesAdapter().lastSelected));
                UserHelper.getInstance(requireActivity()).userLogin(viewModel.userData);
                MovementHelper.startActivityMain(requireActivity());
            }
        });
        viewModel.getPackagesAdapter().liveData.observeForever(id -> viewModel.subscribe(id));
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getServicesRepository().setLiveData(viewModel.liveData);
    }
}
