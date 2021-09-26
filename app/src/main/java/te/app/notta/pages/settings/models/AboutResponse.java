package te.app.notta.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class AboutResponse extends StatusMessage {
    @SerializedName("data")
    private AboutData aboutData;

    public AboutData getData() {
        return aboutData;
    }

}