package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class AboutResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private AboutData aboutData;

	public AboutData getAboutData() {
		return aboutData;
	}
}