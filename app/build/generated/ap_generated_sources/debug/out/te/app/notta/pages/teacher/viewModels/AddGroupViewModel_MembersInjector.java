// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.teacher.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddGroupViewModel_MembersInjector implements MembersInjector<AddGroupViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public AddGroupViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AddGroupViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new AddGroupViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(AddGroupViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.notta.pages.teacher.viewModels.AddGroupViewModel.repository")
  public static void injectRepository(AddGroupViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
