package grand.app.aber_provider.pages.auth.countries.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.countries.adapters.CountriesAdapter;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class CountriesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    CountriesAdapter countriesAdapter;

    @Inject
    public CountriesViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);

    }

    public void getCountries() {
        compositeDisposable.add(repository.getCountries());
    }

    public void getCities() {
        compositeDisposable.add(repository.getCities(UserHelper.getInstance(MyApplication.getInstance()).getCountriesData().getId()));
    }

    public void action(String action) {
        if (action.equals(Constants.CITIES)) {
            if (getCountriesAdapter().lastSelected != -1)
                liveData.setValue(new Mutable(Constants.CITIES));
        } else if (action.equals(Constants.HOME)) {
            if (getCountriesAdapter().lastSelected != -1)
                liveData.setValue(new Mutable(Constants.HOME));
        }
    }

    @Bindable
    public CountriesAdapter getCountriesAdapter() {
        return this.countriesAdapter == null ? this.countriesAdapter = new CountriesAdapter() : this.countriesAdapter;
    }

    private void unSubscribeFromObservable() {
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
