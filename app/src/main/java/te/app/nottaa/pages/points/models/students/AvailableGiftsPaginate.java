package te.app.nottaa.pages.points.models.students;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.nottaa.model.PaginateMain;
import te.app.nottaa.pages.points.models.PointsData;

public class AvailableGiftsPaginate extends PaginateMain {
    @SerializedName("data")
    private List<PointsData> pointsData;

    public List<PointsData> getPointsData() {
        return pointsData;
    }
}
