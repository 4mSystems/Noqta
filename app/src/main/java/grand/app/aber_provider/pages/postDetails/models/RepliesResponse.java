package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments;

public class RepliesResponse extends StatusMessage {
    @SerializedName("data")
    private Comments comments;

    public Comments getComments() {
        return comments;
    }
}