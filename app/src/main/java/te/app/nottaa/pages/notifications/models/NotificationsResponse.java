package te.app.nottaa.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class NotificationsResponse extends StatusMessage {

	@SerializedName("data")
	private NotificationsPaginate notificationsPaginate;

	public NotificationsPaginate getNotificationsPaginate(){
		return notificationsPaginate;
	}

}