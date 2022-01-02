package te.app.nottaa.model;

import com.google.gson.annotations.SerializedName;

public class MainRequest {
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("task_id")
    private String taskId;
    @SerializedName("gift_id")
    private String giftId;
    @SerializedName("accept")
    private String accept;
    @SerializedName("student_id")
    private String studentId;

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
