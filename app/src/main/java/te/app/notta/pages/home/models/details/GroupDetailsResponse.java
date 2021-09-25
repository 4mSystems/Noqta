package te.app.notta.pages.home.models.details;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class GroupDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private GroupDetails groupDetails;

    public GroupDetails getGroupDetails() {
        return groupDetails;
    }

}