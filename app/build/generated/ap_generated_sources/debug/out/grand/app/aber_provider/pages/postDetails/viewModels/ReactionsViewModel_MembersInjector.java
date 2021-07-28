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
public final class ReactionsViewModel_MembersInjector implements MembersInjector<ReactionsViewModel> {
  private final Provider<PostRepository> postRepositoryProvider;

  public ReactionsViewModel_MembersInjector(Provider<PostRepository> postRepositoryProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
  }

  public static MembersInjector<ReactionsViewModel> create(
      Provider<PostRepository> postRepositoryProvider) {
    return new ReactionsViewModel_MembersInjector(postRepositoryProvider);
  }

  @Override
  public void injectMembers(ReactionsViewModel instance) {
    injectPostRepository(instance, postRepositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel.postRepository")
  public static void injectPostRepository(ReactionsViewModel instance,
      PostRepository postRepository) {
    instance.postRepository = postRepository;
  }
}