package grand.app.aber_provider.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.orderDetails.models.SubServices;

public class MainServicesResponse extends StatusMessage {
    @SerializedName("data")
    private List<SubServices> subServices;

    public List<SubServices> getSubServices() {
        return subServices;
    }
}
