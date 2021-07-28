// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TermsFragment_MembersInjector implements MembersInjector<TermsFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public TermsFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<TermsFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new TermsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(TermsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.settings.TermsFragment.viewModel")
  public static void injectViewModel(TermsFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}