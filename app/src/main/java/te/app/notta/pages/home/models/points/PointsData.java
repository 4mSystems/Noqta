package te.app.notta.pages.home.models.points;

import com.google.gson.annotations.SerializedName;

public class PointsData {

	@SerializedName("image")
	private String image;

	@SerializedName("teacher_id")
	private String teacherId;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("points")
	private String points;

	public String getImage(){
		return image;
	}

	public String getTeacherId(){
		return teacherId;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getPoints(){
		return points;
	}
}