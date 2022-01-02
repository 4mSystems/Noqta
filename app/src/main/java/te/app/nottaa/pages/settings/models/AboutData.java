package te.app.nottaa.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class AboutData {

	@SerializedName("body")
	private String body;

	public String getBody(){
		return body;
	}
}