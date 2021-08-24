package grand.app.aber_provider.pages.settings.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.utils.Constants;

public class ItemContactViewModel extends BaseViewModel {
    public String contact;

    public ItemContactViewModel(String contact) {
        this.contact = contact;
    }

    @Bindable
    public String getContact() {
        return contact;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
