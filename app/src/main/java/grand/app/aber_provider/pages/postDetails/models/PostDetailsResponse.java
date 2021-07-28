package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.PostData;

public class PostDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private PostData postData;

    public PostData getPostData() {
        return postData;
    }

}