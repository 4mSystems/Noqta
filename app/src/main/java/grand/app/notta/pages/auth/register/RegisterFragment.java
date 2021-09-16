package grand.app.notta.pages.auth.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.notta.R;
import grand.app.notta.base.BaseFragment;
import grand.app.notta.base.IApplicationComponent;
import grand.app.notta.base.MyApplication;
import grand.app.notta.databinding.FragmentRegisterBinding;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.pages.auth.models.UsersResponse;
import grand.app.notta.utils.Constants;
import grand.app.notta.utils.helper.LauncherHelper;
import grand.app.notta.utils.session.UserHelper;

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
//                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getRequest().getPhone()), getString(R.string.register), RegisterDocumentsFragment.class.getName(), null);
                    break;

            }
        });
        for (int i = 0; i < binding.tabs.getTabCount(); i++) {
            View tab = ((ViewGroup) binding.tabs.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(8, 0, 8, 0);
            tab.requestLayout();
        }
    }


    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
//        Log.e("launchActivityResult", "launchActivityResult: "+request );
//        if (request == Constants.FILE_TYPE_IMAGE) {
//            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
//            viewModel.getFileObject().add(fileObject);
//            viewModel.getRequest().setUser_image(fileObject.getFilePath());
//            binding.userImg.setImageURI(Uri.parse(String.valueOf(new File(fileObject.getFilePath()))));
//        } else if (request == Constants.LOCATION_REQUEST) {
//            viewModel.getRequest().setAddress(result.getStringExtra(Constants.ADDRESS));
//            viewModel.getRequest().setLatitude(String.valueOf(result.getDoubleExtra(Constants.LAT, 0.0)));
//            viewModel.getRequest().setLongitude(String.valueOf(result.getDoubleExtra(Constants.LNG, 0.0)));
//            viewModel.notifyChange(BR.request);
//        }
        super.launchActivityResult(request, resultCode, result);

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
