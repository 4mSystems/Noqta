package te.app.notta.model;

import com.google.gson.annotations.SerializedName;

public class MainRequest {
    @SerializedName("group_id")
    private String groupId;
    @SerializedName("task_id")
    private String taskId;
    @SerializedName("gift_id")
    private String giftId;

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }
}
