package te.app.notta.pages.teacher.models.inviteStudents;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.notta.model.PaginateMain;
import te.app.notta.pages.auth.models.UserData;

public class StudentMainData extends PaginateMain {

	@SerializedName("data")
	private List<UserData> studentsList;

	public List<UserData> getStudentsList(){
		return studentsList;
	}

}