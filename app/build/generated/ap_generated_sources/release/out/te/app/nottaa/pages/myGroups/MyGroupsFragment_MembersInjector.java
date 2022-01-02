// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.myGroups;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.pages.myGroups.viewModels.MyGroupsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyGroupsFragment_MembersInjector implements MembersInjector<MyGroupsFragment> {
  private final Provider<MyGroupsViewModel> viewModelProvider;

  public MyGroupsFragment_MembersInjector(Provider<MyGroupsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MyGroupsFragment> create(
      Provider<MyGroupsViewModel> viewModelProvider) {
    return new MyGroupsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MyGroupsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.myGroups.MyGroupsFragment.viewModel")
  public static void injectViewModel(MyGroupsFragment instance, MyGroupsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
