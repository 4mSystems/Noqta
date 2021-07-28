package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AboutData {

    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("image")
    @Expose
    private String image;

    public String getBody() {
        return body;
    }

    public String getImage() {
        return image;
    }
}