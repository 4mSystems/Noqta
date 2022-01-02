// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.auth.forgetPassword;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForgetPasswordViewModel_MembersInjector implements MembersInjector<ForgetPasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ForgetPasswordViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ForgetPasswordViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new ForgetPasswordViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ForgetPasswordViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.auth.forgetPassword.ForgetPasswordViewModel.repository")
  public static void injectRepository(ForgetPasswordViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
