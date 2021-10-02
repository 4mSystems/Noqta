package te.app.notta.pages.points.models.students;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class StudentPointsResponse extends StatusMessage {
    @SerializedName("data")
    private StudentMainPoints studentMainPoints;

    public StudentMainPoints getStudentMainPoints() {
        return studentMainPoints;
    }
}
