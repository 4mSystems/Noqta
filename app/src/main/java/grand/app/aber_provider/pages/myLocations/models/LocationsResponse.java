package grand.app.aber_provider.pages.myLocations.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;

public class LocationsResponse extends StatusMessage {

    @SerializedName("data")
    private List<LocationsData> data;

    public List<LocationsData> getData() {
        return data;
    }
}
