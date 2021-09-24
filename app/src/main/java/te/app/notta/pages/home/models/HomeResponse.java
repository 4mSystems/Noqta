package te.app.notta.pages.home.models;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {
	@SerializedName("data")
	private HomeData homeData;

	public HomeData getData(){
		return homeData;
	}

}