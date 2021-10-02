package te.app.notta.pages.addAnswer.models;

import com.google.gson.annotations.SerializedName;

public class TaskFilesItem{

	@SerializedName("file")
	private String file;

	@SerializedName("group_id")
	private String groupId;

	@SerializedName("teacher_id")
	private String teacherId;

	@SerializedName("task_id")
	private String taskId;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private int type;

	public String getFile(){
		return file;
	}

	public String getGroupId(){
		return groupId;
	}

	public String getTeacherId(){
		return teacherId;
	}

	public String getTaskId(){
		return taskId;
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}
}