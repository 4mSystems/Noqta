package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.Orders;

public class PostDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private Orders postData;

    public Orders getPostData() {
        return postData;
    }

}