// Generated by Dagger (https://dagger.dev).
package te.app.notta.repository;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.connection.ConnectionHelper;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceRepository_MembersInjector implements MembersInjector<ServiceRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  public ServiceRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
  }

  public static MembersInjector<ServiceRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2) {
    return new ServiceRepository_MembersInjector(connectionHelperProvider, connectionHelperProvider2);
  }

  @Override
  public void injectMembers(ServiceRepository instance) {
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider.get());
    injectConnectionHelper(instance, connectionHelperProvider2.get());
  }

  @InjectedFieldSignature("te.app.notta.repository.ServiceRepository.connectionHelper")
  public static void injectConnectionHelper(ServiceRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
