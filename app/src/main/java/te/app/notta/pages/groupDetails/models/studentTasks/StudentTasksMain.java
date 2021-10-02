package te.app.notta.pages.groupDetails.models.studentTasks;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.notta.model.PaginateMain;
import te.app.notta.pages.groupDetails.models.details.TasksItem;

public class StudentTasksMain extends PaginateMain {
    @SerializedName("data")
    private List<TasksItem> tasksItemList;

    public List<TasksItem> getTasksItemList() {
        return tasksItemList;
    }
}
