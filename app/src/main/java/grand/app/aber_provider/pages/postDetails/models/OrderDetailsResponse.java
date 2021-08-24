package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class OrderDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private OrderDetailsMain orderDetailsMain;

    public OrderDetailsMain getOrderDetailsMain() {
        return orderDetailsMain;
    }


}