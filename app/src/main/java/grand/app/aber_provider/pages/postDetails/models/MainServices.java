package grand.app.aber_provider.pages.postDetails.models;

import com.google.gson.annotations.SerializedName;

public class MainServices {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("image")
    private String image;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}