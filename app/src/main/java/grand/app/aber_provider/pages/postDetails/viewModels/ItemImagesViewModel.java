package grand.app.aber_provider.pages.postDetails.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.postDetails.models.RepliesResponse;
import grand.app.aber_provider.utils.Constants;

public class ItemImagesViewModel extends BaseViewModel {
    public RepliesResponse orderImages;

    public ItemImagesViewModel(RepliesResponse orderImages) {
        this.orderImages = orderImages;
    }

    @Bindable
    public RepliesResponse getOrderImages() {
        return orderImages;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
}
