package grand.app.notta.pages.home;

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
import grand.app.notta.databinding.FragmentHomeBinding;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.pages.auth.login.LoginFragment;
import grand.app.notta.pages.home.viewModels.HomeViewModel;
import grand.app.notta.utils.helper.MovementHelper;

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
        setEvent();
        return fragmentSplashBinding.getRoot();
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
