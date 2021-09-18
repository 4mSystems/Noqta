package te.app.notta.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ConfirmCodeRequest {
    @SerializedName("phone")
    private String phone;
    @SerializedName("code")
    private String code;
    @SerializedName("type")
    private String type;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(code));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
