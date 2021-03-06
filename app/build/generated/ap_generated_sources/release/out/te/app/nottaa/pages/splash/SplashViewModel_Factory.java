// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.splash;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.nottaa.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public SplashViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public SplashViewModel get() {
    SplashViewModel instance = newInstance(repositoryProvider.get());
    SplashViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static SplashViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new SplashViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static SplashViewModel newInstance(AuthRepository repository) {
    return new SplashViewModel(repository);
  }
}
