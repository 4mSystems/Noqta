package te.app.notta.pages.addAnswer.models;

import com.google.gson.annotations.SerializedName;

public class AddAnswerRequest {
    @SerializedName("answer_text")
    private String answerText;
    @SerializedName("task_id")
    private String taskId;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
