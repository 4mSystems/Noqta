package grand.app.aber_provider.pages.postDetails.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class MaxOrderOffer {

    @SerializedName("maxOffer")
    private String maxOffer;
    @SerializedName("lastOffer")
    private String lastOffer;
    @SerializedName("order_id")
    private int order_id;
    @SerializedName("offer")
    private String offer;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;

    public String getMaxOffer() {
        return maxOffer;
    }

    public void setMaxOffer(String maxOffer) {
        this.maxOffer = maxOffer;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getLastOffer() {
        return lastOffer;
    }

    public void setLastOffer(String lastOffer) {
        this.lastOffer = lastOffer;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public boolean isOfferValid() {
        if (!TextUtils.isEmpty(maxOffer) && !TextUtils.isEmpty(offer))
            return (Double.parseDouble(offer) < Double.parseDouble(maxOffer) && lat != 0.0 && lng != 0.0);
        else return (!TextUtils.isEmpty(offer) && lat != 0.0 && lng != 0.0);
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}