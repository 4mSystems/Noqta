package te.app.nottaa.pages.teacher.models.inviteStudents;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.PaginateMain;
import te.app.nottaa.pages.auth.models.UserData;

public class StudentMainData extends PaginateMain {

	@SerializedName("data")
	private List<UserData> studentsList;

	public List<UserData> getStudentsList(){
		return studentsList;
	}

}