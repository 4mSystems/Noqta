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

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.databinding.FragmentMyAccountSettingsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.auth.countries.CountriesFragment;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.pages.packages.PackagesFragment;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.profile.QuestionsRequestFragment;
import grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.pages.myOrders.MyServiceOrderDetailsFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;

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
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.QUESTIONS:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(URLS.NOT_ANSWERED_QUESTIONED_POSTS), getString(R.string.account_questions), QuestionsRequestFragment.class.getName(), null);
                    break;
                case Constants.MENU_LIVE:
                    MovementHelper.startActivity(context, PackagesFragment.class.getName(), getResources().getString(R.string.menuFavorite), null);
                    break;
                case Constants.INSTURCTOR:
                    MovementHelper.startActivity(context, CountriesFragment.class.getName(), getResources().getString(R.string.my_wallet), null);
                    break;
                case Constants.COMPLAINTS:
                    MovementHelper.startActivity(context, ContactUsFragment.class.getName(), getResources().getString(R.string.tv_account_suggest), null);
                    break;
                case Constants.PROFILE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.userData.getId()), null, MyServicesOrdersFragment.class.getName(), null);
                    break;
                case Constants.UPDATE_PROFILE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    UserHelper.getInstance(context).userLogin(((UsersResponse) ((Mutable) o).object).getData());
                    break;
                case Constants.LANGUAGE:
                    MovementHelper.startActivity(context, LangFragment.class.getName(), getString(R.string.lang), null);
                    break;
                case Constants.FOLLOWERS:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(URLS.USER_FOLLOWERS + viewModel.userData.getId()), getString(R.string.my_services), MyServiceOrderDetailsFragment.class.getName(), null);
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
//        ((MainActivity) context).enableRefresh(false);
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
