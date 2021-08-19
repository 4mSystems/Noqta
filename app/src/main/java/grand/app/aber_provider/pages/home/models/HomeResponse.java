package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

	@SerializedName("data")
	private MainData mainData;

	public MainData getMainData() {
		return mainData;
	}
}