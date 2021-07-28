package grand.app.aber_provider.pages.notifications.itemViewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.notifications.models.NotificationsData;
import grand.app.aber_provider.utils.Constants;


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
