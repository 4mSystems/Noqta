package te.app.notta.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.home.models.GroupItem;

public class ItemHomeViewModel extends BaseViewModel {
    public GroupItem groupItem;

    public ItemHomeViewModel(GroupItem groupItem) {
        this.groupItem = groupItem;
    }

    @Bindable
    public GroupItem getGroupItem() {
        return groupItem;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }
}
