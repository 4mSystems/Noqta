// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.profile.viewModels;

import dagger.internal.Factory;
import grand.app.aber_provider.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProfilePostsViewModels_Factory implements Factory<ProfilePostsViewModels> {
  private final Provider<PostRepository> postRepositoryProvider;

  private final Provider<PostRepository> postRepositoryProvider2;

  public ProfilePostsViewModels_Factory(Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    this.postRepositoryProvider = postRepositoryProvider;
    this.postRepositoryProvider2 = postRepositoryProvider2;
  }

  @Override
  public ProfilePostsViewModels get() {
    ProfilePostsViewModels instance = newInstance(postRepositoryProvider.get());
    ProfilePostsViewModels_MembersInjector.injectPostRepository(instance, postRepositoryProvider2.get());
    return instance;
  }

  public static ProfilePostsViewModels_Factory create(
      Provider<PostRepository> postRepositoryProvider,
      Provider<PostRepository> postRepositoryProvider2) {
    return new ProfilePostsViewModels_Factory(postRepositoryProvider, postRepositoryProvider2);
  }

  public static ProfilePostsViewModels newInstance(PostRepository postRepository) {
    return new ProfilePostsViewModels(postRepository);
  }
}
