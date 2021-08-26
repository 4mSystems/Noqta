package grand.app.aber_provider.pages.myOrders.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.OrderAdapter;
import grand.app.aber_provider.pages.myOrders.models.MyOrdersMain;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class MyOrdersViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrderAdapter orderAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    MyOrdersMain myOrdersMain;

    @Inject
    public MyOrdersViewModels(ServicesRepository postRepository) {
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void myOrders(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.myOrders(page, showProgress, getPassingObject().getId()));
    }

    @Bindable
    public MyOrdersMain getMyOrdersMain() {
        return myOrdersMain;
    }

    @Bindable
    public void setMyOrdersMain(MyOrdersMain myOrdersMain) {
        getOrderAdapter().update(myOrdersMain.getOrdersList());
        notifyChange(BR.orderAdapter);
        notifyChange(BR.myOrdersMain);
        this.myOrdersMain = myOrdersMain;
    }

    @Bindable
    public OrderAdapter getOrderAdapter() {
        return this.orderAdapter == null ? this.orderAdapter = new OrderAdapter() : this.orderAdapter;
    }

    public ServicesRepository getPostRepository() {
        return postRepository;
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
