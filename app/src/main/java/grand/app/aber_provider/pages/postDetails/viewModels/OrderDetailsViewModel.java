package grand.app.aber_provider.pages.postDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.pages.postDetails.models.OrderDetailsMain;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class OrderDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ServicesRepository postRepository;
    OrderDetailsMain orderDetailsMain;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();

    @Inject
    public OrderDetailsViewModel(ServicesRepository postRepository) {
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void orderDetails() {
        compositeDisposable.add(postRepository.orderDetails(getPassingObject().getId()));
    }

    @Bindable
    public OrderDetailsMain getOrderDetailsMain() {
        return this.orderDetailsMain == null ? this.orderDetailsMain = new OrderDetailsMain() : this.orderDetailsMain;
    }

    public void setOrderDetailsMain(OrderDetailsMain orderDetailsMain) {
        notifyChange(BR.orderDetailsMain);
        this.orderDetailsMain = orderDetailsMain;
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
