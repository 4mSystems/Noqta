package grand.app.aber_provider.pages.settings;

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

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentSocialMediaBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class SocialMedia extends BaseFragment {

    private Context context;
    @Inject
    MyAccountSettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSocialMediaBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_social_media, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.TERMS:
//                    MovementHelper.openCustomTabs(context, "https://taa.my-staff.net/terms_condition", getString(R.string.privacy));
                    MovementHelper.startActivity(context, TermsFragment.class.getName(), getResources().getString(R.string.terms), null);
                    break;
                case Constants.ABOUT:
//                    MovementHelper.openCustomTabs(context, "https://taa.my-staff.net/about_us", getString(R.string.about));
                    MovementHelper.startActivity(context, AboutAppFragment.class.getName(), getResources().getString(R.string.about), null);

                    break;
                case Constants.CONTACT:
                    MovementHelper.startActivity(context, ContactUsFragment.class.getName(), getResources().getString(R.string.tv_account_contact), null);
                    break;
                case Constants.SHARE_BAR:
                    AppHelper.shareApp(mainActivity());
                    break;
                case Constants.RATE_APP:
                    AppHelper.rateApp(context);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
