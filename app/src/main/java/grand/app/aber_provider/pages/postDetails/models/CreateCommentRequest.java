package grand.app.aber_provider.pages.postDetails.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class CreateCommentRequest {
    @SerializedName("post_id")
    private int postId;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("text")
    private String text;
    private int commentId;
    public transient boolean isReply;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(text));
    }
}
