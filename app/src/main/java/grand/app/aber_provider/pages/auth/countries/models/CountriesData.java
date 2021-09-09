package grand.app.aber_provider.pages.auth.countries.models;

import com.google.gson.annotations.SerializedName;

public class CountriesData {

    @SerializedName("name")
    private String name;
    @SerializedName("currency_ar")
    private String currencyAr;
    @SerializedName("currency_en")
    private String currencyEn;
    @SerializedName("currency_ur")
    private String currencyUr;
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

    public String getCurrencyAr() {
        return currencyAr;
    }

    public String getCurrencyEn() {
        return currencyEn;
    }

    public String getCurrencyUr() {
        return currencyUr;
    }
}