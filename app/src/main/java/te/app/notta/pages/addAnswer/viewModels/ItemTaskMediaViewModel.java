package te.app.notta.pages.addAnswer.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.addAnswer.models.TaskFilesItem;
import te.app.notta.utils.Constants;

public class ItemTaskMediaViewModel extends BaseViewModel {
    public TaskFilesItem taskFilesItem;

    public ItemTaskMediaViewModel(TaskFilesItem taskFilesItem) {
        this.taskFilesItem = taskFilesItem;
    }

    @Bindable
    public TaskFilesItem getTaskFilesItem() {
        return taskFilesItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }
}
