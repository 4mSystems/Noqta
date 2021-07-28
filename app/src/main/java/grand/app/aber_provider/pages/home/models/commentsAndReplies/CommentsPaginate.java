package grand.app.aber_provider.pages.home.models.commentsAndReplies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.PaginateMain;

public class CommentsPaginate extends PaginateMain {
    @SerializedName("data")
    private List<Comments> comments;

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
