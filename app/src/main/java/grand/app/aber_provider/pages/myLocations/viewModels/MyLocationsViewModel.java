package grand.app.aber_provider.pages.myLocations.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.myLocations.adapters.LocationsAdapters;
import grand.app.aber_provider.pages.myLocations.models.AddLocationRequest;
import grand.app.aber_provider.pages.myLocations.models.LocationsData;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class MyLocationsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    LocationsAdapters locationsAdapters;
    AddLocationRequest addLocationRequest;
    LocationsData locationsData;

    @Inject
    public MyLocationsViewModel(AuthRepository repository) {
        addLocationRequest = new AddLocationRequest();
        locationsData = new LocationsData();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void locations() {
//        compositeDisposable.add(repository.getLocations());
    }

    public void updateMain(int locationId) {
//        compositeDisposable.add(repository.updateMain(locationId));
    }

    public void addPlace() {
        if (getAddLocationRequest().isValid()) {
//            compositeDisposable.add(repository.addLocation(getAddLocationRequest()));
        }
    }

    public void deleteLocation(int locationId) {
//        compositeDisposable.add(repository.deleteLocation(locationId));
    }

    public void toAddPlace() {
        liveData.setValue(new Mutable(Constants.ADD_PLACE));
    }

    public void inputAction(String action) {
        liveData.setValue(new Mutable(action));
    }

    public AddLocationRequest getAddLocationRequest() {
        return addLocationRequest;
    }

    public void setLocationsData(LocationsData locationsData) {
        getAddLocationRequest().setTitle(locationsData.getTitle());
        getAddLocationRequest().setStreet(locationsData.getStreet());
        getAddLocationRequest().setFloor(locationsData.getFloor());
        getAddLocationRequest().setCity_id(locationsData.getCity_id());
        getAddLocationRequest().setRegion_id(locationsData.getRegion_id());
        getAddLocationRequest().setLocation_id(String.valueOf(locationsData.getId()));
        getAddLocationRequest().setLat(locationsData.getLat());
        getAddLocationRequest().setLng(locationsData.getLng());
        notifyChange();
        this.locationsData = locationsData;
    }

    public LocationsData getLocationsData() {
        return locationsData;
    }

    @Bindable
    public LocationsAdapters getLocationsAdapters() {
        return this.locationsAdapters == null ? this.locationsAdapters = new LocationsAdapters() : this.locationsAdapters;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }


    public AuthRepository getRepository() {
        return repository;
    }

}