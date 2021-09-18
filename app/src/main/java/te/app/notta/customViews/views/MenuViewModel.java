package te.app.notta.customViews.views;

import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;

public class MenuViewModel extends BaseViewModel {

    public void liveDataActions(String action) {
        getLiveData().setValue(new Mutable(action));
    }

}
