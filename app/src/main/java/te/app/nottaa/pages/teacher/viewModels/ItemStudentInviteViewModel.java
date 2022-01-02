package te.app.nottaa.pages.teacher.viewModels;

import android.widget.CompoundButton;

import androidx.databinding.Bindable;

import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.pages.auth.models.UserData;
import te.app.nottaa.utils.Constants;

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
