package te.app.nottaa.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ConfirmCodeRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("code")
    private String code;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
