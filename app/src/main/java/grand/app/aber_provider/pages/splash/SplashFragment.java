package grand.app.aber_provider.pages.splash;

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

import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.FragmentSplashBinding;
import grand.app.aber_provider.pages.auth.countries.CountriesFragment;
import grand.app.aber_provider.pages.auth.register.RegisterDocumentsFragment;
import grand.app.aber_provider.pages.auth.register.RegisterFragment;
import grand.app.aber_provider.pages.auth.register.RegisterServicesFragment;
import grand.app.aber_provider.pages.profile.EditProfileFragment;
import grand.app.aber_provider.utils.helper.MovementHelper;

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
//            if (((Mutable) o).message.equals(Constants.HOME)) {
//                MovementHelper.startActivityMain(context);
////                finishAllActivities();
//            } else if (((Mutable) o).message.equals(Constants.BACKGROUND_API)) {
//                if (UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
//                    MovementHelper.startActivityBase(context, OnBoardFragment.class.getName(), null, null);
//                } else {
            MovementHelper.startActivityBase(context, EditProfileFragment.class.getName(), null, null);
//                }

//            }
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