package grand.app.aber_provider.pages.packages.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class PackagesResponse extends StatusMessage {

    @SerializedName("data")
    private List<PackagesData> data;

    public List<PackagesData> getData() {
        return data;
    }
}