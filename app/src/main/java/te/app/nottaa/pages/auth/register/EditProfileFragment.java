package te.app.nottaa.pages.auth.register;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import java.io.File;

import javax.inject.Inject;

import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.databinding.FragmentEditProfileBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.auth.changePassword.ChangePasswordFragment;
import te.app.nottaa.pages.auth.models.UsersResponse;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.LauncherHelper;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.session.UserHelper;
import te.app.nottaa.utils.upload.FileOperations;

public class EditProfileFragment extends BaseFragment {
    FragmentEditProfileBinding profileBinding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        profileBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_profile, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        profileBinding.setViewmodel(viewModel);
        setEvent();
        return profileBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.UPDATE_PROFILE:
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    MovementHelper.startActivityMain(requireContext());
                    break;
                case Constants.CHANGE_PASSWORD:
                    MovementHelper.startActivity(requireActivity(), ChangePasswordFragment.class.getName(), null, null);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
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
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            profileBinding.memberProfile.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
        }
    }
}
