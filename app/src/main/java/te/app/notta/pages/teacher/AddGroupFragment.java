package te.app.notta.pages.teacher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentAddAnswerBinding;
import te.app.notta.databinding.FragmentAddGroupBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel;
import te.app.notta.pages.auth.login.LoginFragment;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel;
import te.app.notta.utils.helper.MovementHelper;

public class AddGroupFragment extends BaseFragment {
    FragmentAddGroupBinding addAnswerBinding;
    @Inject
    AddGroupViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addAnswerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_group, container, false);
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
//            if (((Mutable) o).message.equals(Constants.HOME)) {
//                        MovementHelper.startActivityMain(requireActivity());
//            } else if (((Mutable) o).message.equals(Constants.BACKGROUND_API)) {
//                if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
//                    MovementHelper.startActivityBase(requireActivity(), OnBoardFragment.class.getName(), null, null);
//                } else {
            MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
//                }
//            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
//        viewModel.repository.setLiveData(viewModel.liveData);
    }

}