package te.app.nottaa.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.home.models.GroupItem;

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
