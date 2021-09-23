package te.app.notta.pages.splash;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.model.base.Mutable;
import te.app.notta.R;
import te.app.notta.databinding.FragmentSplashBinding;
import te.app.notta.pages.addAnswer.AddAnswerFragment;
import te.app.notta.pages.auth.login.LoginFragment;
import te.app.notta.pages.onBoard.OnBoardFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;
import te.app.notta.utils.session.UserHelper;

public class SplashFragment extends BaseFragment {
    private Context context;
    FragmentSplashBinding fragmentSplashBinding;
    @Inject
    SplashViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        setEvent();
        viewModel.runSplash();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.HOME)) {
                MovementHelper.startActivityMain(requireActivity());
            } else if (((Mutable) o).message.equals(Constants.BACKGROUND_API)) {
                if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
                    MovementHelper.startActivityBase(requireActivity(), OnBoardFragment.class.getName(), null, null);
                } else {
                    MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
//        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
