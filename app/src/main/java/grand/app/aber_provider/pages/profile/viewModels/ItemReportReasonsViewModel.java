package grand.app.aber_provider.pages.profile.viewModels;


import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.profile.models.reportReasons.ReportData;

public class ItemReportReasonsViewModel extends BaseViewModel {
    public ReportData reportData;

    public ItemReportReasonsViewModel(ReportData reportData) {
        this.reportData = reportData;
    }

    @Bindable
    public ReportData getReportData() {
        return reportData;
    }

    public void itemAction() {
        reportData.setChecked(!reportData.isChecked());
    }
}
