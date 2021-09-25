// Generated by Dagger (https://dagger.dev).
package te.app.notta.pages.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.notta.pages.home.viewModels.GroupDetailsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GroupDetailsFragment_MembersInjector implements MembersInjector<GroupDetailsFragment> {
  private final Provider<GroupDetailsViewModel> viewModelProvider;

  public GroupDetailsFragment_MembersInjector(Provider<GroupDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<GroupDetailsFragment> create(
      Provider<GroupDetailsViewModel> viewModelProvider) {
    return new GroupDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(GroupDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.notta.pages.home.GroupDetailsFragment.viewModel")
  public static void injectViewModel(GroupDetailsFragment instance,
      GroupDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
