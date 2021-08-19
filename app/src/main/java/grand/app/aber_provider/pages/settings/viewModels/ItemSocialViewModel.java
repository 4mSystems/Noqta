package grand.app.aber_provider.pages.settings.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.settings.models.SocialMediaData;
import grand.app.aber_provider.utils.Constants;


public class ItemSocialViewModel extends BaseViewModel {
    public SocialMediaData socialMediaData;

    public ItemSocialViewModel(SocialMediaData socialMediaData) {
        this.socialMediaData = socialMediaData;
    }

    @Bindable
    public SocialMediaData getSocialMediaData() {
        return socialMediaData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
