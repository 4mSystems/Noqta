package te.app.nottaa.pages.teacher;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentRequestsBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.groupDetails.models.groupStudents.GroupStudentsResponse;
import te.app.nottaa.pages.groupDetails.viewModels.GroupDetailsViewModel;
import te.app.nottaa.utils.Constants;

public class StudentRequestsFragment extends BaseFragment {
    FragmentRequestsBinding requestsBinding;
    @Inject
    GroupDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        requestsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_requests, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        requestsBinding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        viewModel.groupStudentsRequests(1, true);
        setEvent();
        return requestsBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.STUDENT)) {
                viewModel.setStudentMainData(((GroupStudentsResponse) mutable.object).getData());
            } else if (((Mutable) o).message.equals(Constants.JOIN_REQUEST)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getStudentsRequestsAdapter().removeItem();
            }
        });
        viewModel.getStudentsRequestsAdapter().liveData.observeForever(passingObject -> {
            viewModel.changeStudentRequestStatus(passingObject);
        });
        requestsBinding.rcMembers.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getStudentMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getGroupDetailsStudentsAdapter().getStudentsItemList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.groupStudentsRequests((viewModel.getStudentMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
