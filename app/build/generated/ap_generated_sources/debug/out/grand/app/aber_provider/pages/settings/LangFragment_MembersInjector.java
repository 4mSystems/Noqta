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
public final class LangFragment_MembersInjector implements MembersInjector<LangFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public LangFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<LangFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new LangFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(LangFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.settings.LangFragment.viewModel")
  public static void injectViewModel(LangFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}