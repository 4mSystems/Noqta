package te.app.nottaa.pages.teacher.models.inviteStudents;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class StudentsResponse extends StatusMessage {
	@SerializedName("data")
	private StudentMainData studentMainData;
	public StudentMainData getStudentMainData(){
		return studentMainData;
	}

}