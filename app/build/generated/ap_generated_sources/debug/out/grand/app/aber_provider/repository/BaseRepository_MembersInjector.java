// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.repository;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.connection.ConnectionHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseRepository_MembersInjector implements MembersInjector<BaseRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  public BaseRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider) {
    this.connectionHelperProvider = connectionHelperProvider;
  }

  public static MembersInjector<BaseRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider) {
    return new BaseRepository_MembersInjector(connectionHelperProvider);
  }

  @Override
  public void injectMembers(BaseRepository instance) {
    injectConnectionHelper(instance, connectionHelperProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.repository.BaseRepository.connectionHelper")
  public static void injectConnectionHelper(BaseRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}