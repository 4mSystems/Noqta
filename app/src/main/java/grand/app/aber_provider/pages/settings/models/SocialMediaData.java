package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialMediaData {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("value")
    @Expose
    private String value;

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getImage() {
        return image;
    }

    public String getValue() {
        return value;
    }
}