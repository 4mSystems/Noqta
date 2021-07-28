package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.CommentsPaginate;

public class PostData {

    @SerializedName("id")
    private int id;
    @SerializedName("type")
    private String type;
    @SerializedName("file")
    private String file;

    @SerializedName("share")
    private int share;

    @SerializedName("title")
    private String title;

    @SerializedName("user")
    private UserData user;
    private UserData userProfile;

    @SerializedName("content")
    private String content;

    @SerializedName("all_reacts")
    private int all_reacts;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("isLiked")
    private boolean isLiked;
    @SerializedName("isDisLiked")
    private boolean isDisLiked;

    private boolean deleted;
    private boolean isProfile;

    @SerializedName("comments")
    @Expose
    private CommentsPaginate commentsPaginate;
    // live Details
    @SerializedName("live_time")
    private String liveTime;
    @SerializedName("live_stream")
    private int liveStream;

    @SerializedName("lecturer_name")
    private String lecturerName;

    @SerializedName("cost")
    private String cost;

    public String getType() {
        return type;
    }

    public String getFile() {
        return file;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public String getTitle() {
        return title;
    }

    public UserData getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public int getAll_reacts() {
        return all_reacts;
    }

    public void setAll_reacts(int all_reacts) {
        this.all_reacts = all_reacts;
    }

    public int getId() {
        return id;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public boolean isDisLiked() {
        return isDisLiked;
    }

    public void setDisLiked(boolean disLiked) {
        isDisLiked = disLiked;
    }

    public CommentsPaginate getCommentsPaginate() {
        return commentsPaginate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UserData getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserData userProfile) {
        this.userProfile = userProfile;
    }

    public boolean isProfile() {
        return isProfile;
    }

    public void setProfile(boolean profile) {
        isProfile = profile;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public String getCost() {
        return cost;
    }

    public int getLiveStream() {
        return liveStream;
    }
}