package te.app.notta.pages.home.models;

import com.google.gson.annotations.SerializedName;

import te.app.notta.pages.auth.models.UserData;

public class GroupItem {

    @SerializedName("requests_count")
    private String requestsCount;

    @SerializedName("name")
    private String name;

    @SerializedName("students_count")
    private String studentsCount;

    @SerializedName("description")
    private String description;

    @SerializedName("id")
    private int id;
    @SerializedName("join_request")
    private int isJoinSent;
    private boolean studentTask;

    @SerializedName("tasks_count")
    private String tasksCount;
    @SerializedName("teacher")
    private UserData teacher;

    public String getRequestsCount() {
        return requestsCount;
    }

    public String getName() {
        return name;
    }

    public String getStudentsCount() {
        return studentsCount;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getTasksCount() {
        return tasksCount;
    }

    public UserData getTeacher() {
        return teacher;
    }

    public int isJoinSent() {
        return isJoinSent;
    }

    public void setJoinSent(int joinSent) {
        isJoinSent = joinSent;
    }

    public boolean isStudentTask() {
        return studentTask;
    }

    public void setStudentTask(boolean studentTask) {
        this.studentTask = studentTask;
    }
}