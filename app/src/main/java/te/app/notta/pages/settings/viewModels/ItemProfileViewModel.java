package te.app.notta.pages.settings.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.home.models.details.StudentsItem;
import te.app.notta.pages.settings.models.ProfileItem;
import te.app.notta.utils.Constants;

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
