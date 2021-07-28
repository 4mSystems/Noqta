
package grand.app.aber_provider.model.base;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMessage {

    @SerializedName("message")
    @Expose
    public String mMessage;
    @SerializedName("code")
    @Expose
    public int mStatus;


}
