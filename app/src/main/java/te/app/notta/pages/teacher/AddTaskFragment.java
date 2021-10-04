package te.app.notta.pages.teacher;

import static te.app.notta.utils.upload.FileOperations.videoTime;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import java.io.File;
import java.net.URISyntaxException;

import javax.inject.Inject;

import gun0912.tedbottompicker.TedBottomPicker;
import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.base.ParentActivity;
import te.app.notta.databinding.FragmentAddTaskBinding;
import te.app.notta.databinding.SuccessSheetBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.teacher.viewModels.AddTaskViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;
import te.app.notta.utils.upload.FileOperations;

public class AddTaskFragment extends BaseFragment {
    FragmentAddTaskBinding addTaskBinding;
    @Inject
    AddTaskViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addTaskBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_task, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        addTaskBinding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setEvent();
        return addTaskBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    picImages();
                    break;
                case Constants.PLAY_VIDEO:
                    pickVideo(requireActivity());
                    break;
                case Constants.ADD_TASK:
                    SuccessSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.success_sheet, null, false);
                    BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
                    sheetDialog.setContentView(sortBinding.getRoot());
                    sortBinding.tvHeader.setText(getString(R.string.task_added_successfully));
                    sortBinding.tvDesc.setText(getString(R.string.task_body_added_successfully));
                    sortBinding.btnClose.setOnClickListener(v -> sheetDialog.dismiss());
                    sheetDialog.setOnDismissListener(dialog -> MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GROUP_REQUEST));
                    sheetDialog.show();
                    break;
            }
        });
        ((ParentActivity) requireActivity()).mutableLiveData.observeForever(mutable -> {
            if (mutable.message.equals(Constants.ADD_ONE))
                viewModel.getAddTaskRequest().setPoints((String) mutable.object);
            viewModel.notifyChange(BR.addTaskRequest);
        });
    }

    @SuppressLint("CheckResult")
    private void picImages() {
        if (ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            TedBottomPicker.with(requireActivity())
                    .setPeekHeight(1600)
                    .showTitle(false)
                    .setSpacing(10)
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

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        if (request == Constants.FILE_TYPE_VIDEO) {
            if (videoTime(new File(FileOperations.getPath(requireActivity(), result.getData())), requireActivity()) <= 30) {
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
                new CompressVideo().execute("false", result.getData().toString(), file.getPath());
            } else {
                toastErrorMessage(getString(R.string.video_warning));
            }
        }
        super.launchActivityResult(request, resultCode, result);
    }

    private class CompressVideo extends AsyncTask<String, String, String> {
        Dialog dialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = ProgressDialog.show(requireActivity(), "", getString(R.string.compressing));
        }

        @Override
        protected String doInBackground(String... strings) {
            String videoPath = null;
//            try {
//                Uri uri = Uri.parse(strings[1]);
////                videoPath = SiliCompressor.with(requireActivity()).compressVideo(uri, strings[2], 1280, 720, 1500000);
//            } catch (URISyntaxException e) {
//                e.printStackTrace();
//            }
            return videoPath;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            dialog.dismiss();
            File file = new File(s);
            viewModel.videoPath = file.getPath();
        }
    }
}
