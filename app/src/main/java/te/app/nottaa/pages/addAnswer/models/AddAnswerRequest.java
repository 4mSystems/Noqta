package te.app.nottaa.pages.addAnswer.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.validation.Validate;

public class AddAnswerRequest {
    @SerializedName("answer_text")
    private String answerText;
    @SerializedName("task_id")
    private String taskId;
    @SerializedName("student_id")
    private String studentId;
    @SerializedName("points")
    private String points;
    public transient ObservableField<String> pointsError = new ObservableField<>();

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(points, Constants.FIELD)) {
            pointsError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        pointsError.set(null);
        this.points = points;
    }
}
