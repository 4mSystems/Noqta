package te.app.nottaa.pages.groupDetails;

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

import te.app.nottaa.BR;
import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.DeleteSheetBinding;
import te.app.nottaa.databinding.FragmentGroupDetailsBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.groupDetails.models.details.GroupDetailsResponse;
import te.app.nottaa.pages.groupDetails.viewModels.GroupDetailsViewModel;
import te.app.nottaa.pages.teacher.AddTaskFragment;
import te.app.nottaa.pages.teacher.StudentRequestsFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

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
            } else if (mutable.message.equals(Constants.TAKE_CHANCE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            }
        });
        viewModel.getTasksAdapter().liveData.observeForever(o -> {
            if (o.getObject().equals(Constants.DELETE_TASK))
                showDeleteDialog(Constants.DELETE_TASK);
            else if (o.getObject().equals(Constants.TAKE_CHANCE))
                viewModel.takeChance(o.getId());

        });
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
