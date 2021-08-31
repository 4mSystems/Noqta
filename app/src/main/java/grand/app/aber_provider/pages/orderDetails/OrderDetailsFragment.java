package grand.app.aber_provider.pages.orderDetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

import com.google.gson.Gson;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
import grand.app.aber_provider.utils.services.LocationWorkers;

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
                startUpdateLocation();
            } else if (Constants.REJECT_ORDER.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) (mutable).object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ORDER_DETAILS_REQUEST);
            } else if (Constants.FOLLOW_ORDER.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getOrderDetailsMain()), getString(R.string.user_location), FollowUpOrderFragment.class.getName(), null);
            } else if (Constants.CHANGE_ORDER_STATUS.equals(((Mutable) o).message)) {
                viewModel.getOrderDetailsMain().setStatus(viewModel.getOrderDetailsMain().getStatus() + 1);
                if (viewModel.getOrderDetailsMain().getStatus() == 4) {
                    MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ORDER_DETAILS_REQUEST);
                    cancelUpdateLocation();
                }
                startUpdateLocation();
                toastMessage(((StatusMessage) (mutable).object).mMessage);
                viewModel.notifyChange(BR.orderDetailsMain);
            }
        });
    }

    private boolean isWorkScheduled(List<WorkInfo> workInfo) {
        boolean running = false;
        if (workInfo == null || workInfo.size() == 0) return false;
        for (WorkInfo workStatus : workInfo) {
            running = workStatus.getState() == WorkInfo.State.RUNNING | workStatus.getState() == WorkInfo.State.ENQUEUED;
        }
        return running;
    }

    private void startUpdateLocation() {
        if (viewModel.getOrderDetailsMain().getStatus() >= 1 || viewModel.getOrderDetailsMain().getStatus() >= 3) {
            try {
                if (!isWorkScheduled(WorkManager.getInstance().getWorkInfosByTag(OrderDetailsFragment.class.getName()).get())) {
                    PeriodicWorkRequest periodicWork = new PeriodicWorkRequest.Builder(LocationWorkers.class, 15, TimeUnit.MINUTES)
                            .addTag(OrderDetailsFragment.class.getName())
                            .build();
                    WorkManager.getInstance().enqueueUniquePeriodicWork("Location", ExistingPeriodicWorkPolicy.REPLACE, periodicWork);
                } else {
                    cancelUpdateLocation();
                    startUpdateLocation();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void cancelUpdateLocation() {
        WorkManager.getInstance().cancelAllWorkByTag(OrderDetailsFragment.class.getName());
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
