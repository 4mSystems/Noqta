package grand.app.aber_provider.pages.home.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.validation.Validate;

public class NewPostRequest {
    @SerializedName("title")
    private String title;
    @SerializedName("content")
    private String content;
    @SerializedName("post_id")
    private String postId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("started_at")
    private String startAt;
    public String filePath;
    public transient String date;
    public transient String time;
    public transient ObservableField<String> titleError = new ObservableField<>();

    public NewPostRequest() {
    }

    public NewPostRequest(String postId) {
        this.postId = postId;
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(title, Constants.FIELD)) {
            titleError.set(Validate.error);
            valid = false;
        }
        return valid;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        titleError.set(null);
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
