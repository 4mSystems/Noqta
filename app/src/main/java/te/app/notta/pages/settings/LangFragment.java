package te.app.notta.pages.settings;

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
import te.app.notta.databinding.FragmentLangBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.settings.viewModels.SettingsViewModel;
import te.app.notta.pages.splash.SplashFragment;
import te.app.notta.utils.helper.MovementHelper;
import te.app.notta.utils.session.LanguagesHelper;

public class LangFragment extends BaseFragment {
    FragmentLangBinding moreBinding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        moreBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_lang, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        moreBinding.setViewmodel(viewModel);
        setEvent();
        return moreBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            LanguagesHelper.setLanguage(viewModel.lang);
            MovementHelper.startActivityBase(requireActivity(), SplashFragment.class.getName(), null, null);
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
