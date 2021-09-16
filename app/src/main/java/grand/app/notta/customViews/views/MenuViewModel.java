package grand.app.notta.customViews.views;

import grand.app.notta.base.BaseViewModel;
import grand.app.notta.model.base.Mutable;

public class MenuViewModel extends BaseViewModel {

    public void liveDataActions(String action) {
        getLiveData().setValue(new Mutable(action));
    }

}
