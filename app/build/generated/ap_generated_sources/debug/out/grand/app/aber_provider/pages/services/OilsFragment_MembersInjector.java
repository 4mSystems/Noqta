// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.services;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.services.viewModels.ServicesViewModels;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OilsFragment_MembersInjector implements MembersInjector<OilsFragment> {
  private final Provider<ServicesViewModels> viewModelProvider;

  public OilsFragment_MembersInjector(Provider<ServicesViewModels> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<OilsFragment> create(
      Provider<ServicesViewModels> viewModelProvider) {
    return new OilsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(OilsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.services.OilsFragment.viewModel")
  public static void injectViewModel(OilsFragment instance, ServicesViewModels viewModel) {
    instance.viewModel = viewModel;
  }
}