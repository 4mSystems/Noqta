package grand.app.aber_provider.pages.orderDetails.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.orderDetails.adapters.OptionsDetailsAdapter;
import grand.app.aber_provider.pages.orderDetails.adapters.ServicesRequiredAdapter;
import grand.app.aber_provider.pages.orderDetails.models.ChildServices;
import grand.app.aber_provider.pages.orderDetails.models.OrderDetailsMain;
import grand.app.aber_provider.repository.ServicesRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class OrderDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ServicesRepository postRepository;
    OrderDetailsMain orderDetailsMain;
    ServicesRequiredAdapter servicesRequiredAdapter, extraRequiredAdapter;
    OptionsDetailsAdapter optionsDetailsAdapter;

    @Inject
    public OrderDetailsViewModel(ServicesRepository postRepository) {
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void orderDetails() {
        compositeDisposable.add(postRepository.orderDetails(getPassingObject().getId()));
    }

    public void changeStatus(int status) {
        setMessage(Constants.SHOW_PROGRESS);
        compositeDisposable.add(postRepository.changeStatus(orderDetailsMain.getId(), status));
    }

    public void toFollowOrder() {
        liveData.setValue(new Mutable(Constants.FOLLOW_ORDER));
    }

    @Bindable
    public OrderDetailsMain getOrderDetailsMain() {
        return this.orderDetailsMain == null ? this.orderDetailsMain = new OrderDetailsMain() : this.orderDetailsMain;
    }

    public void setOrderDetailsMain(OrderDetailsMain orderDetailsMain) {
        getServicesRequiredAdapter().update(orderDetailsMain.getSubServices());
        getExtraRequiredAdapter().update(orderDetailsMain.getExtraServices());
        if (!TextUtils.isEmpty(orderDetailsMain.getExtraText())) {
            ChildServices childServices = new ChildServices();
            childServices.setType(Constants.OPEN_CAR);
            childServices.setChild(orderDetailsMain.getExtraText());
            getOptionsDetailsAdapter().getServiceList().add(childServices);
            orderDetailsMain.getChildServices().addAll(getOptionsDetailsAdapter().getServiceList());
        }
        getOptionsDetailsAdapter().update(orderDetailsMain.getChildServices());
        // static map
        orderDetailsMain.setStaticLocationImage("https://maps.googleapis.com/maps/api/staticmap?center=".concat(orderDetailsMain.getLatitude()).concat(",").concat(orderDetailsMain.getLongitude()).concat("&zoom=16&size=400x400&key=").concat(ResourceManager.getString(R.string.google_map)));
        notifyChange(BR.extraRequiredAdapter);
        notifyChange(BR.servicesRequiredAdapter);
        notifyChange(BR.orderDetailsMain);
        this.orderDetailsMain = orderDetailsMain;
    }

    @Bindable
    public ServicesRequiredAdapter getServicesRequiredAdapter() {
        return this.servicesRequiredAdapter == null ? this.servicesRequiredAdapter = new ServicesRequiredAdapter() :
                this.servicesRequiredAdapter;
    }

    @Bindable
    public ServicesRequiredAdapter getExtraRequiredAdapter() {
        return this.extraRequiredAdapter == null ? this.extraRequiredAdapter = new ServicesRequiredAdapter() :
                this.extraRequiredAdapter;
    }

    @Bindable
    public OptionsDetailsAdapter getOptionsDetailsAdapter() {
        return this.optionsDetailsAdapter == null ? this.optionsDetailsAdapter = new OptionsDetailsAdapter() :
                this.optionsDetailsAdapter;
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
