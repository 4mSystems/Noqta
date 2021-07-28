// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.splash;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<SplashViewModel> viewModelProvider;

  public SplashFragment_MembersInjector(Provider<SplashViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SplashFragment> create(
      Provider<SplashViewModel> viewModelProvider) {
    return new SplashFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.splash.SplashFragment.viewModel")
  public static void injectViewModel(SplashFragment instance, SplashViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
