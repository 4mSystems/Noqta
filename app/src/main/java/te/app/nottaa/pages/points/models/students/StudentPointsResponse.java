package te.app.nottaa.pages.points.models.students;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class StudentPointsResponse extends StatusMessage {
    @SerializedName("data")
    private StudentMainPoints studentMainPoints;

    public StudentMainPoints getStudentMainPoints() {
        return studentMainPoints;
    }
}
