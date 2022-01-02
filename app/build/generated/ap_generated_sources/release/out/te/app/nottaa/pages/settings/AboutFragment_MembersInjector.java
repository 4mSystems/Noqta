// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import te.app.nottaa.pages.settings.viewModels.SettingsViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutFragment_MembersInjector implements MembersInjector<AboutFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public AboutFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AboutFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new AboutFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AboutFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.nottaa.pages.settings.AboutFragment.viewModel")
  public static void injectViewModel(AboutFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}