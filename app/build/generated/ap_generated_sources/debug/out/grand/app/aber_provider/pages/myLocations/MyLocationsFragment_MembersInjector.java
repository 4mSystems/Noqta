// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.myLocations;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyLocationsFragment_MembersInjector implements MembersInjector<MyLocationsFragment> {
  private final Provider<MyLocationsViewModel> viewModelProvider;

  public MyLocationsFragment_MembersInjector(Provider<MyLocationsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MyLocationsFragment> create(
      Provider<MyLocationsViewModel> viewModelProvider) {
    return new MyLocationsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MyLocationsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.myLocations.MyLocationsFragment.viewModel")
  public static void injectViewModel(MyLocationsFragment instance, MyLocationsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
