package grand.app.aber_provider.pages.onBoard.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OnBoard {

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("content")
    @Expose
    private String body;

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}