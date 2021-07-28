package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class UserDocumentsResponse extends StatusMessage {
    @SerializedName("data")
    private UserDocuments data;

    public UserDocuments getData() {
        return data;
    }

}