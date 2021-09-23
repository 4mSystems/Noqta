// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.auth.login;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_MembersInjector implements MembersInjector<LoginViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public LoginViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<LoginViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new LoginViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(LoginViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.notta.pages.auth.login.LoginViewModel.repository")
  public static void injectRepository(LoginViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
