// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.addAnswer.viewModels;

import dagger.internal.Factory;
import javax.inject.Provider;
import te.app.notta.repository.AuthRepository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddAnswerViewModel_Factory implements Factory<AddAnswerViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public AddAnswerViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public AddAnswerViewModel get() {
    AddAnswerViewModel instance = newInstance(repositoryProvider.get());
    AddAnswerViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static AddAnswerViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new AddAnswerViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static AddAnswerViewModel newInstance(AuthRepository repository) {
    return new AddAnswerViewModel(repository);
  }
}