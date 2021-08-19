package grand.app.aber_provider.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.OrderAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class HomeViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrderAdapter orderAdapter;
    @Inject
    ServicesRepository repository;
    MainData mainData;

    @Inject
    public HomeViewModels(ServicesRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void homeOrders() {
        compositeDisposable.add(repository.getHome());
    }

    @Bindable
    public MainData getMainData() {
        return this.mainData == null ? this.mainData = new MainData() : this.mainData;
    }

    public void setMainData(MainData mainData) {
        getOrderAdapter().update(mainData.getOrdersList());
        this.mainData = mainData;
    }

    @Bindable
    public OrderAdapter getOrderAdapter() {
        return this.orderAdapter == null ? this.orderAdapter = new OrderAdapter() : this.orderAdapter;
    }

    public ServicesRepository getRepository() {
        return repository;
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
