package grand.app.aber_provider.pages.profile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserActionRequest {
    @SerializedName("user_id")
    private int userId;
    @SerializedName("type")
    private String type;
    @SerializedName("reason_ids")
    @Expose
    private List<Integer> reasonIds;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getReasonIds() {
        return reasonIds;
    }

    public void setReasonIds(List<Integer> reasonIds) {
        this.reasonIds = reasonIds;
    }
}
