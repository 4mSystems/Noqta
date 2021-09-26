package te.app.notta.pages.home.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.BR;
import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.adapters.GroupDetailsStudentsAdapter;
import te.app.notta.pages.home.adapters.GroupTasksAdapter;
import te.app.notta.pages.home.models.details.GroupDetails;
import te.app.notta.pages.home.models.groupStudents.GroupStudentsMain;
import te.app.notta.repository.GroupRepository;


public class GroupDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    GroupDetails groupDetails;
    GroupDetailsStudentsAdapter groupDetailsStudentsAdapter;
    GroupTasksAdapter tasksAdapter;
    GroupStudentsMain studentMainData;

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
        compositeDisposable.add(repository.getGroupStudentsRequests(getPassingObject().getId(), page, showProgress));
    }

    public void deleteGroup() {
        compositeDisposable.add(repository.deleteGroup(getPassingObject().getId()));
    }

    public void deleteTask() {
        compositeDisposable.add(repository.deleteTask(getTasksAdapter().selectedId));
    }

    @Bindable
    public GroupDetails getGroupDetails() {
        return this.groupDetails == null ? this.groupDetails = new GroupDetails() : this.groupDetails;
    }

    public void setGroupDetails(GroupDetails groupDetails) {
        getGroupDetailsStudentsAdapter().update(groupDetails.getStudents());
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
        if (getGroupDetailsStudentsAdapter().getStudentsItemList().size() > 0) {
            getGroupDetailsStudentsAdapter().loadMore(studentMainData.getStudentsItemList());
        } else {
            getGroupDetailsStudentsAdapter().update(studentMainData.getStudentsItemList());
            notifyChange(BR.inviteStudentsAdapter);
        }
        searchProgressVisible.set(false);
        this.studentMainData = studentMainData;
    }

    @Bindable
    public GroupDetailsStudentsAdapter getGroupDetailsStudentsAdapter() {
        return this.groupDetailsStudentsAdapter == null ? this.groupDetailsStudentsAdapter = new GroupDetailsStudentsAdapter() : this.groupDetailsStudentsAdapter;
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