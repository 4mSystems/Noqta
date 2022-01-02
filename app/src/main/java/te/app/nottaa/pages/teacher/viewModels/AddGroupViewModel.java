package te.app.nottaa.pages.teacher.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.nottaa.BR;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.teacher.adapters.InviteStudentsAdapter;
import te.app.nottaa.pages.teacher.models.AddGroupRequest;
import te.app.nottaa.pages.teacher.models.SendInvitationsRequest;
import te.app.nottaa.pages.teacher.models.inviteStudents.StudentMainData;
import te.app.nottaa.repository.GroupRepository;
import te.app.nottaa.utils.Constants;


public class AddGroupViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    AddGroupRequest groupRequest;
    InviteStudentsAdapter inviteStudentsAdapter;
    StudentMainData studentMainData;
    public String searchText;

    @Inject
    public AddGroupViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getStudent(int page, boolean showProgress, String search) {
        compositeDisposable.add(repository.getStudentToInvite(page, showProgress, search));
    }

    public void createGroup() {
        if (getGroupRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.addGroup(getGroupRequest()));
        }
    }

    public void sendInvitations() {
        if (getInviteStudentsAdapter().selectedIds.size() > 0) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.sendInvitations(new SendInvitationsRequest(getPassingObject().getId(), getInviteStudentsAdapter().selectedIds)));
        }
    }

    @Bindable
    public StudentMainData getStudentMainData() {
        return this.studentMainData == null ? this.studentMainData = new StudentMainData() : this.studentMainData;
    }

    public void setStudentMainData(StudentMainData studentMainData) {
        if (!TextUtils.isEmpty(searchText)) { // if search required
            if (studentMainData.getCurrentPage() > 1) {
                getInviteStudentsAdapter().loadMore(studentMainData.getStudentsList());
            } else {
                getInviteStudentsAdapter().update(studentMainData.getStudentsList());
                notifyChange(BR.inviteStudentsAdapter);
            }
        } else {
            if (getInviteStudentsAdapter().getGroupItemList().size() > 0) {
                getInviteStudentsAdapter().loadMore(studentMainData.getStudentsList());
            } else {
                getInviteStudentsAdapter().update(studentMainData.getStudentsList());
                notifyChange(BR.inviteStudentsAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.studentMainData = studentMainData;
    }

    public void onStudentTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            groupRequest.setNoOfStudents("1");
        }
        notifyChange(BR.groupRequest);
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!TextUtils.isEmpty(s)) {
            searchText = s.toString();
            getStudent(1, false, s.toString());
            searchProgressVisible.set(true);
        }
    }

    public void onTaskTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            groupRequest.setNoOfTasks("1");
        }
        notifyChange(BR.groupRequest);
    }

    @Bindable
    public InviteStudentsAdapter getInviteStudentsAdapter() {
        return this.inviteStudentsAdapter == null ? this.inviteStudentsAdapter = new InviteStudentsAdapter() : this.inviteStudentsAdapter;
    }

    @Bindable
    public AddGroupRequest getGroupRequest() {
        return this.groupRequest == null ? this.groupRequest = new AddGroupRequest() : this.groupRequest;
    }

    public GroupRepository getRepository() {
        return repository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }


}
