package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class NewPostResponse extends StatusMessage {
    @SerializedName("data")
    private Orders postData;

    public Orders getPostData() {
        return postData;
    }
}
