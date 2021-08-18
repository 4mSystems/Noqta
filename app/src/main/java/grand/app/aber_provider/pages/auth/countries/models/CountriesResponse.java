package grand.app.aber_provider.pages.auth.countries.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;


public class CountriesResponse extends StatusMessage {
    @SerializedName("data")
    private List<CountriesData> countriesDataList;

    public List<CountriesData> getCountriesDataList() {
        return countriesDataList;
    }
}
