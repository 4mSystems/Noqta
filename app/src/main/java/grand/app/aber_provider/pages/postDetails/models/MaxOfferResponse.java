package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class MaxOfferResponse extends StatusMessage {
    @SerializedName("data")
    private MaxOrderOffer data;

    public MaxOrderOffer getData() {
        return data;
    }

}