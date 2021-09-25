// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.teacher;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.pages.home.viewModels.PointsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddGiftFragment_MembersInjector implements MembersInjector<AddGiftFragment> {
  private final Provider<PointsViewModel> viewModelProvider;

  public AddGiftFragment_MembersInjector(Provider<PointsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddGiftFragment> create(
      Provider<PointsViewModel> viewModelProvider) {
    return new AddGiftFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddGiftFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.notta.pages.teacher.AddGiftFragment.viewModel")
  public static void injectViewModel(AddGiftFragment instance, PointsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
