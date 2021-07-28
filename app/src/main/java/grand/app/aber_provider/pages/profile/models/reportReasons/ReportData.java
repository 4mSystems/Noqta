package grand.app.aber_provider.pages.profile.models.reportReasons;

import com.google.gson.annotations.SerializedName;


import grand.app.aber_provider.model.PaginateMain;

public class ReportData extends PaginateMain {

    @SerializedName("id")
    private int id;

    @SerializedName("reason")
    private String reason;
    private boolean isChecked;

    public int getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}