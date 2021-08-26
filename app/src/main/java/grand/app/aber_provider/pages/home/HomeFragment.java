package grand.app.aber_provider.pages.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import java.io.File;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.databinding.FragmentHomeBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.HomeResponse;
import grand.app.aber_provider.pages.home.viewModels.HomeViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.upload.FileOperations;

public class HomeFragment extends BaseFragment {
    @Inject
    HomeViewModels viewModel;
    FragmentHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.homeOrders();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.HOME.equals(((Mutable) o).message)) {
                viewModel.setMainData(((HomeResponse) (mutable).object).getMainData());
                mainActivity().navigationDrawerView.menuViewModel.setMainData(viewModel.getMainData());
            }
        });

    }

    @Override
    public void onResume() {
        viewModel.getRepository().setLiveData(viewModel.liveData);
        super.onResume();
        mainActivity().enableRefresh(false);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.ORDER_DETAILS_REQUEST) {
            viewModel.getOrderAdapter().getPostDataList().clear();
            viewModel.notifyChange(BR.orderAdapter);
            viewModel.getRepository().setLiveData(viewModel.liveData);
            viewModel.homeOrders();
        }
    }
}
