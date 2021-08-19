package grand.app.aber_provider.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.PaginateMain;
import grand.app.aber_provider.pages.settings.models.SocialMediaData;

public class MainData extends PaginateMain {

    @SerializedName("orders")
    private List<Orders> ordersList;
    @SerializedName("social_media")
    private List<SocialMediaData> socialMediaDataList;

    public List<SocialMediaData> getSocialMediaDataList() {
        return socialMediaDataList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }
}