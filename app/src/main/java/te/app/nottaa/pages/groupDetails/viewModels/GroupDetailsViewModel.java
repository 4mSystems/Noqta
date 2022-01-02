package te.app.nottaa.pages.groupDetails.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.nottaa.BR;
import te.app.nottaa.PassingObject;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.groupDetails.adapters.GroupDetailsStudentsAdapter;
import te.app.nottaa.pages.groupDetails.adapters.GroupStudentsRequestsAdapter;
import te.app.nottaa.pages.groupDetails.adapters.GroupTasksAdapter;
import te.app.nottaa.pages.groupDetails.models.details.GroupDetails;
import te.app.nottaa.pages.groupDetails.models.groupStudents.GroupStudentsMain;
import te.app.nottaa.pages.groupDetails.models.studentTasks.StudentTasksMain;
import te.app.nottaa.repository.GroupRepository;


public class GroupDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    GroupDetails groupDetails;
    GroupDetailsStudentsAdapter groupDetailsStudentsAdapter;
    GroupStudentsRequestsAdapter studentsRequestsAdapter;
    GroupTasksAdapter tasksAdapter;
    GroupStudentsMain studentMainData;
    StudentTasksMain studentTasksMain;
    public boolean isStudentGroup = false; // to determine which adapter to load

    @Inject
    public GroupDetailsViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void groupDetails() {
        compositeDisposable.add(repository.getGroupDetails(getPassingObject().getId()));
    }

    public void groupStudents(int page, boolean showProgress) {
        compositeDisposable.add(repository.getGroupStudents(getPassingObject().getId(), page, showProgress));
    }

    public void groupStudentsRequests(int page, boolean showProgress) {
        compositeDisposable.add(repository.getGroupStudentsRequests(getPassingObject() != null ? String.valueOf(getPassingObject().getId()) : "", page, showProgress));
    }

    public void deleteGroup() {
        compositeDisposable.add(repository.deleteGroup(getPassingObject().getId()));
    }

    public void deleteTask() {
        compositeDisposable.add(repository.deleteTask(getTasksAdapter().selectedId));
    }

    public void takeChance(int taskId) {
        compositeDisposable.add(repository.takeChance(taskId));
    }

    public void leaveGroup() {
        if (getGroupDetails().isJoinSent() != 1)
            compositeDisposable.add(repository.leaveGroup(getPassingObject().getId()));
    }

    public void studentJoinRequest() {
        compositeDisposable.add(repository.studentJoinRequest(getPassingObject().getId()));
    }

    public void changeStudentRequestStatus(PassingObject passingObject) {
        compositeDisposable.add(repository.changeStudentRequestStatus(passingObject));
    }

    public void groupStudentTasks(int page, boolean showProgress) {
        compositeDisposable.add(repository.groupStudentTasks(page, showProgress, getPassingObject().getId(), getPassingObject().getObject()));
    }

    @Bindable
    public GroupDetails getGroupDetails() {
        return this.groupDetails == null ? this.groupDetails = new GroupDetails() : this.groupDetails;
    }

    public void setGroupDetails(GroupDetails groupDetails) {
        getGroupDetailsStudentsAdapter().update(groupDetails.getStudents(), isStudentGroup);
        getTasksAdapter().update(groupDetails.getTasks(), groupDetails.getTeacher().getId());
        notifyChange(BR.tasksAdapter);
        notifyChange(BR.groupDetailsStudentsAdapter);
        notifyChange(BR.groupDetails);
        this.groupDetails = groupDetails;
    }

    @Bindable
    public GroupStudentsMain getStudentMainData() {
        return this.studentMainData == null ? this.studentMainData = new GroupStudentsMain() : this.studentMainData;
    }

    @Bindable
    public void setStudentMainData(GroupStudentsMain studentMainData) {
        if (isStudentGroup) {
            if (getGroupDetailsStudentsAdapter().getStudentsItemList().size() > 0) {
                getGroupDetailsStudentsAdapter().loadMore(studentMainData.getStudentsItemList());
            } else {
                getGroupDetailsStudentsAdapter().update(studentMainData.getStudentsItemList(), !isStudentGroup);
                notifyChange(BR.groupDetailsStudentsAdapter);
            }
        } else {
            if (getStudentsRequestsAdapter().getStudentsItemList().size() > 0) {
                getStudentsRequestsAdapter().loadMore(studentMainData.getStudentsItemList());
            } else {
                getStudentsRequestsAdapter().update(studentMainData.getStudentsItemList());
                notifyChange(BR.studentsRequestsAdapter);
            }
        }
        searchProgressVisible.set(false);
        this.studentMainData = studentMainData;
    }

    @Bindable
    public StudentTasksMain getStudentTasksMain() {
        return this.studentTasksMain == null ? this.studentTasksMain = new StudentTasksMain() : this.studentTasksMain;
    }

    @Bindable
    public void setStudentTasksMain(StudentTasksMain studentTasksMain) {
        if (getTasksAdapter().getTasksItemList().size() > 0) {
            getTasksAdapter().loadMore(studentTasksMain.getTasksItemList(), 0);
        } else {
            getTasksAdapter().studentId = getPassingObject().getObject();
            getTasksAdapter().update(studentTasksMain.getTasksItemList(), 0);
            notifyChange(BR.tasksAdapter);
        }
        searchProgressVisible.set(false);
        this.studentTasksMain = studentTasksMain;
    }

    @Bindable
    public GroupDetailsStudentsAdapter getGroupDetailsStudentsAdapter() {
        return this.groupDetailsStudentsAdapter == null ? this.groupDetailsStudentsAdapter = new GroupDetailsStudentsAdapter() : this.groupDetailsStudentsAdapter;
    }

    @Bindable
    public GroupStudentsRequestsAdapter getStudentsRequestsAdapter() {
        return this.studentsRequestsAdapter == null ? this.studentsRequestsAdapter = new GroupStudentsRequestsAdapter() : this.studentsRequestsAdapter;
    }

    @Bindable
    public GroupTasksAdapter getTasksAdapter() {
        return this.tasksAdapter == null ? this.tasksAdapter = new GroupTasksAdapter() : this.tasksAdapter;
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
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
