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

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentOrderDetailsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.myOrders.FollowUpOrderFragment;
import grand.app.aber_provider.pages.orderDetails.models.OrderDetailsResponse;
import grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

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
            } else if (Constants.REJECT_ORDER.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) (mutable).object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ORDER_DETAILS_REQUEST);
            } else if (Constants.FOLLOW_ORDER.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getOrderDetailsMain()), getString(R.string.user_location), FollowUpOrderFragment.class.getName(), null);
            } else if (Constants.CHANGE_ORDER_STATUS.equals(((Mutable) o).message)) {
                viewModel.getOrderDetailsMain().setStatus(viewModel.getOrderDetailsMain().getStatus() + 1);
                if (viewModel.getOrderDetailsMain().getStatus() == 4) {
                    MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ORDER_DETAILS_REQUEST);
                }
                toastMessage(((StatusMessage) (mutable).object).mMessage);
                viewModel.notifyChange(BR.orderDetailsMain);
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
