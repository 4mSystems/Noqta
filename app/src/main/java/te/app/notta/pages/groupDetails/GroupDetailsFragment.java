package te.app.notta.pages.groupDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.DeleteSheetBinding;
import te.app.notta.databinding.FragmentGroupDetailsBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.groupDetails.models.details.GroupDetailsResponse;
import te.app.notta.pages.groupDetails.viewModels.GroupDetailsViewModel;
import te.app.notta.pages.teacher.AddTaskFragment;
import te.app.notta.pages.teacher.StudentRequestsFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class GroupDetailsFragment extends BaseFragment {
    FragmentGroupDetailsBinding groupDetailsBinding;
    @Inject
    GroupDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        groupDetailsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_group_details, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        groupDetailsBinding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.groupDetails();
        }
        setEvent();
        return groupDetailsBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.GROUP_DETAILS)) {
                viewModel.isStudentGroup = true;
                viewModel.setGroupDetails(((GroupDetailsResponse) mutable.object).getGroupDetails());
            } else if (mutable.message.equals(Constants.ADD_TASK)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(viewModel.getGroupDetails().getId()), null, AddTaskFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
            } else if (mutable.message.equals(Constants.STUDENT)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getGroupDetails().getId()), null, GroupStudentFragment.class.getName(), null);
            } else if (mutable.message.equals(Constants.STUDENT_REQUESTS)) {
                if (viewModel.userData.getType().equals("2"))
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getGroupDetails().getId()), null, StudentRequestsFragment.class.getName(), null);
            } else if (mutable.message.equals(Constants.DIALOG_SHOW)) {
                showDeleteDialog(Constants.DELETE_GROUP);
            } else if (mutable.message.equals(Constants.DIALOG_SHOW_LEAVE)) {
                showDeleteDialog(Constants.DIALOG_SHOW_LEAVE);
            } else if (mutable.message.equals(Constants.DELETE_GROUP)) {
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST);
            } else if (mutable.message.equals(Constants.LEAVE_GROUP)) {
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST);
            } else if (mutable.message.equals(Constants.DELETE_TASK)) {
                viewModel.getTasksAdapter().getTasksItemList().remove(viewModel.getTasksAdapter().lastPosition);
                viewModel.getTasksAdapter().notifyDataSetChanged();
                viewModel.notifyChange(BR.tasksAdapter);
            } else if (mutable.message.equals(Constants.JOIN_REQUEST)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getGroupDetails().setJoinSent(1);
                viewModel.notifyChange(BR.groupDetails);
            }
        });
        viewModel.getTasksAdapter().liveData.observeForever(o -> showDeleteDialog(Constants.DELETE_TASK));
    }

    private void showDeleteDialog(String o) {
        DeleteSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.delete_sheet, null, false);
        BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
        sheetDialog.setContentView(sortBinding.getRoot());
        if (o.equals(Constants.DELETE_TASK)) {
            sortBinding.tvHeader.setText(getString(R.string.task_deleted_successfully));
            sortBinding.tvDesc.setText(getString(R.string.task_body_deleted_successfully));
        } else if (o.equals(Constants.DIALOG_SHOW_LEAVE)) {
            sortBinding.tvHeader.setText(getString(R.string.leave_group_successfully));
            sortBinding.tvDesc.setText(getString(R.string.leave_group_body_successfully));
        }
        sortBinding.btnClose.setOnClickListener(v -> sheetDialog.dismiss());
        sortBinding.btnYes.setOnClickListener(v -> {
            if (o.equals(Constants.DELETE_GROUP))
                viewModel.deleteGroup();
            else if (o.equals(Constants.DIALOG_SHOW_LEAVE))
                viewModel.leaveGroup();
            else
                viewModel.deleteTask();
            sheetDialog.dismiss();
        });
        sheetDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null) {
            viewModel.groupDetails();
        }
    }
}
