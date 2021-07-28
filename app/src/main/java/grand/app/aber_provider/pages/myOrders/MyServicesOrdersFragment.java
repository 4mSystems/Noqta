package grand.app.aber_provider.pages.myOrders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentServicesOrdersBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.profile.viewModels.ProfileViewModels;

public class MyServicesOrdersFragment extends BaseFragment {
    FragmentServicesOrdersBinding binding;
    @Inject
    ProfileViewModels viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_services_orders, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);

        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe( requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);

        });

    }
    @Override
    public void onResume() {
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
        super.onResume();
    }
}
