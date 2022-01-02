package te.app.nottaa.pages.settings.viewModels;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.settings.models.ProfileItem;
import te.app.nottaa.utils.Constants;

public class ItemProfileViewModel extends BaseViewModel {
    public ProfileItem profileItem;

    public ItemProfileViewModel(ProfileItem profileItem) {
        this.profileItem = profileItem;
    }

    @Bindable
    public ProfileItem getProfileItem() {
        return profileItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
}
