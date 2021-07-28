package grand.app.aber_provider.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("password")
    private String password;
    @SerializedName("old_password")
    private String oldPassword;
    @SerializedName("password_confirmation")
    private String confirmPassword;
    @SerializedName("job")
    private String job;
    @SerializedName("device_token")
    private String token;
    @SerializedName("email")
    private String email;
    @SerializedName("national_id")
    private String nationalId;
    @SerializedName("lectures_specialty")
    private String lecturesSpecialty;
    @SerializedName("section")
    private String section;
    @SerializedName("hours_per_day")
    private String hoursPerDay;
    @SerializedName("brief")
    private String brief;
    private String user_image;
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> oldError = new ObservableField<>();
    public transient ObservableField<String> confirmPasswordError = new ObservableField<>();
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> careerError = new ObservableField<>();
    public transient ObservableField<String> nationalError = new ObservableField<>();
    public transient ObservableField<String> lectureError = new ObservableField<>();
    public transient ObservableField<String> sectionError = new ObservableField<>();
    public transient ObservableField<String> hoursError = new ObservableField<>();
    public transient ObservableField<String> briefError = new ObservableField<>();

    public RegisterRequest() {
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(job, Constants.FIELD)) {
            careerError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isUpgradeValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(nationalId, Constants.FIELD)) {
            nationalError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(lecturesSpecialty, Constants.FIELD)) {
            lectureError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(section, Constants.FIELD)) {
            sectionError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(hoursPerDay, Constants.FIELD)) {
            hoursError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(brief, Constants.FIELD)) {
            briefError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isUpdateValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(job, Constants.FIELD)) {
            careerError.set(Validate.error);
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        careerError.set(null);
        this.job = job;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordError.set(null);
        this.confirmPassword = confirmPassword;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        nationalError.set(null);
        this.nationalId = nationalId;
    }

    public String getLecturesSpecialty() {
        return lecturesSpecialty;
    }

    public void setLecturesSpecialty(String lecturesSpecialty) {
        lectureError.set(null);
        this.lecturesSpecialty = lecturesSpecialty;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        sectionError.set(null);
        this.section = section;
    }

    public String getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(String hoursPerDay) {
        hoursError.set(null);
        this.hoursPerDay = hoursPerDay;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        briefError.set(null);
        this.brief = brief;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        oldError.set(null);
        this.oldPassword = oldPassword;
    }
}
