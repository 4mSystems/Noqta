package te.app.nottaa.pages.notifications.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.PaginateMain;

public class NotificationsPaginate extends PaginateMain {
    @SerializedName("data")
    private List<NotificationsData> notificationsDataList;

    public List<NotificationsData> getNotificationsDataList() {
        return notificationsDataList;
    }

}