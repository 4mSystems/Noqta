package grand.app.aber_provider.pages.myLocations.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.myLocations.models.LocationsData;


public class LocationsItemViewModels extends BaseViewModel {
    LocationsData locationsData;

    public LocationsItemViewModels(LocationsData locationsData) {
        this.locationsData = locationsData;
    }

    @Bindable
    public LocationsData getLocationsData() {
        return locationsData;
    }


    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}