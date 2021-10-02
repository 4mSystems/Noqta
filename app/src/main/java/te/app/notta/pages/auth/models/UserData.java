package te.app.notta.pages.auth.models;


import com.google.gson.annotations.SerializedName;


public class UserData {

    @SerializedName("image")
    private String image;

    @SerializedName("type")
    private String type;

    @SerializedName("points")
    private String points;

    @SerializedName("token")
    private String token;

    @SerializedName("phone")
    private String phone;

    @SerializedName("name")
    private String name;
    @SerializedName("store")
    private String store;
    @SerializedName("specialist_id")
    private String specialist_id;

    @SerializedName("access_token")
    private String access_token;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;
    @SerializedName("specialist_name")
    private String specialistName;

    public String getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
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

    public String getStore() {
        return store;
    }

    public String getSpecialist_id() {
        return specialist_id;
    }

    public String getAccess_token() {
        return access_token;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSpecialistName() {
        return specialistName;
    }
}