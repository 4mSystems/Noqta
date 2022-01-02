package te.app.nottaa.pages.teacher.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SendInvitationsRequest {
    @SerializedName("group_id")
    private int groupId;
    @SerializedName("student_id")
    private List<Integer> studentId;

    public SendInvitationsRequest(int groupId, List<Integer> studentId) {
        this.groupId = groupId;
        this.studentId = studentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Integer> getStudentId() {
        return studentId;
    }

    public void setStudentId(List<Integer> studentId) {
        this.studentId = studentId;
    }
}
