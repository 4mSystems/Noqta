package grand.app.aber_provider.pages.auth.register;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.tabs.TabLayout;

import java.io.File;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.databinding.FragmentRegisterBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;
import grand.app.aber_provider.utils.upload.FileOperations;

public class RegisterFragment extends BaseFragment {
    @Inject
    RegisterViewModel viewModel;
    FragmentRegisterBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getRequest().setIsCompany("0");
        UserHelper.getInstance(requireActivity()).addJwt(null);
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    viewModel.getRequest().setIsCompany("0");
                } else if (tab.getPosition() == 1) {
                    viewModel.getRequest().setIsCompany("1");
                }
                viewModel.notifyChange(BR.request);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setEvent();
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, Constants.FILE_TYPE_IMAGE, (request, result) -> {
            if (result)
                pickImageDialogSelect(request);
        });
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
                case Constants.REGISTER:
                    toastMessage(((UsersResponse) ((Mutable) o).object).mMessage);
                    finishActivity();
                    UserHelper.getInstance(requireActivity()).addJwt(((UsersResponse) ((Mutable) o).object).getData().getToken());
                    UserHelper.getInstance(requireActivity()).addAccountType(viewModel.getRequest().getIsCompany());
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getRequest().getPhone()), getString(R.string.register), RegisterDocumentsFragment.class.getName(), null);
                    break;
                case Constants.PICK_UP_LOCATION:
                    MovementHelper.startMapActivityForResultWithBundle(requireActivity(), new PassingObject(), getString(R.string.choose_location), Constants.LOCATION_REQUEST);
                    break;

            }
        });

    }


    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            viewModel.getRequest().setUser_image(fileObject.getFilePath());
            binding.userImg.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
        } else if (request == Constants.LOCATION_REQUEST) {
            viewModel.getRequest().setAddress(result.getStringExtra(Constants.ADDRESS));
            viewModel.getRequest().setLatitude(String.valueOf(result.getDoubleExtra(Constants.LAT, 0.0)));
            viewModel.getRequest().setLongitude(String.valueOf(result.getDoubleExtra(Constants.LNG, 0.0)));
            viewModel.notifyChange(BR.request);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
