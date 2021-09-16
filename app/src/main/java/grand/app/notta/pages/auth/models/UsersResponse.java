package grand.app.notta.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import grand.app.notta.model.base.StatusMessage;

public class UsersResponse extends StatusMessage {
    @SerializedName("data")
    private UserData data;

    public UserData getData() {
        return data;
    }

    public void setData(UserData data) {
        this.data = data;
    }
}