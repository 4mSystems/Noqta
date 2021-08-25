package grand.app.aber_provider.pages.orderDetails.models;

import com.google.gson.annotations.SerializedName;

public class SubServices {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private String price;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}