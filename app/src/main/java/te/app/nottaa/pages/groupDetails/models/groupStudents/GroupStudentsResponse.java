package te.app.nottaa.pages.groupDetails.models.groupStudents;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class GroupStudentsResponse extends StatusMessage {

	@SerializedName("data")
	private GroupStudentsMain groupStudentsMain;

	public GroupStudentsMain getData(){
		return groupStudentsMain;
	}

}