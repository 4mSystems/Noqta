package te.app.nottaa.pages.teacher;

import static te.app.nottaa.utils.upload.FileOperations.videoTime;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import javax.inject.Inject;

import gun0912.tedbottompicker.TedBottomPicker;
import te.app.nottaa.BR;
import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.base.ParentActivity;
import te.app.nottaa.databinding.FragmentAddTaskBinding;
import te.app.nottaa.databinding.SuccessSheetBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.teacher.viewModels.AddTaskViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.upload.FileOperations;
import te.app.videocompressor.VideoCompress;

public class AddTaskFragment extends BaseFragment {
    FragmentAddTaskBinding addTaskBinding;
    @Inject
    AddTaskViewModel viewModel;
    ProgressDialog dialog;

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
        initProgress();
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
            if (videoTime(new File(Objects.requireNonNull(FileOperations.getPath(requireActivity(), result.getData()))), requireActivity()) <= 60) {
                compress(FileOperations.getPath(requireActivity(), result.getData()));
            } else {
                toastErrorMessage(getString(R.string.video_warning));
            }
        }
        super.launchActivityResult(request, resultCode, result);
    }

    private void initProgress() {
        dialog = new ProgressDialog(requireContext(), R.style.progressDialog);
        dialog.setTitle(getString(R.string.compressing));
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setCancelable(false);
    }

    private void compress(String filePath) {
        String destPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()
                + File.separator + "VID_" + new SimpleDateFormat("yyyyMMdd_HHmmss", new Locale("en")).format(new Date()) + ".mp4";
        VideoCompress.compressVideoLow(filePath, destPath, new VideoCompress.CompressListener() {
            @Override
            public void onStart() {
                dialog.setProgress(0);
                dialog.show();
            }

            @Override
            public void onSuccess() {
                dialog.dismiss();
                Log.e("onSuccess", "onSuccess: " + destPath);
                Bitmap thumb = ThumbnailUtils.createVideoThumbnail(destPath,
                        MediaStore.Images.Thumbnails.MINI_KIND);
                addTaskBinding.postImg.setImageBitmap(thumb);
                addTaskBinding.postImg.setVisibility(View.VISIBLE);
                viewModel.videoPath.set(destPath);
            }

            @Override
            public void onFail() {
                dialog.dismiss();
            }

            @Override
            public void onProgress(float percent) {
                dialog.setProgress((int) percent);
            }
        });

    }

}
