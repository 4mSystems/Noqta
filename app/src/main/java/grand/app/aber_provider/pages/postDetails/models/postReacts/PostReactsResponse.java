package grand.app.aber_provider.pages.postDetails.models.postReacts;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class PostReactsResponse extends StatusMessage {

	@SerializedName("data")
	private ReactsData reactsData;

	public ReactsData getReactsData(){
		return reactsData;
	}
}