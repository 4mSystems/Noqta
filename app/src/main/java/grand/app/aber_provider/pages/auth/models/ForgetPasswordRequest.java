package grand.app.aber_provider.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgetPasswordRequest {
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("type")
    @Expose
    private String type;

    public ForgetPasswordRequest() {
    }

    public ForgetPasswordRequest(String phone, String type) {
        this.phone = phone;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(phone));
    }
}
