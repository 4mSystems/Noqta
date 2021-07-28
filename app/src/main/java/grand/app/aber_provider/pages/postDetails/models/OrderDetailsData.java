package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.pages.auth.models.UserData;

public class OrderDetailsData {

    @SerializedName("notes")
    private String notes;
    @SerializedName("currency")
    private String currency;

    @SerializedName("total_cost")
    private String totalCost;

    @SerializedName("delivery_time")
    private String deliveryTime;
    @SerializedName("order_images")
    private List<RepliesResponse> orderImages;

    @SerializedName("id")
    private int id;

    @SerializedName("out_city_name")
    private String outCityName;

    @SerializedName("out_address")
    private String outAddress;

    @SerializedName("in_lat")
    private String inLat;

    @SerializedName("shop_comment")
    private String shopComment;

    @SerializedName("out_lat")
    private String outLat;

    @SerializedName("department_id")
    private int departmentId;
    @SerializedName("sub_department_id")
    private String sub_department_id;
    @SerializedName("sub_department")
    private CreateCommentRequest subDepartment;

    @SerializedName("delegate_rate")
    private String delegateRate;

    @SerializedName("delegate_id")
    private int delegateId;

    @SerializedName("in_lng")
    private String inLng;

    @SerializedName("in_address")
    private String inAddress;

    @SerializedName("out_lng")
    private String outLng;
    @SerializedName("user")
    private UserData user;

    @SerializedName("last_lat")
    private double last_lat;
    @SerializedName("last_lng")
    private double last_lng;
    @SerializedName("last_address")
    private String last_address;
    @SerializedName("offer")
    private MaxOrderOffer maxOrderOffer;

    public MaxOrderOffer getMaxOrderOffer() {
        return maxOrderOffer;
    }

    public String getNotes() {
        return notes;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public CreateCommentRequest getSubDepartment() {
        return subDepartment;
    }


    public List<RepliesResponse> getOrderImages() {
        return orderImages;
    }

    public int getId() {
        return id;
    }


    public String getOutAddress() {
        return outAddress;
    }

    public String getInLat() {
        return inLat;
    }

    public String getOutLat() {
        return outLat;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getInLng() {
        return inLng;
    }

    public String getInAddress() {
        return inAddress;
    }

    public String getOutLng() {
        return outLng;
    }

    public String getSub_department_id() {
        return sub_department_id;
    }

    public double getLast_lat() {
        return last_lat;
    }

    public double getLast_lng() {
        return last_lng;
    }

    public String getLast_address() {
        return last_address;
    }

    public String getCurrency() {
        return currency;
    }

    public UserData getUser() {
        return user;
    }

}