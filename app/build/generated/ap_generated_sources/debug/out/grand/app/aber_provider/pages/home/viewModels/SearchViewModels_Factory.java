// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.home.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModels_Factory implements Factory<SearchViewModels> {
  private final Provider<PostRepository> postRepositoryProvider;

  private final Provider<PostRepository> postRepositoryProvider2;

  public SearchViewModels_Factory(Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    this.postRepositoryProvider = postRepositoryProvider;
    this.postRepositoryProvider2 = postRepositoryProvider2;
  }

  @Override
  public SearchViewModels get() {
    SearchViewModels instance = newInstance(postRepositoryProvider.get());
    SearchViewModels_MembersInjector.injectPostRepository(instance, postRepositoryProvider2.get());
    return instance;
  }

  public static SearchViewModels_Factory create(Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    return new SearchViewModels_Factory(postRepositoryProvider, postRepositoryProvider2);
  }

  public static SearchViewModels newInstance(PostRepository postRepository) {
    return new SearchViewModels(postRepository);
  }
}
