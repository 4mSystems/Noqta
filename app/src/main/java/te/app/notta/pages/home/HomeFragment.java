package te.app.notta.pages.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentHomeBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.models.HomeResponse;
import te.app.notta.pages.home.viewModels.HomeViewModel;
import te.app.notta.pages.teacher.AddGroupFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class HomeFragment extends BaseFragment {
    FragmentHomeBinding fragmentSplashBinding;
    @Inject
    HomeViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        viewModel.home(1, true);
        setEvent();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.HOME)) {
                viewModel.setHomeData(((HomeResponse) mutable.object).getData());
            } else if (((Mutable) o).message.equals(Constants.ADD_GROUP)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), null, AddGroupFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        if (result != null) {
            viewModel.home(1, false);
        }
        super.launchActivityResult(request, resultCode, result);
    }
}
