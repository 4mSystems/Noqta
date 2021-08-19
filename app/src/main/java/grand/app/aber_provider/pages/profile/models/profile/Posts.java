package grand.app.aber_provider.pages.profile.models.profile;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.PaginateMain;
import grand.app.aber_provider.pages.home.models.Orders;

public class Posts extends PaginateMain {

    @SerializedName("data")
    private List<Orders> postDataList;

    public List<Orders> getPostDataList() {
        return postDataList;
    }
}