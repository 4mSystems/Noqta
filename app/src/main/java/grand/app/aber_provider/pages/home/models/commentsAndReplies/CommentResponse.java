package grand.app.aber_provider.pages.home.models.commentsAndReplies;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class CommentResponse extends StatusMessage {

    @SerializedName("data")
    private Comments comments;

    public Comments getComments() {
        return comments;
    }

}