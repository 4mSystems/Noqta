package te.app.notta.pages.groupDetails.models.details;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.notta.pages.auth.models.UserData;

public class GroupDetails {

    @SerializedName("requests_count")
    private String requestsCount;

    @SerializedName("teacher")
    private UserData teacher;

    @SerializedName("teacher_id")
    private String teacherId;

    @SerializedName("name")
    private String name;

    @SerializedName("about")
    private String about;

    @SerializedName("students_count")
    private String studentsCount;

    @SerializedName("description")
    private String description;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("students")
    private List<StudentsItem> students;

    @SerializedName("id")
    private int id;
    @SerializedName("member")
    private int member;

    @SerializedName("tasks_count")
    private String tasksCount;

    @SerializedName("tasks")
    private List<TasksItem> tasks;
    @SerializedName("join_request")
    private int isJoinSent;

    public int isJoinSent() {
        return isJoinSent;
    }

    public void setJoinSent(int joinSent) {
        isJoinSent = joinSent;
    }

    public String getRequestsCount() {
        return requestsCount;
    }

    public UserData getTeacher() {
        return teacher;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getStudentsCount() {
        return studentsCount;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public List<StudentsItem> getStudents() {
        return students;
    }

    public int getId() {
        return id;
    }

    public String getTasksCount() {
        return tasksCount;
    }

    public List<TasksItem> getTasks() {
        return tasks;
    }

    public int getMember() {
        return member;
    }
}