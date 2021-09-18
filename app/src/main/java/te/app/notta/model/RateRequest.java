package te.app.notta.model;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class RateRequest {
    @SerializedName("rate")
    private String rate;
    @SerializedName("comment")
    private String comment;
    @SerializedName("order_id")
    private String orderId;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(comment) && !TextUtils.isEmpty(rate));
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
