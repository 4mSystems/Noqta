package te.app.nottaa.customViews.views;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.model.base.Mutable;

public class MenuViewModel extends BaseViewModel {

    public void liveDataActions(String action) {
        getLiveData().setValue(new Mutable(action));
    }

}
