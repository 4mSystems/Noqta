package grand.app.aber_provider.pages.auth.countries.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.auth.countries.models.UserCertificatesItem;


public class CountriesItemViewModels extends BaseViewModel {
    UserCertificatesItem userCertificatesItem;

    public CountriesItemViewModels(UserCertificatesItem userCertificatesItem) {
        this.userCertificatesItem = userCertificatesItem;
    }

    @Bindable
    public UserCertificatesItem getUserCertificatesItem() {
        return userCertificatesItem;
    }


    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
