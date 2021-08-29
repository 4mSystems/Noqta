package grand.app.aber_provider.pages.auth.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.pages.orderDetails.models.SubServices;

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
    @SerializedName("company_name")
    private String companyName;
    @SerializedName("is_company")
    private String isCompany;

    @SerializedName("step")
    private int step;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("address")
    private String address;

    @SerializedName("main_service")
    private List<SubServices> mainService;

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

    public String getAccountType() {
        return accountType;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public List<SubServices> getMainService() {
        return mainService;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getIsCompany() {
        return isCompany;
    }
}