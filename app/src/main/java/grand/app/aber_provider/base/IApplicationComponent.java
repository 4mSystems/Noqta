package grand.app.aber_provider.base;

import javax.inject.Singleton;

import dagger.Component;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.activity.MainActivity;
import grand.app.aber_provider.connection.ConnectionModule;
import grand.app.aber_provider.pages.appWallet.AppWalletFragment;
import grand.app.aber_provider.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.aber_provider.pages.auth.countries.CountriesFragment;
import grand.app.aber_provider.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.aber_provider.pages.auth.login.LoginFragment;
import grand.app.aber_provider.pages.auth.register.RegisterDocumentsFragment;
import grand.app.aber_provider.pages.auth.register.RegisterFragment;
import grand.app.aber_provider.pages.auth.register.RegisterServicesFragment;
import grand.app.aber_provider.pages.myLocations.AddPlaceFragment;
import grand.app.aber_provider.pages.myLocations.MyLocationsFragment;
import grand.app.aber_provider.pages.myOrders.MyOrderDetailsFragment;
import grand.app.aber_provider.pages.myOrders.MyOrdersFragment;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.packages.PackagesFragment;
import grand.app.aber_provider.pages.packages.PartServicesFragment;
import grand.app.aber_provider.pages.services.AberBoxFragment;
import grand.app.aber_provider.pages.services.BatteriesFragment;
import grand.app.aber_provider.pages.services.CarCheckFragment;
import grand.app.aber_provider.pages.services.CarWashFragment;
import grand.app.aber_provider.pages.services.ChooseServiceTimeFragment;
import grand.app.aber_provider.pages.services.FragmentConfirmOrder;
import grand.app.aber_provider.pages.services.FuelFragment;
import grand.app.aber_provider.pages.services.HiddenFragment;
import grand.app.aber_provider.pages.services.OilsFragment;
import grand.app.aber_provider.pages.services.OpenCarFragment;
import grand.app.aber_provider.pages.services.TiersFragment;
import grand.app.aber_provider.pages.services.WaterBallonFragment;
import grand.app.aber_provider.pages.services.WinchFragment;
import grand.app.aber_provider.pages.home.SearchFragment;
import grand.app.aber_provider.pages.favorites.FavoritesFragment;
import grand.app.aber_provider.pages.postDetails.LiveDetailsFragment;
import grand.app.aber_provider.pages.packages.ProductDetailsFragment;
import grand.app.aber_provider.pages.home.HomeFragment;
import grand.app.aber_provider.pages.notifications.NotificationsFragment;
import grand.app.aber_provider.pages.onBoard.OnBoardFragment;
import grand.app.aber_provider.pages.postDetails.ReactionsFragment;
import grand.app.aber_provider.pages.postDetails.RepliesFragment;
import grand.app.aber_provider.pages.profile.EditProfileFragment;
import grand.app.aber_provider.pages.profile.ProfilePostsFragment;
import grand.app.aber_provider.pages.profile.QuestionsRequestFragment;
import grand.app.aber_provider.pages.settings.AboutAppFragment;
import grand.app.aber_provider.pages.settings.ContactUsFragment;
import grand.app.aber_provider.pages.settings.LangFragment;
import grand.app.aber_provider.pages.settings.SocialMedia;
import grand.app.aber_provider.pages.settings.MyAccountSettingsFragment;
import grand.app.aber_provider.pages.settings.TermsFragment;
import grand.app.aber_provider.pages.splash.SplashFragment;
import grand.app.aber_provider.pages.myOrders.MyServiceOrderDetailsFragment;
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

    void inject(SearchFragment searchFragment);

    void inject(NotificationsFragment notificationsFragment);

    void inject(MyAccountSettingsFragment myAccountSettingsFragment);

    void inject(EditProfileFragment profileFragment);

    void inject(MyServicesOrdersFragment profileFragment);

    void inject(ProfilePostsFragment profilePostsFragment);

    void inject(ContactUsFragment contactUsFragment);

    void inject(FragmentConfirmOrder previousOrdersFragment);

    void inject(ProductDetailsFragment sendOfferFragment);

    void inject(RepliesFragment repliesFragment);

    void inject(ReactionsFragment reactionsFragment);

    void inject(LangFragment langFragment);

    void inject(MyServiceOrderDetailsFragment appMoneyFragment);

    void inject(FavoritesFragment newPostFragment);

    void inject(WinchFragment liveFragment);

    void inject(LiveDetailsFragment liveDetailsFragment);

    void inject(SocialMedia moreFragment);

    void inject(CountriesFragment instructorFragment);

    void inject(PackagesFragment newLiveFragment);

    void inject(ChooseServiceTimeFragment chooseLiveTimeFragment);

    void inject(CarCheckFragment addAnswerFragment);

    void inject(QuestionsRequestFragment questionsRequestFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(TermsFragment termsFragment);

    void inject(PartServicesFragment partsServicesFragment);

    void inject(CarWashFragment carWashFragment);

    void inject(TiersFragment tiersFragment);

    void inject(OilsFragment oilsFragment);

    void inject(HiddenFragment hiddenFragment);

    void inject(FuelFragment fuelFragment);

    void inject(WaterBallonFragment ballonFragment);

    void inject(OpenCarFragment openCarFragment);

    void inject(BatteriesFragment batteriesFragment);

    void inject(AberBoxFragment aberBoxFragment);

    void inject(MyOrdersFragment myOrdersFragment);

    void inject(MyOrderDetailsFragment myOrderDetailsFragment);

    void inject(AddPlaceFragment addPlaceFragment);

    void inject(MyLocationsFragment myLocationsFragment);

    void inject(AppWalletFragment appWalletFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
