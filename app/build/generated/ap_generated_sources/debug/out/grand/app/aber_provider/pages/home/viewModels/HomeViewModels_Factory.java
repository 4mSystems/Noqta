// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.home.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModels_Factory implements Factory<HomeViewModels> {
  private final Provider<PostRepository> postRepositoryProvider;

  private final Provider<PostRepository> postRepositoryProvider2;

  public HomeViewModels_Factory(Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    this.postRepositoryProvider = postRepositoryProvider;
    this.postRepositoryProvider2 = postRepositoryProvider2;
  }

  @Override
  public HomeViewModels get() {
    HomeViewModels instance = newInstance(postRepositoryProvider.get());
    HomeViewModels_MembersInjector.injectPostRepository(instance, postRepositoryProvider2.get());
    return instance;
  }

  public static HomeViewModels_Factory create(Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    return new HomeViewModels_Factory(postRepositoryProvider, postRepositoryProvider2);
  }

  public static HomeViewModels newInstance(PostRepository postRepository) {
    return new HomeViewModels(postRepository);
  }
}