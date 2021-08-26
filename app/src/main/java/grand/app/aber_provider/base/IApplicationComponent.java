package grand.app.aber_provider.base;

import javax.inject.Singleton;

import dagger.Component;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.activity.MainActivity;
import grand.app.aber_provider.connection.ConnectionModule;
import grand.app.aber_provider.pages.appWallet.AppWalletFragment;
import grand.app.aber_provider.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.aber_provider.pages.auth.countries.CitiesFragment;
import grand.app.aber_provider.pages.auth.countries.CountriesFragment;
import grand.app.aber_provider.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.aber_provider.pages.auth.login.LoginFragment;
import grand.app.aber_provider.pages.auth.register.RegisterDocumentsFragment;
import grand.app.aber_provider.pages.auth.register.RegisterFragment;
import grand.app.aber_provider.pages.auth.register.RegisterServicesFragment;
import grand.app.aber_provider.pages.myOrders.FollowUpOrderFragment;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.packages.PackagesFragment;
import grand.app.aber_provider.pages.home.HomeFragment;
import grand.app.aber_provider.pages.notifications.NotificationsFragment;
import grand.app.aber_provider.pages.onBoard.OnBoardFragment;
import grand.app.aber_provider.pages.orderDetails.OrderDetailsFragment;
import grand.app.aber_provider.pages.profile.EditProfileFragment;
import grand.app.aber_provider.pages.settings.AboutAppFragment;
import grand.app.aber_provider.pages.settings.ContactUsFragment;
import grand.app.aber_provider.pages.settings.LangFragment;
import grand.app.aber_provider.pages.settings.SocialMediaFragment;
import grand.app.aber_provider.pages.settings.MyAccountSettingsFragment;
import grand.app.aber_provider.pages.settings.TermsFragment;
import grand.app.aber_provider.pages.splash.SplashFragment;
import grand.app.aber_provider.utils.locations.MapAddressActivity;

//Component refer to an interface or waiter for make an coffee cup to me
@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(MapAddressActivity addressActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);

    void inject(LoginFragment loginFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(RegisterFragment registerFragment);

    void inject(RegisterDocumentsFragment documentsFragment);

    void inject(RegisterServicesFragment registerServicesFragment);

    void inject(HomeFragment normalOrdersFragment);

    void inject(OrderDetailsFragment detailsFragment);

    void inject(NotificationsFragment notificationsFragment);

    void inject(MyAccountSettingsFragment myAccountSettingsFragment);

    void inject(EditProfileFragment profileFragment);

    void inject(MyServicesOrdersFragment profileFragment);

    void inject(ContactUsFragment contactUsFragment);

    void inject(LangFragment langFragment);

    void inject(SocialMediaFragment moreFragment);

    void inject(CountriesFragment instructorFragment);

    void inject(CitiesFragment citiesFragment);

    void inject(PackagesFragment newLiveFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(TermsFragment termsFragment);

    void inject(AppWalletFragment appWalletFragment);

    void inject(FollowUpOrderFragment followUpOrderFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
