package grand.app.aber_provider.pages.profile.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class ItemPeopleViewModel extends BaseViewModel {
    public UserData peopleData;

    public ItemPeopleViewModel(UserData peopleData) {
        this.peopleData = peopleData;
    }

    @Bindable
    public UserData getPeopleData() {
        return peopleData;
    }

    public void itemAction() {
        if (getPeopleData().getFollowBtnText().equals(ResourceManager.getString(R.string.sort)))
            getLiveData().setValue(Constants.FOLLOW);
        else if (getPeopleData().getFollowBtnText().equals(ResourceManager.getString(R.string.ordinary_wash)))
            getLiveData().setValue(Constants.CANCEL_FOLLOWER);
        else if (getPeopleData().getFollowBtnText().equals(ResourceManager.getString(R.string.tire_desc)))
            getLiveData().setValue(Constants.CANCEL_FOLLOWING);

    }

    public void userProfile() {
        getLiveData().setValue(Constants.PROFILE);
    }
}
