package te.app.nottaa.pages.teacher.models;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.home.models.GroupItem;

public class AddGroupResponse extends StatusMessage {
    @SerializedName("data")
    private GroupItem groupItem;

    public GroupItem getGroupItem() {
        return groupItem;
    }
}
