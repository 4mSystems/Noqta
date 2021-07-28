package grand.app.aber_provider.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.PaginateMain;

public class NotificationsPaginate extends PaginateMain {
    @SerializedName("data")
    private List<NotificationsData> notificationsDataList;

    public List<NotificationsData> getNotificationsDataList() {
        return notificationsDataList;
    }
}
