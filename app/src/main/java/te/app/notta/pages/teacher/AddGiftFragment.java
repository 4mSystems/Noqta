package te.app.notta.pages.teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.connection.FileObject;
import te.app.notta.databinding.FragmentAddGiftBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.viewModels.PointsViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.LauncherHelper;
import te.app.notta.utils.helper.MovementHelper;
import te.app.notta.utils.upload.FileOperations;

public class AddGiftFragment extends BaseFragment {
    FragmentAddGiftBinding addAnswerBinding;
    @Inject
    PointsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addAnswerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_gift, container, false);
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
            if (((Mutable) o).message.equals(Constants.IMAGE)) {
                LauncherHelper.execute(LauncherHelper.storage);
            } else if (((Mutable) o).message.equals(Constants.ADD_GIFT)) {
                LauncherHelper.launcherRequest = Constants.ADD_GIFT_REQUEST;
                MovementHelper.finishWithResult(new PassingObject(), requireActivity(), Constants.ADD_GIFT_REQUEST);
            }
        });
        getParentActivity().mutableLiveData.observeForever(mutable -> {
            if (mutable.message.equals(Constants.ADD_ONE))
                viewModel.getRequest().setPoints((String) mutable.object);
            viewModel.notifyChange(BR.request);
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, Constants.FILE_TYPE_IMAGE, (request, result) -> {
            if (result)
                pickImageDialogSelect(request);
        });
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.fileObjects.add(fileObject);
            viewModel.getRequest().setImage(fileObject.getFile().getName());
            viewModel.notifyChange(BR.request);
        }
        super.launchActivityResult(request, resultCode, result);

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
