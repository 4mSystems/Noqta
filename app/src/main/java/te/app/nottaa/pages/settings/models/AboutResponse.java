package te.app.nottaa.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.model.base.StatusMessage;

public class AboutResponse extends StatusMessage {
    @SerializedName("data")
    private AboutData aboutData;

    public AboutData getData() {
        return aboutData;
    }

}