package te.app.notta.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.home.models.details.TasksItem;

public class ItemGroupTasksViewModel extends BaseViewModel {
    public TasksItem tasksItem;

    public ItemGroupTasksViewModel(TasksItem tasksItem) {
        this.tasksItem = tasksItem;
    }

    @Bindable
    public TasksItem getTasksItem() {
        return tasksItem;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }
}
