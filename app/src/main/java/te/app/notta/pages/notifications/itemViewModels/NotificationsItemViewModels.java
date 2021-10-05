package te.app.notta.pages.notifications.itemViewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.notifications.models.NotificationsData;
import te.app.notta.utils.Constants;


public class NotificationsItemViewModels extends BaseViewModel {
    NotificationsData notificationsData;

    public NotificationsItemViewModels(NotificationsData notificationsData) {
        this.notificationsData = notificationsData;
    }

    @Bindable
    public NotificationsData getNotificationsData() {
        return notificationsData;
    }


    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
