package te.app.notta.pages.groupDetails.models.groupStudents;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.notta.model.PaginateMain;
import te.app.notta.pages.groupDetails.models.details.StudentsItem;

public class GroupStudentsMain extends PaginateMain {

	@SerializedName("data")
	private List<StudentsItem> studentsItemList;

	public List<StudentsItem> getStudentsItemList(){
		return studentsItemList;
	}

}