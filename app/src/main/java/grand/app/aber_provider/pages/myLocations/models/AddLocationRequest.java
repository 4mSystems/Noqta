package grand.app.aber_provider.pages.myLocations.models;


import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.validation.Validate;

public class AddLocationRequest {
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("title")
    private String title;
    @SerializedName("street")
    private String street;
    @SerializedName("floor")
    private String floor;
    @SerializedName("appartment")
    private String appartment;
    @SerializedName("region_id")
    private String region_id;
    @SerializedName("city_id")
    private String city_id;
    @SerializedName("location_id")
    private String location_id;
    public transient ObservableField<String> latError = new ObservableField<>();
    public transient ObservableField<String> titleError = new ObservableField<>();
    public transient ObservableField<String> streetError = new ObservableField<>();
    public transient ObservableField<String> floorError = new ObservableField<>();
    public transient ObservableField<String> appartmentError = new ObservableField<>();
    public transient ObservableField<String> cityError = new ObservableField<>();
    public transient ObservableField<String> regionError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(title, Constants.FIELD)) {
            titleError.set(Validate.error);
            valid = false;
        }else if (!Validate.isValid(street, Constants.FIELD)) {
            streetError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(lat, Constants.FIELD)) {
            latError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(floor, Constants.FIELD)) {
            floorError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(city_id, Constants.FIELD)) {
            cityError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(region_id, Constants.FIELD)) {
            regionError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        latError.set(null);
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        titleError.set(null);
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        streetError.set(null);
        this.street = street;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        floorError.set(null);
        this.floor = floor;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        appartmentError.set(null);
        this.appartment = appartment;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        regionError.set(null);
        this.region_id = region_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        cityError.set(null);
        this.city_id = city_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }
}