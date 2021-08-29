package grand.app.aber_provider.pages.auth.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.databinding.FragmentRegisterDocumentsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;
import grand.app.aber_provider.utils.upload.FileOperations;

public class RegisterDocumentsFragment extends BaseFragment {
    @Inject
    RegisterViewModel viewModel;
    FragmentRegisterDocumentsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_documents, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getRequest().setIsCompany(UserHelper.getInstance(requireActivity()).getAccountType());
        }
        setEvent();
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, LauncherHelper.launcherRequest, (request, result) -> {
            if (result)
                pickImageDialogSelect(LauncherHelper.launcherRequest);
        });
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.COMMERCIAL_IMAGE:
                    LauncherHelper.launcherRequest = Constants.COMMERCIAL_REQUEST;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.TAX_CARD_PHOTO:
                    LauncherHelper.launcherRequest = Constants.TAX_REQUEST;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.NATIONAL_ID_PHOTO:
                    LauncherHelper.launcherRequest = Constants.IDENTITY_REQUEST;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.PASSPORT_PHOTO:
                    LauncherHelper.launcherRequest = Constants.PASSPORT_REQUEST;
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.REGISTER:
                    toastMessage(((StatusMessage) ((Mutable) o).object).mMessage);
                    finishActivity();
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getPassingObject().getObject()), getString(R.string.register), RegisterServicesFragment.class.getName(), null);
                    break;
            }
        });

    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null) {
            FileObject fileObject = null;
            if (request == Constants.COMMERCIAL_REQUEST) {
                viewModel.getRequest().setLicence_image(getString(R.string.commercial_selected));
                fileObject = FileOperations.getFileObject(requireActivity(), result, Constants.COMMERCIAL_IMAGE, Constants.FILE_TYPE_IMAGE);
            } else if (request == Constants.TAX_REQUEST) {
                viewModel.getRequest().setTax_image(getString(R.string.tax_selected));
                fileObject = FileOperations.getFileObject(requireActivity(), result, Constants.TAX_CARD_PHOTO, Constants.FILE_TYPE_IMAGE);
            } else if (request == Constants.IDENTITY_REQUEST) {
                viewModel.getRequest().setIdentity_image(getString(R.string.national_selected));
                fileObject = FileOperations.getFileObject(requireActivity(), result, Constants.NATIONAL_ID_PHOTO, Constants.FILE_TYPE_IMAGE);
            } else if (request == Constants.PASSPORT_REQUEST) {
                viewModel.getRequest().setPassport_image(getString(R.string.passport_selected));
                fileObject = FileOperations.getFileObject(requireActivity(), result, Constants.PASSPORT_PHOTO, Constants.FILE_TYPE_IMAGE);
            }
            viewModel.getFileObject().add(fileObject);
            viewModel.notifyChange(BR.request);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
