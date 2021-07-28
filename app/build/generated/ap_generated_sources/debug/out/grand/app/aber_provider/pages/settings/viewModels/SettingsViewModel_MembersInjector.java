// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.settings.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.repository.SettingsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<SettingsRepository> repositoryProvider;

  public SettingsViewModel_MembersInjector(Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<SettingsRepository> repositoryProvider) {
    return new SettingsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(SettingsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel.repository")
  public static void injectRepository(SettingsViewModel instance, SettingsRepository repository) {
    instance.repository = repository;
  }
}