package te.app.nottaa.pages.addAnswer.models;

import com.google.gson.annotations.SerializedName;

public class TaskAnswerFilesItem{

	@SerializedName("file")
	private String file;

	@SerializedName("task_answer_id")
	private String taskAnswerId;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private int type;

	public String getFile(){
		return file;
	}

	public String getTaskAnswerId(){
		return taskAnswerId;
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}
}