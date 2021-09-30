package te.app.notta.pages.home.models.details;

import com.google.gson.annotations.SerializedName;

public class StudentsItem {

    @SerializedName("student_name")
    private String studentName;

    @SerializedName("group_id")
    private int groupId;

    @SerializedName("student_id")
    private String studentId;

    @SerializedName("id")
    private int id;

    @SerializedName("student_points")
    private String studentPoints;

    @SerializedName("student_image")
    private String studentImage;

    @SerializedName("accept")
    private String accept;

    @SerializedName("group_name")
    private String group_name;

    public String getStudentName() {
        return studentName;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getId() {
        return id;
    }

    public String getStudentPoints() {
        return studentPoints;
    }

    public String getStudentImage() {
        return studentImage;
    }

    public String getAccept() {
        return accept;
    }

    public String getGroup_name() {
        return group_name;
    }
}