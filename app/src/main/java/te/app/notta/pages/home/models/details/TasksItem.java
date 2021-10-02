package te.app.notta.pages.home.models.details;

import com.google.gson.annotations.SerializedName;

public class TasksItem {

    @SerializedName("group_id")
    private String groupId;

    @SerializedName("description")
    private String description;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int id;
    @SerializedName("answered")
    private int answered;

    private int tech_id;

    public String getGroupId() {
        return groupId;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public int getTech_id() {
        return tech_id;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public int getAnswered() {
        return answered;
    }
}