package te.app.notta.pages.teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.databinding.FragmentAddGroupBinding;
import te.app.notta.databinding.SuccessSheetBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.teacher.models.AddGroupResponse;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class AddGroupFragment extends BaseFragment {
    FragmentAddGroupBinding addAnswerBinding;
    @Inject
    AddGroupViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addAnswerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_group, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        addAnswerBinding.setViewmodel(viewModel);
        setEvent();
        return addAnswerBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.ADD_GROUP)) {
                SuccessSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.success_sheet, null, false);
                BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
                sheetDialog.setContentView(sortBinding.getRoot());
                sortBinding.btnClose.setOnClickListener(v -> sheetDialog.dismiss());
                sheetDialog.setOnDismissListener(dialog -> {
                    finishActivity();
                    MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(((AddGroupResponse) mutable.object).getGroupItem().getId()), null, InviteStudentsToGroupFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
                });
                sheetDialog.show();
            }
        });
        ((ParentActivity) requireActivity()).mutableLiveData.observeForever(mutable -> {
            if (mutable.message.equals(Constants.ADD_ONE))
                viewModel.getGroupRequest().setNoOfStudents((String) mutable.object);
            else
                viewModel.getGroupRequest().setNoOfTasks((String) mutable.object);
            viewModel.notifyChange(BR.groupRequest);
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST);
        super.launchActivityResult(request, resultCode, result);
    }
}
