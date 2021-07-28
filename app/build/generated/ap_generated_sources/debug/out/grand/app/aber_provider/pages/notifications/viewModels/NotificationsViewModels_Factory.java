// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.notifications.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.SettingsRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationsViewModels_Factory implements Factory<NotificationsViewModels> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider2;

  public NotificationsViewModels_Factory(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.settingsRepositoryProvider2 = settingsRepositoryProvider2;
  }

  @Override
  public NotificationsViewModels get() {
    NotificationsViewModels instance = newInstance(settingsRepositoryProvider.get());
    NotificationsViewModels_MembersInjector.injectSettingsRepository(instance, settingsRepositoryProvider2.get());
    return instance;
  }

  public static NotificationsViewModels_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider2) {
    return new NotificationsViewModels_Factory(settingsRepositoryProvider, settingsRepositoryProvider2);
  }

  public static NotificationsViewModels newInstance(SettingsRepository settingsRepository) {
    return new NotificationsViewModels(settingsRepository);
  }
}
