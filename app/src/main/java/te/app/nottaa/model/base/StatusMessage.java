
package te.app.nottaa.model.base;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMessage {

    @SerializedName("msg")
    @Expose
    public String mMessage;
    @SerializedName("status")
    @Expose
    public int mStatus;


}
