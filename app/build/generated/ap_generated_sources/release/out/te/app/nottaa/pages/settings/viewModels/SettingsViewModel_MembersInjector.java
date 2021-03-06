// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.settings.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public SettingsViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new SettingsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(SettingsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.settings.viewModels.SettingsViewModel.repository")
  public static void injectRepository(SettingsViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
