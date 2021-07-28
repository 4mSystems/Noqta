package grand.app.aber_provider.pages.auth.countries.models;

import com.google.gson.annotations.SerializedName;

public class UserCertificatesItem {

    @SerializedName("img")
    private String img;

    @SerializedName("user_id")
    private int userId;

    @SerializedName("by_who")
    private int byWho;

    @SerializedName("id")
    private int id;
    private boolean isRemoved;

    public UserCertificatesItem() {
    }

    public UserCertificatesItem(String img, boolean isRemoved) {
        this.img = img;
        this.isRemoved = isRemoved;
    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setRemoved(boolean removed) {
        isRemoved = removed;
    }

    public String getImg() {
        return img;
    }

    public int getUserId() {
        return userId;
    }

    public int getByWho() {
        return byWho;
    }

    public int getId() {
        return id;
    }
}