package te.app.nottaa.pages.addAnswer.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TaskAnswersItem {

    @SerializedName("answer_text")
    private String answerText;

    @SerializedName("group_id")
    private String groupId;

    @SerializedName("student_id")
    private String studentId;
    @SerializedName("student_name")
    private String studentName;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("task_id")
    private String taskId;

    @SerializedName("id")
    private int id;

    @SerializedName("task_answer_files")
    private List<TaskFilesItem> taskAnswerFiles;

    @SerializedName("status")
    private String status;

    @SerializedName("points")
    private String points;

    public String getAnswerText() {
        return answerText;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getTaskId() {
        return taskId;
    }

    public int getId() {
        return id;
    }

    public List<TaskFilesItem> getTaskAnswerFiles() {
        return taskAnswerFiles;
    }

    public String getStatus() {
        return status;
    }

    public String getPoints() {
        return points;
    }

    public String getStudentName() {
        return studentName;
    }
}