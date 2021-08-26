package grand.app.aber_provider.pages.auth.models;


import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("image")
    private String image;

    @SerializedName("account_type")
    private String accountType;

    @SerializedName("package_id")
    private String packageId;

    @SerializedName("token")
    private String token;

    @SerializedName("phone")
    private String phone;

    @SerializedName("name")
    private String name;

    @SerializedName("step")
    private int step;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    public String getImage() {
        return image;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getToken() {
        return token;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getStep() {
        return step;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


}