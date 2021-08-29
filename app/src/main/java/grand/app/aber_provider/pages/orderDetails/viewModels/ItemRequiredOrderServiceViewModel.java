package grand.app.aber_provider.pages.orderDetails.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.orderDetails.models.SubServices;
import grand.app.aber_provider.utils.Constants;

public class ItemRequiredOrderServiceViewModel extends BaseViewModel {
    public SubServices service;

    public ItemRequiredOrderServiceViewModel(SubServices service) {
        this.service = service;
    }

    @Bindable
    public SubServices getService() {
        return service;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
}
