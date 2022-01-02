// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.pages.home.viewModels.HomeViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<HomeViewModel> viewModelProvider;

  public HomeFragment_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<HomeViewModel> viewModelProvider) {
    return new HomeFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.home.HomeFragment.viewModel")
  public static void injectViewModel(HomeFragment instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
