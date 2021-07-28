package grand.app.aber_provider.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.R;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class UserData {

    @SerializedName("image")
    private String image;

    @SerializedName("account_type")
    private String accountType;

    @SerializedName("active")
    private int active;

    @SerializedName("token")
    private String token;

    @SerializedName("phone")
    private String phone;

    @SerializedName("device_token")
    private String deviceToken;

    @SerializedName("name")
    private String name;

    @SerializedName("provider_id")
    private String providerId;

    @SerializedName("id")
    private int id;

    @SerializedName("is_promoted")
    private int isPromoted;

    @SerializedName("job")
    private String job;

    @SerializedName("email")
    private String email;
    @SerializedName("isLiked")
    private boolean isLiked;
    @SerializedName("isDisLiked")
    private boolean isDisLiked;
    @SerializedName("is_follow")
    private boolean is_follow;
    @SerializedName("see_first")
    private boolean see_first;
    private String followBtnText;
    private boolean isFollowVisible;

    public String getImage() {
        return image;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getActive() {
        return active;
    }


    public String getToken() {
        return token;
    }


    public String getPhone() {
        return phone;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public String getName() {
        return name;
    }

    public String getProviderId() {
        return providerId;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public boolean isFollowVisible() {
        return isFollowVisible;
    }

    public void setFollowVisible(boolean followVisible) {
        isFollowVisible = followVisible;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public boolean isDisLiked() {
        return isDisLiked;
    }

    public int getIsPromoted() {
        return isPromoted;
    }

    public String getFollowBtnText() {
        return !TextUtils.isEmpty(followBtnText) ? followBtnText : ResourceManager.getString(R.string.sort);
    }

    public void setFollowBtnText(String followBtnText) {
        this.followBtnText = followBtnText;
    }

    public boolean isIs_follow() {
        return is_follow;
    }

    public void setIs_follow(boolean is_follow) {
        this.is_follow = is_follow;
    }

    public boolean isSee_first() {
        return see_first;
    }

    public void setSee_first(boolean see_first) {
        this.see_first = see_first;
    }
}