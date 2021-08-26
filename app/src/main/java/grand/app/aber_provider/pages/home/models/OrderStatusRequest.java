package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class OrderStatusRequest {
    @SerializedName("order_service_id")
    int orderId;
    @SerializedName("status")
    String status;

    public OrderStatusRequest(int postId, String status) {
        this.orderId = postId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
