package grand.app.aber_provider.pages.profile.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class FollowersResponse extends StatusMessage {
    @SerializedName("data")
    private MainFollowersData mainFollowersData;

    public MainFollowersData getMainFollowersData() {
        return mainFollowersData;
    }

}
