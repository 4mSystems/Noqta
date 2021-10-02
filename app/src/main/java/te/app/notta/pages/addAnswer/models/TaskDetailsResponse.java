package te.app.notta.pages.addAnswer.models;

import com.google.gson.annotations.SerializedName;

import te.app.notta.model.base.StatusMessage;

public class TaskDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private TaskDetailsData taskDetailsData;

    public TaskDetailsData getTaskDetailsData() {
        return taskDetailsData;
    }

}