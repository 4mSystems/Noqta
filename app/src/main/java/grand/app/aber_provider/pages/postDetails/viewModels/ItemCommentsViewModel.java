package grand.app.aber_provider.pages.postDetails.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments;

public class ItemCommentsViewModel extends BaseViewModel {
    public Comments comments;

    public ItemCommentsViewModel(Comments comments) {
        this.comments = comments;
    }

    @Bindable
    public Comments getComments() {
        return comments;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
