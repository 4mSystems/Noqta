package te.app.nottaa.pages.notifications.itemViewModels;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.notifications.models.NotificationsData;
import te.app.nottaa.utils.Constants;


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
