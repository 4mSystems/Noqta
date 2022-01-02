package te.app.nottaa.pages.groupDetails.viewModels;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.groupDetails.models.details.StudentsItem;

public class ItemGroupStudentViewModel extends BaseViewModel {
    public StudentsItem studentsItem;

    public ItemGroupStudentViewModel(StudentsItem studentsItem) {
        this.studentsItem = studentsItem;
    }

    @Bindable
    public StudentsItem getStudentsItem() {
        return studentsItem;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }
}
