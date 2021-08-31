package grand.app.aber_provider.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

public class NotificationsData {

    @SerializedName("created_at")
    private String created_at;
    @SerializedName("text")
    private String title;
    @SerializedName("id")
    private int id;
    @SerializedName("type")
    private String type;
    @SerializedName("user_id")
    private int user_id;
    @SerializedName("order_id")
    private int orderId;
    @SerializedName("order_service_id")
    private int orderServiceId;

    public String getCreated_at() {
        return created_at;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getOrderServiceId() {
        return orderServiceId;
    }

}