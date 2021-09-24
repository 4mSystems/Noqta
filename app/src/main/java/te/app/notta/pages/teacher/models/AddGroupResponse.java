package te.app.notta.pages.teacher.models;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.home.models.GroupItem;

public class AddGroupResponse extends StatusMessage {
    @SerializedName("data")
    private GroupItem groupItem;

    public GroupItem getGroupItem() {
        return groupItem;
    }
}
