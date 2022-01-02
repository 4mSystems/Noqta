package te.app.nottaa.utils.PopUp;

import com.google.gson.annotations.SerializedName;

public class PopUp {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;

    public PopUp() {
    }

    public PopUp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
