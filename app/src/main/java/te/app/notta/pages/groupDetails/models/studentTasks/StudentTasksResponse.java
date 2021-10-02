package te.app.notta.pages.groupDetails.models.studentTasks;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class StudentTasksResponse extends StatusMessage {
    @SerializedName("data")
    private StudentTasksMain studentTasksMain;

    public StudentTasksMain getStudentTasksMain() {
        return studentTasksMain;
    }
}
