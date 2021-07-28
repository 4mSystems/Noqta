package grand.app.aber_provider.pages.myLocations.models;

import com.google.gson.annotations.SerializedName;

public class LocationsData {

    @SerializedName("main")
    private String main;

    @SerializedName("id")
    private int id;
    @SerializedName("user_id")
    private String user_id;
    @SerializedName("region_id")
    private String region_id;
    @SerializedName("city_id")
    private String city_id;

    @SerializedName("title")
    private String title;
    @SerializedName("street")
    private String street;
    @SerializedName("floor")
    private String floor;
    @SerializedName("appartment")
    private String appartment;
    @SerializedName("region_name")
    private String regionName;
    @SerializedName("city_name")
    private String cityName;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("delivery")
    private int delivery;

    public String getMain() {
        return main;
    }

    public int getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getRegion_id() {
        return region_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public String getTitle() {
        return title;
    }

    public String getStreet() {
        return street;
    }

    public String getFloor() {
        return floor;
    }

    public String getAppartment() {
        return appartment;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }
}