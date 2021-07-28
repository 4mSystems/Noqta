package grand.app.aber_provider.pages.profile.models.profile;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class UserProfileResponse extends StatusMessage {

    @SerializedName("data")
    private UserProfile userProfile;

    public UserProfile getUserProfile() {
        return userProfile;
    }
}