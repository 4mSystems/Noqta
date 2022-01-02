package te.app.nottaa.pages.addAnswer.viewModels;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.addAnswer.models.TaskFilesItem;
import te.app.nottaa.utils.Constants;

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
