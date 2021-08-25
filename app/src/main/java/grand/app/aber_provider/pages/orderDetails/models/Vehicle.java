package grand.app.aber_provider.pages.orderDetails.models;

import com.google.gson.annotations.SerializedName;

public class Vehicle {
    @SerializedName("id")
    private int id;
    @SerializedName("type")
    private String type;
    @SerializedName("parent")
    private String parent;
    @SerializedName("child")
    private String child;
    @SerializedName("sub_child")
    private String sub_child;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getParent() {
        return parent;
    }

    public String getChild() {
        return child;
    }

    public String getSub_child() {
        return sub_child;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public void setSub_child(String sub_child) {
        this.sub_child = sub_child;
    }
}
