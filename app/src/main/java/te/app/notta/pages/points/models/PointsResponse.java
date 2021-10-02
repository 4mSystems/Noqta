package te.app.notta.pages.points.models;


import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class PointsResponse extends StatusMessage {

    @SerializedName("data")
    private TeacherPointsMain teacherPointsMain;

    public TeacherPointsMain getTeacherPointsMain() {
        return teacherPointsMain;
    }
}