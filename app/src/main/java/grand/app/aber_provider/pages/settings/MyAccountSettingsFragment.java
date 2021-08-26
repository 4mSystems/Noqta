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

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.databinding.FragmentMyAccountSettingsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.appWallet.AppWalletFragment;
import grand.app.aber_provider.pages.packages.PackagesFragment;
import grand.app.aber_provider.pages.profile.EditProfileFragment;
import grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class MyAccountSettingsFragment extends BaseFragment {

    private Context context;
    @Inject
    MyAccountSettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMyAccountSettingsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_account_settings, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.ABOUT:
                    MovementHelper.startActivity(context, AboutAppFragment.class.getName(), getResources().getString(R.string.about), null);
                    break;
                case Constants.TERMS:
                    MovementHelper.startActivity(context, TermsFragment.class.getName(), getResources().getString(R.string.terms), null);
                    break;
                case Constants.COMPLAINTS:
                case Constants.CONTACT:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(((Mutable) o).message), ResourceManager.getString(R.string.tv_account_contact), ContactUsFragment.class.getName(), null);
                    break;
                case Constants.SOCIAL:
                    MovementHelper.startActivity(context, SocialMediaFragment.class.getName(), ResourceManager.getString(R.string.social_media), null);
                    break;
                case Constants.PROFILE:
                    MovementHelper.startActivity(context, EditProfileFragment.class.getName(), ResourceManager.getString(R.string.profile), null);
                    break;
                case Constants.SUBSCRIPTION:
                    MovementHelper.startActivity(context, PackagesFragment.class.getName(), getString(R.string.package_title), null);
                    break;
                case Constants.WALLET:
                    MovementHelper.startActivity(context, AppWalletFragment.class.getName(), getString(R.string.my_wallet), null);
                    break;
                case Constants.SHOW_LOGOUT_WARNING:
                    exitDialog(getString(R.string.logout_warning));
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
