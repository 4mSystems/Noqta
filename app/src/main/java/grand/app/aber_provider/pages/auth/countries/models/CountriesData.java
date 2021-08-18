package grand.app.aber_provider.pages.auth.countries.models;

import com.google.gson.annotations.SerializedName;

public class CountriesData {

    @SerializedName("name")
    private String name;
    @SerializedName("currency")
    private String currency;

    @SerializedName("id")
    private int id;
    private boolean isSelected;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String getCurrency() {
        return currency;
    }
}