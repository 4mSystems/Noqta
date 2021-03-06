package te.app.nottaa.pages.addAnswer.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TaskDetailsData {

	@SerializedName("task_answer")
	private TaskAnswersItem taskAnswer;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("points")
	private String points;

	@SerializedName("task_files")
	private List<TaskFilesItem> taskFiles;

	public TaskAnswersItem getTaskAnswer(){
		return taskAnswer;
	}

	public String getDescription(){
		return description;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getPoints(){
		return points;
	}

	public List<TaskFilesItem> getTaskFiles(){
		return taskFiles;
	}
}