package te.app.notta.pages.teacher.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.notta.utils.Constants;
import te.app.notta.utils.validation.Validate;

public class AddGroupRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("about")
    private String about;
    @SerializedName("publish_date")
    private String publishDate;
    @SerializedName("no_of_students")
    private String noOfStudents = "1";
    @SerializedName("no_of_tasks")
    private String noOfTasks = "1";
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> descError = new ObservableField<>();
    public transient ObservableField<String> aboutError = new ObservableField<>();
    public transient ObservableField<String> dateError = new ObservableField<>();
    public transient ObservableField<String> studentsError = new ObservableField<>();
    public transient ObservableField<String> tasksError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(description, Constants.FIELD)) {
            descError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(noOfStudents, Constants.FIELD)) {
            studentsError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(noOfTasks, Constants.FIELD)) {
            tasksError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(publishDate, Constants.FIELD)) {
            dateError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameError.set(null);
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        descError.set(null);
        this.description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        aboutError.set(null);
        this.about = about;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        dateError.set(null);
        this.publishDate = publishDate;
    }

    public String getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(String noOfStudents) {
        studentsError.set(null);
        this.noOfStudents = noOfStudents;
    }

    public String getNoOfTasks() {
        return noOfTasks;
    }

    public void setNoOfTasks(String noOfTasks) {
        tasksError.set(null);
        this.noOfTasks = noOfTasks;
    }
}
