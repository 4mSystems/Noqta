// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.home.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.repository.ServicesRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModels_MembersInjector implements MembersInjector<HomeViewModels> {
  private final Provider<ServicesRepository> postRepositoryProvider;

  public HomeViewModels_MembersInjector(Provider<ServicesRepository> postRepositoryProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
  }

  public static MembersInjector<HomeViewModels> create(
      Provider<ServicesRepository> postRepositoryProvider) {
    return new HomeViewModels_MembersInjector(postRepositoryProvider);
  }

  @Override
  public void injectMembers(HomeViewModels instance) {
    injectPostRepository(instance, postRepositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.home.viewModels.HomeViewModels.postRepository")
  public static void injectPostRepository(HomeViewModels instance,
      ServicesRepository postRepository) {
    instance.postRepository = postRepository;
  }
}
