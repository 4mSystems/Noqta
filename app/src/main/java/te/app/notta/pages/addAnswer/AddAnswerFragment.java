package te.app.notta.pages.addAnswer;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import javax.inject.Inject;

import gun0912.tedbottompicker.TedBottomPicker;
import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.databinding.FragmentAddAnswerBinding;
import te.app.notta.databinding.GivePointsSheetBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.addAnswer.models.TaskDetailsResponse;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class AddAnswerFragment extends BaseFragment {
    FragmentAddAnswerBinding addAnswerBinding;
    @Inject
    AddAnswerViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addAnswerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_answer, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        addAnswerBinding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.taskDetails();
        }
        setEvent();
        return addAnswerBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.TASK_DETAILS:
                    viewModel.setTaskDetailsData(((TaskDetailsResponse) mutable.object).getTaskDetailsData());
                    break;
                case Constants.IMAGE:
                    picImages();
                    break;
                case Constants.Add_ANSWER:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST);
                    break;
                case Constants.DIALOG_SHOW:
                    GivePointsSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.give_points_sheet, null, false);
                    BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
                    sheetDialog.setContentView(sortBinding.getRoot());
                    sortBinding.setViewModel(viewModel);
                    sortBinding.btnClose.setOnClickListener(v -> {
                        sheetDialog.dismiss();
                        viewModel.sendPoints();
                    });
                    sheetDialog.show();
                    break;
            }
        });
        ((ParentActivity) requireActivity()).mutableLiveData.observeForever(mutable -> {
            if (mutable.message.equals(Constants.ADD_ONE))
                viewModel.getAddAnswerRequest().setPoints((String) mutable.object);
            viewModel.notifyChange(BR.addAnswerRequest);
        });

    }

    @SuppressLint("CheckResult")
    private void picImages() {
        if (ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            TedBottomPicker.with(requireActivity())
                    .setPeekHeight(1600)
                    .showTitle(false)
                    .setSpacing(4)
                    .setSelectMaxCount(5)
                    .setSelectMaxCountErrorText(R.string.select_max_count_warning)
                    .setCompleteButtonText(getString(R.string.selected))
                    .setEmptySelectionText(getString(R.string.tab_select))
                    .setSelectedUriList(viewModel.getSelectedUri())
                    .showMultiImage(uriList -> viewModel.setSelectedUri(uriList));
        } else {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1007);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
