package te.app.notta.pages.notifications.models;

import com.google.gson.annotations.SerializedName;

public class NotificationsData {

    @SerializedName("image")
    private String image;

    @SerializedName("to_user_id")
    private String toUserId;

    @SerializedName("name")
    private String name;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int id;
    @SerializedName("group_id")
    private int groupId;

    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    @SerializedName("type")
    private String type;

    @SerializedName("from_user_id")
    private String fromUserId;

    public String getImage() {
        return image;
    }

    public String getToUserId() {
        return toUserId;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getType() {
        return type;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public int getGroupId() {
        return groupId;
    }
}