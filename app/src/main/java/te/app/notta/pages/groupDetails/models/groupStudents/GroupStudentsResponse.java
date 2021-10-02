package te.app.notta.pages.groupDetails.models.groupStudents;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class GroupStudentsResponse extends StatusMessage {

	@SerializedName("data")
	private GroupStudentsMain groupStudentsMain;

	public GroupStudentsMain getData(){
		return groupStudentsMain;
	}

}