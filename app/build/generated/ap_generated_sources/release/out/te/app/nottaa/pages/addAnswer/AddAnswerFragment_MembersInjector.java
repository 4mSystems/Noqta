// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.addAnswer;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.pages.addAnswer.viewModels.AddAnswerViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddAnswerFragment_MembersInjector implements MembersInjector<AddAnswerFragment> {
  private final Provider<AddAnswerViewModel> viewModelProvider;

  public AddAnswerFragment_MembersInjector(Provider<AddAnswerViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AddAnswerFragment> create(
      Provider<AddAnswerViewModel> viewModelProvider) {
    return new AddAnswerFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AddAnswerFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.addAnswer.AddAnswerFragment.viewModel")
  public static void injectViewModel(AddAnswerFragment instance, AddAnswerViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
