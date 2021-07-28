// Generated by Dagger (https://dagger.dev).
package grand.app.aber_provider.pages.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import grand.app.aber_provider.pages.home.viewModels.SearchViewModels;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<SearchViewModels> viewModelProvider;

  public SearchFragment_MembersInjector(Provider<SearchViewModels> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<SearchFragment> create(
      Provider<SearchViewModels> viewModelProvider) {
    return new SearchFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(SearchFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("grand.app.aber_provider.pages.home.SearchFragment.viewModel")
  public static void injectViewModel(SearchFragment instance, SearchViewModels viewModel) {
    instance.viewModel = viewModel;
  }
}
