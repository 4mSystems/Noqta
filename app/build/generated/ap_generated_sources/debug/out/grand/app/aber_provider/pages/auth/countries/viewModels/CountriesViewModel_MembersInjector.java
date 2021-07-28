// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.auth.countries.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.repository.AuthRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CountriesViewModel_MembersInjector implements MembersInjector<CountriesViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public CountriesViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<CountriesViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new CountriesViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(CountriesViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.auth.countries.viewModels.CountriesViewModel.repository")
  public static void injectRepository(CountriesViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}