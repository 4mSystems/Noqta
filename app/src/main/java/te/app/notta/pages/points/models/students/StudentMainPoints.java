package te.app.notta.pages.points.models.students;

import com.google.gson.annotations.SerializedName;

public class StudentMainPoints {
    @SerializedName("points_in_store")
    private String pointsInStore;
    @SerializedName("available_gifts")
    private AvailableGiftsPaginate giftsPaginate;

    public String getPointsInStore() {
        return pointsInStore;
    }

    public void setPointsInStore(String pointsInStore) {
        this.pointsInStore = pointsInStore;
    }

    public AvailableGiftsPaginate getGiftsPaginate() {
        return giftsPaginate;
    }
}
