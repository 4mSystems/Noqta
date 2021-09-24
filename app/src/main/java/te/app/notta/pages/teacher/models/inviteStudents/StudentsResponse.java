package te.app.notta.pages.teacher.models.inviteStudents;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class StudentsResponse extends StatusMessage {
	@SerializedName("data")
	private StudentMainData studentMainData;
	public StudentMainData getStudentMainData(){
		return studentMainData;
	}

}