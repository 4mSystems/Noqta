package te.app.nottaa.pages.splash;

import android.content.Context;
import android.content.res.Resources;
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

import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.R;
import te.app.nottaa.databinding.FragmentSplashBinding;
import te.app.nottaa.pages.auth.login.LoginFragment;
import te.app.nottaa.pages.onBoard.OnBoardFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.session.LanguagesHelper;
import te.app.nottaa.utils.session.UserHelper;

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
                    LanguagesHelper.setLanguage(LanguagesHelper.getCurrentLanguage().equals(Resources.getSystem().getConfiguration().locale.getLanguage()) ? Resources.getSystem().getConfiguration().locale.getLanguage() : LanguagesHelper.getCurrentLanguage());
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
