package te.app.nottaa.pages.teacher;

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
import te.app.nottaa.base.ParentActivity;
import te.app.nottaa.databinding.FragmentAddGroupBinding;
import te.app.nottaa.databinding.SuccessSheetBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.teacher.models.AddGroupResponse;
import te.app.nottaa.pages.teacher.viewModels.AddGroupViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

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
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
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
