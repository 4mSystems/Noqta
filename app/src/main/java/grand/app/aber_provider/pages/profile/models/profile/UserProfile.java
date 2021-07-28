package grand.app.aber_provider.pages.profile.models.profile;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.pages.home.models.MainData;

public class UserProfile extends UserData {

    @SerializedName("posts")
    private MainData mainData;

    public MainData getMainData() {
        return mainData;
    }

}