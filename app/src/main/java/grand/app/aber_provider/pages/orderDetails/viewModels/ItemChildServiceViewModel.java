package grand.app.aber_provider.pages.orderDetails.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments;
import grand.app.aber_provider.pages.orderDetails.models.ChildServices;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class ItemChildServiceViewModel extends BaseViewModel {
    public ChildServices childServices;

    public ItemChildServiceViewModel(ChildServices childServices) {
        this.childServices = childServices;
        settingChildXmlText();
    }

    private void settingChildXmlText() {
        if (getChildServices().getType().equals(Constants.TIER)) {
            getChildServices().setChildText(ResourceManager.getString(R.string.tire_type));
            getChildServices().setSubChildText(ResourceManager.getString(R.string.tire_desc));
        }
        if (getChildServices().getType().equals(Constants.OIL)) {
            getChildServices().setChildText(ResourceManager.getString(R.string.oil_types));
            getChildServices().setSubChildText(ResourceManager.getString(R.string.oil_liguid));
        }
        if (getChildServices().getType().equals(Constants.HIDDEN)) {
            getChildServices().setParentText(ResourceManager.getString(R.string.hidden_type));
            getChildServices().setChildText(ResourceManager.getString(R.string.hidden_color));
            getChildServices().setSubChildText(ResourceManager.getString(R.string.hidden_percentage));
        }
        if (getChildServices().getType().equals(Constants.FUEL)) {
            getChildServices().setChildText(ResourceManager.getString(R.string.fuel_type));
            getChildServices().setSubChildText(ResourceManager.getString(R.string.fuel_categories));
        }
        if (getChildServices().getType().equals(Constants.OPEN_CAR)) {
            getChildServices().setChildText(ResourceManager.getString(R.string.car_motor_number));
        }
        if (getChildServices().getType().equals(Constants.BATTERY)) {
            getChildServices().setChildText(ResourceManager.getString(R.string.battery_type));
            getChildServices().setSubChildText(ResourceManager.getString(R.string.battery_size));
        }

        notifyChange(BR.childServices);
    }

    @Bindable
    public ChildServices getChildServices() {
        return childServices;
    }

}
