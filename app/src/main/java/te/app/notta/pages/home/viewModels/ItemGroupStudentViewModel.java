package te.app.notta.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.home.models.GroupItem;
import te.app.notta.pages.home.models.details.StudentsItem;

public class ItemGroupStudentViewModel extends BaseViewModel {
    public StudentsItem studentsItem;

    public ItemGroupStudentViewModel(StudentsItem studentsItem) {
        this.studentsItem = studentsItem;
    }

    @Bindable
    public StudentsItem getStudentsItem() {
        return studentsItem;
    }

}
