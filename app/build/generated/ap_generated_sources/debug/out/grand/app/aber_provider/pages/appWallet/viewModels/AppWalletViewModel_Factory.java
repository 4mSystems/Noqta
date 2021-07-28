// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.appWallet.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.SettingsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppWalletViewModel_Factory implements Factory<AppWalletViewModel> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider2;

  public AppWalletViewModel_Factory(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.settingsRepositoryProvider2 = settingsRepositoryProvider2;
  }

  @Override
  public AppWalletViewModel get() {
    AppWalletViewModel instance = newInstance(settingsRepositoryProvider.get());
    AppWalletViewModel_MembersInjector.injectSettingsRepository(instance, settingsRepositoryProvider2.get());
    return instance;
  }

  public static AppWalletViewModel_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    return new AppWalletViewModel_Factory(settingsRepositoryProvider, settingsRepositoryProvider2);
  }

  public static AppWalletViewModel newInstance(SettingsRepository settingsRepository) {
    return new AppWalletViewModel(settingsRepository);
  }
}
