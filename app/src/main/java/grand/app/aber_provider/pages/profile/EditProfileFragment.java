package grand.app.aber_provider.pages.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.databinding.FragmentEditProfileBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;
import grand.app.aber_provider.utils.upload.FileOperations;

public class EditProfileFragment extends BaseFragment {
    private FragmentEditProfileBinding binding;
    @Inject
    EditProfileViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_edit_profile, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
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
        ((BaseActivity) requireActivity()).enableRefresh(false);
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        LauncherHelper.checkPermission(this, 9, (request, result) -> {
            if (result)
                pickImageDialogSelect();
        });

    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            binding.userImg.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
        }
    }
}