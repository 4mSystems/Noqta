package grand.app.aber_provider.customViews.views;


import androidx.databinding.Bindable;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.settings.adapters.MenuSocialAdapter;

public class MenuViewModel extends BaseViewModel {
    MainData mainData;
    MenuSocialAdapter socialAdapter;
    public void liveDataActions(String action) {
        getLiveData().setValue(new Mutable(action));
    }

    @Bindable
    public MainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(MainData mainData) {
        getSocialAdapter().update(mainData.getSocialMediaDataList());
        notifyChange(BR.socialAdapter);
        notifyChange(BR.mainData);
        this.mainData = mainData;
    }


    @Bindable
    public MenuSocialAdapter getSocialAdapter() {
        return this.socialAdapter == null ? this.socialAdapter = new MenuSocialAdapter() : this.socialAdapter;
    }

}
