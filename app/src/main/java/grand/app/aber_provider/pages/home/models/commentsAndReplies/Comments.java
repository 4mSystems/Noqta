package grand.app.aber_provider.pages.home.models.commentsAndReplies;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class Comments {

    @SerializedName("replies")
    private String replies;
    @SerializedName("all_replies")
    private CommentsPaginate commentsPaginate;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("text")
    private String text;
    @SerializedName("image")
    private String image;

    @SerializedName("user")
    private UserData user;

    @SerializedName("likes")
    private String likes;
    @SerializedName("isLiked")
    private boolean isLiked;
    @SerializedName("id")
    private int id;
    private int postId;
    private boolean isVisible;

    public int getId() {
        return id;
    }

    public String getReplies() {
        if (replies != null) {
            if (Math.abs(Double.parseDouble(replies) / 1000000000) >= 1) {
                return (Double.parseDouble(replies) / 1000000000) + " " + ResourceManager.getString(R.string.billion);
            } else if (Math.abs(Double.parseDouble(replies) / 1000000) >= 1) {
                return (Double.parseDouble(replies) / 1000000) + " " + ResourceManager.getString(R.string.million);
            } else if (Math.abs(Double.parseDouble(replies) / 1000) >= 1) {
                return (Double.parseDouble(replies) / 1000) + " " + ResourceManager.getString(R.string.mark);
            } else
                return !replies.equals("0") ? replies : "";
        }
        return "";
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public UserData getUser() {
        return user;
    }

    public String getLikes() {
        if (likes != null) {
            if (Math.abs(Double.parseDouble(likes) / 1000000000) >= 1) {
                return (Double.parseDouble(likes) / 1000000000) + " " + ResourceManager.getString(R.string.billion);
            } else if (Math.abs(Double.parseDouble(likes) / 1000000) >= 1) {
                return (Double.parseDouble(likes) / 1000000) + " " + ResourceManager.getString(R.string.million);
            } else if (Math.abs(Double.parseDouble(likes) / 1000) >= 1) {
                return (Double.parseDouble(likes) / 1000) + " " + ResourceManager.getString(R.string.mark);
            } else
                return likes;
        }
        return "";
    }

    public void setReplies(String replies) {
        this.replies = replies;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getImage() {
        return image;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public CommentsPaginate getCommentsPaginate() {
        return commentsPaginate;
    }
}