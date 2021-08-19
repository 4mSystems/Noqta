package grand.app.aber_provider.pages.home.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.Orders;

public class ItemHomeViewModel extends BaseViewModel {
    public Orders orders;

    public ItemHomeViewModel(Orders orders) {
        this.orders = orders;
    }

    @Bindable
    public Orders getOrders() {
        return orders;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
