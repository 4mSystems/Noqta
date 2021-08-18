package grand.app.aber_provider.pages.auth.countries.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.auth.countries.models.CountriesData;
import grand.app.aber_provider.utils.Constants;

public class CountriesItemViewModels extends BaseViewModel {
    CountriesData countriesData;

    public CountriesItemViewModels(CountriesData countriesData) {
        this.countriesData = countriesData;
    }

    @Bindable
    public CountriesData getCountriesData() {
        return countriesData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
