package te.app.notta.pages.teacher.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.notta.utils.Constants;
import te.app.notta.utils.validation.Validate;

public class AddGiftRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("points")
    private String points = "1";
    @SerializedName("num")
    private String numOfWinners = "1";
    private transient String image;
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> descError = new ObservableField<>();
    public transient ObservableField<String> pointsError = new ObservableField<>();
    public transient ObservableField<String> winnersError = new ObservableField<>();
    public transient ObservableField<String> imageError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(description, Constants.FIELD)) {
            descError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(image, Constants.FIELD)) {
            imageError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(points, Constants.FIELD)) {
            pointsError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(numOfWinners, Constants.FIELD)) {
            winnersError.set(Validate.error);
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

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        pointsError.set(null);
        this.points = points;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        imageError.set(null);
        this.image = image;
    }

    public String getNumOfWinners() {
        return numOfWinners;
    }

    public void setNumOfWinners(String numOfWinners) {
        setNumOfWinners(null);
        this.numOfWinners = numOfWinners;
    }
}
