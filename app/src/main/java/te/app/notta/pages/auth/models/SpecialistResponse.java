package te.app.notta.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.notta.model.base.StatusMessage;
import te.app.notta.utils.PopUp.PopUp;

public class SpecialistResponse extends StatusMessage {
    @SerializedName("data")
    private List<PopUp> specialist;

    public List<PopUp> getSpecialist() {
        return specialist;
    }
}
