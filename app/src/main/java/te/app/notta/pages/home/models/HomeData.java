package te.app.notta.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.PaginateMain;

public class HomeData extends PaginateMain {
    @SerializedName("data")
    private List<GroupItem> groupItemList;

    public List<GroupItem> getGroupItemList() {
        return groupItemList;
    }
}