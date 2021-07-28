package grand.app.aber_provider.pages.profile.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.PaginateMain;
import grand.app.aber_provider.pages.auth.models.UserData;

public class MainFollowersData extends PaginateMain {

    @SerializedName("data")
    private List<UserData> userDataList;

    public List<UserData> getUserDataList() {
        return userDataList;
    }

}