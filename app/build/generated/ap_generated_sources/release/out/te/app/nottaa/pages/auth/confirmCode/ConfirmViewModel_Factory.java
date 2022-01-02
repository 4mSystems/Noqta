// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.auth.confirmCode;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.nottaa.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConfirmViewModel_Factory implements Factory<ConfirmViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public ConfirmViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ConfirmViewModel get() {
    ConfirmViewModel instance = newInstance(repositoryProvider.get());
    ConfirmViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ConfirmViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new ConfirmViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ConfirmViewModel newInstance(AuthRepository repository) {
    return new ConfirmViewModel(repository);
  }
}
