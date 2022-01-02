package te.app.nottaa.pages.teacher.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.validation.Validate;

public class AddTaskRequest {
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("description")
    private String description;
    @SerializedName("points")
    private String points = "1";
    public transient ObservableField<String> groupIdError = new ObservableField<>();
    public transient ObservableField<String> descError = new ObservableField<>();
    public transient ObservableField<String> pointsError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(description, Constants.FIELD)) {
            descError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(groupId, Constants.FIELD)) {
            groupIdError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(points, Constants.FIELD)) {
            pointsError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        descError.set(null);
        this.description = description;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        groupIdError.set(null);
        this.groupId = groupId;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        pointsError.set(null);
        this.points = points;
    }
}
