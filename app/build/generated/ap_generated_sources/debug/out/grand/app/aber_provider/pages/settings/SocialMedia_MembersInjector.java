// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SocialMedia_MembersInjector implements MembersInjector<SocialMedia> {
  private final Provider<MyAccountSettingsViewModel> viewModelProvider;

  public SocialMedia_MembersInjector(Provider<MyAccountSettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SocialMedia> create(
      Provider<MyAccountSettingsViewModel> viewModelProvider) {
    return new SocialMedia_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SocialMedia instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.settings.SocialMedia.viewModel")
  public static void injectViewModel(SocialMedia instance, MyAccountSettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
