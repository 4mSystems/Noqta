// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.addAnswer.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.repository.GroupRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddAnswerViewModel_MembersInjector implements MembersInjector<AddAnswerViewModel> {
  private final Provider<GroupRepository> repositoryProvider;

  public AddAnswerViewModel_MembersInjector(Provider<GroupRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<AddAnswerViewModel> create(
      Provider<GroupRepository> repositoryProvider) {
    return new AddAnswerViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(AddAnswerViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel.repository")
  public static void injectRepository(AddAnswerViewModel instance, GroupRepository repository) {
    instance.repository = repository;
  }
}
