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
    @SerializedName("follower_id")
    private int followerId;
    @SerializedName("post_id")
    private int post_id;
    @SerializedName("comment_id")
    private int comment_id;

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

    public int getFollowerId() {
        return followerId;
    }

    public int getPost_id() {
        return post_id;
    }

    public int getComment_id() {
        return comment_id;
    }
}