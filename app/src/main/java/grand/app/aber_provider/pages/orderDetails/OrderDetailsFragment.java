package grand.app.aber_provider.pages.orderDetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentOrderDetailsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.orderDetails.models.OrderDetailsResponse;
import grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel;
import grand.app.aber_provider.utils.Constants;

public class OrderDetailsFragment extends BaseFragment {
    @Inject
    OrderDetailsViewModel viewModel;
    FragmentOrderDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_details, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.orderDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.ORDER_DETAILS.equals(((Mutable) o).message)) {
                viewModel.setOrderDetailsMain(((OrderDetailsResponse) (mutable).object).getOrderDetailsMain());
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
