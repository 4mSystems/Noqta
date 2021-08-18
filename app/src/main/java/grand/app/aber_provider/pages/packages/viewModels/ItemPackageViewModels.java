package grand.app.aber_provider.pages.packages.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.packages.models.PackagesData;
import grand.app.aber_provider.utils.Constants;

public class ItemPackageViewModels extends BaseViewModel {
    public PackagesData packagesData;

    public ItemPackageViewModels(PackagesData packagesData) {
        this.packagesData = packagesData;
    }

    @Bindable
    public PackagesData getPackagesData() {
        return packagesData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
