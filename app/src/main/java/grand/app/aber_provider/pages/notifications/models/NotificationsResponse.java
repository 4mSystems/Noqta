package grand.app.aber_provider.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;


public class NotificationsResponse extends StatusMessage {
    @SerializedName("data")
    private NotificationsPaginate notificationsPaginate;

    public NotificationsPaginate getNotificationsPaginate() {
        return notificationsPaginate;
    }
}