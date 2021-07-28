package grand.app.aber_provider.pages.services.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.PostData;

public class ItemServicesViewModel extends BaseViewModel {
    public PostData postData;

    public ItemServicesViewModel(PostData postData) {
        this.postData = postData;
    }

    @Bindable
    public PostData getPostData() {
        return postData;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
