package te.app.notta.pages.teacher.viewModels;

import android.widget.CompoundButton;

import androidx.databinding.Bindable;

import te.app.notta.base.BaseViewModel;
import te.app.notta.pages.auth.models.UserData;
import te.app.notta.pages.home.models.GroupItem;
import te.app.notta.utils.Constants;

public class ItemStudentInviteViewModel extends BaseViewModel {
    public UserData student;

    public ItemStudentInviteViewModel(UserData student) {
        this.student = student;
    }

    @Bindable
    public UserData getStudent() {
        return student;
    }

    public void onCheckedChange(CompoundButton button, boolean check) {
        getLiveData().setValue(Constants.MENu);
    }

}
