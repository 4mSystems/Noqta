package grand.app.aber_provider.pages.packages.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.packages.adapters.PackagesAdapter;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class PackagesViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    PackagesAdapter packagesAdapter;
    @Inject
    ServicesRepository servicesRepository;

    @Inject
    public PackagesViewModels(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
        this.liveData = new MutableLiveData<>();
        servicesRepository.setLiveData(liveData);
    }

    public void getPackages() {
        compositeDisposable.add(servicesRepository.getPackages());
    }

    public void subscribe(int id) {
        compositeDisposable.add(servicesRepository.subscribe(id));
    }

    @Bindable
    public PackagesAdapter getPackagesAdapter() {
        return this.packagesAdapter == null ? this.packagesAdapter = new PackagesAdapter() : this.packagesAdapter;
    }

    public ServicesRepository getServicesRepository() {
        return servicesRepository;
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

}
