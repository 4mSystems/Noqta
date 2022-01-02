// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.groupDetails;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.pages.groupDetails.viewModels.GroupDetailsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GroupStudentFragment_MembersInjector implements MembersInjector<GroupStudentFragment> {
  private final Provider<GroupDetailsViewModel> viewModelProvider;

  public GroupStudentFragment_MembersInjector(Provider<GroupDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<GroupStudentFragment> create(
      Provider<GroupDetailsViewModel> viewModelProvider) {
    return new GroupStudentFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(GroupStudentFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.groupDetails.GroupStudentFragment.viewModel")
  public static void injectViewModel(GroupStudentFragment instance,
      GroupDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
