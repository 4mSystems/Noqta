package te.app.notta.pages.home.models.points;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class PointsResponse extends StatusMessage {

	@SerializedName("data")
	private List<PointsData> pointsDataList;

	public List<PointsData> getPointsDataList(){
		return pointsDataList;
	}

}