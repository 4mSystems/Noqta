package te.app.notta.pages.points.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.notta.model.PaginateMain;

public class TeacherPointsMain extends PaginateMain {
    @SerializedName("data")
    private List<PointsData> pointsDataList;

    public List<PointsData> getPointsDataList() {
        return pointsDataList;
    }
}
