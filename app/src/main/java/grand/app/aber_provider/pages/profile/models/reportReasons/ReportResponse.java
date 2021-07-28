package grand.app.aber_provider.pages.profile.models.reportReasons;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.base.StatusMessage;

public class ReportResponse extends StatusMessage {
    @SerializedName("data")
    private List<ReportData> reportData;

    public List<ReportData> getReportData() {
        return reportData;
    }

}
