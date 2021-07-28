package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class ReactPostRequest {
    @SerializedName("post_id")
    int postId;
    @SerializedName("react")
    String react;

    public ReactPostRequest(int postId, String react) {
        this.postId = postId;
        this.react = react;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getReact() {
        return react;
    }

    public void setReact(String react) {
        this.react = react;
    }
}
