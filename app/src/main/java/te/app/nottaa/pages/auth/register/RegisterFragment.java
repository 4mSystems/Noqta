package te.app.nottaa.pages.auth.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.tabs.TabLayout;

import javax.inject.Inject;

import te.app.nottaa.BR;
import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.databinding.FragmentRegisterBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.nottaa.pages.auth.models.SpecialistResponse;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.PopUp.PopUpMenuHelper;
import te.app.nottaa.utils.helper.LauncherHelper;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.upload.FileOperations;

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
                    toastMessage(((StatusMessage) ((Mutable) o).object).mMessage);
                    finishActivity();
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getRequest().getEmail()), null, ConfirmCodeFragment.class.getName(), null);
                    break;
                case Constants.SPECIALIST:
                    viewModel.specialist = ((SpecialistResponse) mutable.object).getSpecialist();
                    break;
                case Constants.POP:
                    showSpecialist();
                    break;

            }
        });
        for (int i = 0; i < binding.tabs.getTabCount(); i++) {
            View tab = ((ViewGroup) binding.tabs.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(8, 0, 8, 0);
            tab.requestLayout();
        }
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    viewModel.getRequest().setType("1");
                } else if (tab.getPosition() == 1) {
                    viewModel.getRequest().setType("2");
                    if (viewModel.specialist.size() == 0)
                        viewModel.getSpecialist();
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
    }

    private void showSpecialist() {
        PopUpMenuHelper.showSpecialistPopUp(requireActivity(), binding.specialist, viewModel.specialist).setOnMenuItemClickListener(item -> {
            viewModel.getRequest().setSpecialistId(String.valueOf(viewModel.specialist.get(item.getItemId()).getId()));
            viewModel.getRequest().setSpecial(viewModel.specialist.get(item.getItemId()).getName());
            viewModel.notifyChange(BR.request);
            return false;
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
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.FILE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            viewModel.getRequest().setFile(fileObject.getFile().getName());
            viewModel.notifyChange(BR.request);
        }
        super.launchActivityResult(request, resultCode, result);

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
