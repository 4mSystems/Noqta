package te.app.nottaa.pages.groupDetails.models.details;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class GroupDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private GroupDetails groupDetails;

    public GroupDetails getGroupDetails() {
        return groupDetails;
    }

}