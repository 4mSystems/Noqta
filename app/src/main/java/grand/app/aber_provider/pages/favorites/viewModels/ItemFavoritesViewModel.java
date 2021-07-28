package grand.app.aber_provider.pages.favorites.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.PostData;

public class ItemFavoritesViewModel extends BaseViewModel {
    public PostData postData;

    public ItemFavoritesViewModel(PostData postData) {
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
