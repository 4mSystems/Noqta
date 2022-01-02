package te.app.nottaa.pages.points.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.nottaa.model.PaginateMain;

public class TeacherPointsMain extends PaginateMain {
    @SerializedName("data")
    private List<PointsData> pointsDataList;

    public List<PointsData> getPointsDataList() {
        return pointsDataList;
    }
}
