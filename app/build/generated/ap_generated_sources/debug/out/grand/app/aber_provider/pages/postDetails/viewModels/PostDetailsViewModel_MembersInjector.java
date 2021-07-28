// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.postDetails.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.repository.PostRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostDetailsViewModel_MembersInjector implements MembersInjector<PostDetailsViewModel> {
  private final Provider<PostRepository> postRepositoryProvider;

  public PostDetailsViewModel_MembersInjector(Provider<PostRepository> postRepositoryProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
  }

  public static MembersInjector<PostDetailsViewModel> create(
      Provider<PostRepository> postRepositoryProvider) {
    return new PostDetailsViewModel_MembersInjector(postRepositoryProvider);
  }

  @Override
  public void injectMembers(PostDetailsViewModel instance) {
    injectPostRepository(instance, postRepositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel.postRepository")
  public static void injectPostRepository(PostDetailsViewModel instance,
      PostRepository postRepository) {
    instance.postRepository = postRepository;
  }
}
