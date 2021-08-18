// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.postDetails.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.ServicesRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostDetailsViewModel_Factory implements Factory<PostDetailsViewModel> {
  private final Provider<ServicesRepository> postRepositoryProvider;

  private final Provider<ServicesRepository> postRepositoryProvider2;

  public PostDetailsViewModel_Factory(Provider<ServicesRepository> postRepositoryProvider,
      Provider<ServicesRepository> postRepositoryProvider2) {
    this.postRepositoryProvider = postRepositoryProvider;
    this.postRepositoryProvider2 = postRepositoryProvider2;
  }

  @Override
  public PostDetailsViewModel get() {
    PostDetailsViewModel instance = newInstance(postRepositoryProvider.get());
    PostDetailsViewModel_MembersInjector.injectPostRepository(instance, postRepositoryProvider2.get());
    return instance;
  }

  public static PostDetailsViewModel_Factory create(
      Provider<ServicesRepository> postRepositoryProvider,
      Provider<ServicesRepository> postRepositoryProvider2) {
    return new PostDetailsViewModel_Factory(postRepositoryProvider, postRepositoryProvider2);
  }

  public static PostDetailsViewModel newInstance(ServicesRepository postRepository) {
    return new PostDetailsViewModel(postRepository);
  }
}
