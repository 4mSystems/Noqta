package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;

public class ContactResponse extends StatusMessage {
    @SerializedName("data")
    private List<String> contactList;

    public List<String> getContactList() {
        return contactList;
    }
}
