package grand.app.aber_provider.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("company_name")
    private String companyName;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("password")
    private String password;
    @SerializedName("old_password")
    private String oldPassword;
    @SerializedName("password_confirmation")
    private String confirmPassword;
    @SerializedName("device_token")
    private String token;
    @SerializedName("step")
    private String step;
    @SerializedName("is_company")
    private String isCompany;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("address")
    private String address;
    @SerializedName("main_service_ids")
    private List<Integer> mainServicesId;

    private String user_image;
    private String licence_image;
    private String tax_image;
    private String identity_image;
    private String passport_image;
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> oldError = new ObservableField<>();
    public transient ObservableField<String> confirmPasswordError = new ObservableField<>();
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> companyNameError = new ObservableField<>();
    public transient ObservableField<String> licenceError = new ObservableField<>();
    public transient ObservableField<String> taxError = new ObservableField<>();
    public transient ObservableField<String> identityError = new ObservableField<>();
    public transient ObservableField<String> passportError = new ObservableField<>();
    public transient ObservableField<String> addressError = new ObservableField<>();

    public RegisterRequest() {
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (isCompany.equals("1")) {
            if (!Validate.isValid(companyName, Constants.FIELD)) {
                companyNameError.set(Validate.error);
                valid = false;
            }
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(address, Constants.FIELD)) {
            addressError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.CHANGE_PASSWORD)) {
            confirmPasswordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isDocValid() {
        boolean valid = true;
        if (!Validate.isValid(licence_image, Constants.FIELD) && getIsCompany().equals("1")) {
            licenceError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(tax_image, Constants.FIELD) && getIsCompany().equals("1")) {
            taxError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(identity_image, Constants.FIELD)) {
            identityError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(passport_image, Constants.FIELD)) {
            passportError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isUpdateValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (isCompany.equals("1")) {
            if (!Validate.isValid(companyName, Constants.FIELD)) {
                companyNameError.set(Validate.error);
                valid = false;
            }
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(address, Constants.FIELD)) {
            addressError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isPasswordsValid() {
        boolean valid = true;
        if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.CHANGE_PASSWORD)) {
            confirmPasswordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isUpdatePasswordsValid() {
        boolean valid = true;
        if (!Validate.isValid(oldPassword, Constants.CHANGE_PASSWORD)) {
            oldError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.CHANGE_PASSWORD)) {
            confirmPasswordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameError.set(null);
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        phoneError.set(null);
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        passwordError.set(null);
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        emailError.set(null);
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        companyNameError.set(null);
        this.companyName = companyName;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordError.set(null);
        this.confirmPassword = confirmPassword;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(String isCompany) {
        taxError.set(null);
        this.isCompany = isCompany;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        identityError.set(null);
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        passportError.set(null);
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        addressError.set(null);
        this.address = address;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        oldError.set(null);
        this.oldPassword = oldPassword;
    }

    public String getLicence_image() {
        return licence_image;
    }

    public void setLicence_image(String licence_image) {
        licenceError.set(null);
        this.licence_image = licence_image;
    }

    public String getTax_image() {
        return tax_image;
    }

    public void setTax_image(String tax_image) {
        taxError.set(null);
        this.tax_image = tax_image;
    }

    public String getIdentity_image() {
        return identity_image;
    }

    public void setIdentity_image(String identity_image) {
        identityError.set(null);
        this.identity_image = identity_image;
    }

    public String getPassport_image() {
        return passport_image;
    }

    public void setPassport_image(String passport_image) {
        passportError.set(null);
        this.passport_image = passport_image;
    }

    public List<Integer> getMainServicesId() {
        return mainServicesId;
    }

    public void setMainServicesId(List<Integer> mainServicesId) {
        this.mainServicesId = mainServicesId;
    }
}
