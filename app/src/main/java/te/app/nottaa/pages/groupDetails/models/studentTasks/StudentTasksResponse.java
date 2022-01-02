package te.app.nottaa.pages.groupDetails.models.studentTasks;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class StudentTasksResponse extends StatusMessage {
    @SerializedName("data")
    private StudentTasksMain studentTasksMain;

    public StudentTasksMain getStudentTasksMain() {
        return studentTasksMain;
    }
}
