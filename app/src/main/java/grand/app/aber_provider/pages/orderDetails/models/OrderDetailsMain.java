package grand.app.aber_provider.pages.orderDetails.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class OrderDetailsMain {

    @SerializedName("image")
    private String image;

    @SerializedName("cost")
    private double cost;

    @SerializedName("address")
    private String address;

    @SerializedName("child_services")
    private List<ChildServices> childServices;

    @SerializedName("main_service")
    private MainServices mainService;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("scheduled_at")
    private String scheduledAt;

    @SerializedName("description")
    private String description;

    @SerializedName("is_emergency")
    private int isEmergency;

    @SerializedName("vehicle")
    private Vehicle vehicle;

    @SerializedName("extra_text")
    private String extraText;

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
    private List<SubServices> extraServices;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("status")
    private int status;

    private String statusText;

    private String staticLocationImage;

    public String getStaticLocationImage() {
        return staticLocationImage;
    }

    public void setStaticLocationImage(String staticLocationImage) {
        this.staticLocationImage = staticLocationImage;
    }

    public String getImage() {
        return image;
    }

    public double getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }

    public List<ChildServices> getChildServices() {
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

    public String getDescription() {
        return description;
    }

    public int getIsEmergency() {
        return isEmergency;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getExtraText() {
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

    public List<SubServices> getExtraServices() {
        return extraServices;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getStatusText() {
        if (status == 1)
            return statusText = ResourceManager.getString(R.string.on_way);
        else if (status == 2)
            return statusText = ResourceManager.getString(R.string.order_arrived);
        else if (status == 3)
            return statusText = ResourceManager.getString(R.string.order_finished);
        else
            return statusText;
    }

    public double getEmergencyCost() {
        return emergencyCost;
    }
}