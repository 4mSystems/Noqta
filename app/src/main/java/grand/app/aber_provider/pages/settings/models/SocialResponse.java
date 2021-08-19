package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;


public class SocialResponse extends StatusMessage {
    @SerializedName("data")
    private List<SocialMediaData> mediaDataList;

    public List<SocialMediaData> getMediaDataList() {
        return mediaDataList;
    }
}
