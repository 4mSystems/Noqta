package grand.app.aber_provider.pages.profile.models.profile;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.auth.models.UserData;

public class UserProfileResponse extends StatusMessage {

    @SerializedName("data")
    private UserData userProfile;

    public UserData getUserProfile() {
        return userProfile;
    }
}