// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.auth.changePassword;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.AuthRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChangePasswordViewModel_Factory implements Factory<ChangePasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public ChangePasswordViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ChangePasswordViewModel get() {
    ChangePasswordViewModel instance = newInstance(repositoryProvider.get());
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ChangePasswordViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new ChangePasswordViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ChangePasswordViewModel newInstance(AuthRepository repository) {
    return new ChangePasswordViewModel(repository);
  }
}