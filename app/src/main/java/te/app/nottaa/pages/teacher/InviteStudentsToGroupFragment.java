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
import te.app.nottaa.databinding.FragmentInviteStudentBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.teacher.models.inviteStudents.StudentsResponse;
import te.app.nottaa.pages.teacher.viewModels.AddGroupViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

public class InviteStudentsToGroupFragment extends BaseFragment {
    FragmentInviteStudentBinding binding;
    @Inject
    AddGroupViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_invite_student, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.getStudent(1, true, "");
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.STUDENT)) {
                viewModel.setStudentMainData(((StudentsResponse) mutable.object).getStudentMainData());
            } else if (((Mutable) o).message.equals(Constants.SEND_INVITATIONS)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST);
            }
        });
        binding.rcStudents.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getStudentMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getInviteStudentsAdapter().getGroupItemList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.getStudent((viewModel.getStudentMainData().getCurrentPage() + 1), false, viewModel.searchText);
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
