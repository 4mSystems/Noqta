// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.auth.countries;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.auth.countries.viewModels.CountriesViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CitiesFragment_MembersInjector implements MembersInjector<CitiesFragment> {
  private final Provider<CountriesViewModel> viewModelProvider;

  public CitiesFragment_MembersInjector(Provider<CountriesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<CitiesFragment> create(
      Provider<CountriesViewModel> viewModelProvider) {
    return new CitiesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(CitiesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.auth.countries.CitiesFragment.viewModel")
  public static void injectViewModel(CitiesFragment instance, CountriesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}