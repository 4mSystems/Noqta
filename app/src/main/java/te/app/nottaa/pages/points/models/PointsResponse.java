package te.app.nottaa.pages.points.models;


import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class PointsResponse extends StatusMessage {

    @SerializedName("data")
    private TeacherPointsMain teacherPointsMain;

    public TeacherPointsMain getTeacherPointsMain() {
        return teacherPointsMain;
    }
}