package grand.app.aber_provider.pages.postDetails.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.pages.auth.models.UserData;

public class OrderDetailsMain {

    @SerializedName("image")
    private Object image;

    @SerializedName("cost")
    private double cost;

    @SerializedName("address")
    private String address;

    @SerializedName("child_services")
    private List<Object> childServices;

    @SerializedName("main_service")
    private MainServices mainService;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("scheduled_at")
    private String scheduledAt;

    @SerializedName("description")
    private Object description;

    @SerializedName("is_emergency")
    private int isEmergency;

    @SerializedName("vehicle")
    private Object vehicle;

    @SerializedName("extra_text")
    private Object extraText;

    @SerializedName("extra_fees")
    private double extraFees;

    @SerializedName("total")
    private double total;

    @SerializedName("delivery_fees")
    private double deliveryFees;
  @SerializedName("emergency_cost")
    private double emergencyCost;

    @SerializedName("subtotal")
    private int subtotal;

    @SerializedName("sub_services")
    private List<SubServices> subServices;

    @SerializedName("id")
    private int id;

    @SerializedName("user")
    private UserData user;

    @SerializedName("extra_services")
    private List<Object> extraServices;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("status")
    private int status;

    public Object getImage() {
        return image;
    }

    public double getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }

    public List<Object> getChildServices() {
        return childServices;
    }

    public MainServices getMainService() {
        return mainService;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getScheduledAt() {
        return scheduledAt;
    }

    public Object getDescription() {
        return description;
    }

    public int getIsEmergency() {
        return isEmergency;
    }

    public Object getVehicle() {
        return vehicle;
    }

    public Object getExtraText() {
        return extraText;
    }

    public double getExtraFees() {
        return extraFees;
    }

    public double getTotal() {
        return total;
    }

    public double getDeliveryFees() {
        return deliveryFees;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public List<SubServices> getSubServices() {
        return subServices;
    }

    public int getId() {
        return id;
    }

    public UserData getUser() {
        return user;
    }

    public List<Object> getExtraServices() {
        return extraServices;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getStatus() {
        return status;
    }

    public double getEmergencyCost() {
        return emergencyCost;
    }
}