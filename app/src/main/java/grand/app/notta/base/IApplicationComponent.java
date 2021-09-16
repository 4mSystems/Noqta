package grand.app.notta.base;

import javax.inject.Singleton;

import dagger.Component;
import grand.app.notta.activity.BaseActivity;
import grand.app.notta.activity.MainActivity;
import grand.app.notta.connection.ConnectionModule;
import grand.app.notta.pages.auth.changePassword.ChangePasswordFragment;
import grand.app.notta.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.notta.pages.auth.forgetPassword.ForgetPasswordFragment;
import grand.app.notta.pages.auth.login.LoginFragment;
import grand.app.notta.pages.auth.register.RegisterFragment;
import grand.app.notta.pages.onBoard.OnBoardFragment;
import grand.app.notta.pages.splash.SplashFragment;
@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);

    void inject(LoginFragment loginFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(RegisterFragment registerFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
