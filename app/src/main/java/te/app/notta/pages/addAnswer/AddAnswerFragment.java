package te.app.notta.pages.addAnswer;

import static te.app.notta.utils.upload.FileOperations.videoTime;

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
import te.app.notta.utils.upload.FileOperations;
import te.app.videocompressor.VideoCompress;

public class AddAnswerFragment extends BaseFragment {
    FragmentAddAnswerBinding addAnswerBinding;
    @Inject
    AddAnswerViewModel viewModel;
    ProgressDialog dialog;

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
        initProgress();
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
                case Constants.PLAY_VIDEO:
                    pickVideo(requireActivity());
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
//        dialog.setIcon(R.drawable.ic_logo_original);
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
                Bitmap thumb = ThumbnailUtils.createVideoThumbnail(destPath,
                        MediaStore.Images.Thumbnails.MINI_KIND);
                addAnswerBinding.postImg.setImageBitmap(thumb);
                addAnswerBinding.postImg.setVisibility(View.VISIBLE);
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
