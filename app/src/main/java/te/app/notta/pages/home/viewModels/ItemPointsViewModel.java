package te.app.notta.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.home.models.points.PointsData;

public class ItemPointsViewModel extends BaseViewModel {
    public PointsData pointsData;

    public ItemPointsViewModel(PointsData pointsData) {
        this.pointsData = pointsData;
    }

    @Bindable
    public PointsData getPointsData() {
        return pointsData;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }
}
