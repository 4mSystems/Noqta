package te.app.nottaa.pages.teacher.viewModels;


import android.net.Uri;
import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.nottaa.BR;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.teacher.models.AddTaskRequest;
import te.app.nottaa.repository.GroupRepository;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.upload.FileOperations;


public class AddTaskViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    AddTaskRequest addTaskRequest;
    private List<Uri> selectedUri = new ArrayList<>();
    List<FileObject> objectList = new ArrayList<>();
    public ObservableField<String> videoPath= new ObservableField<>();

    @Inject
    public AddTaskViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getMyGroups() {
        if (getPassingObject().getId() == 0)
            compositeDisposable.add(repository.getMyGroups());

    }

    public void createTask() {
        getAddTaskRequest().setGroupId(String.valueOf(getPassingObject().getId()));
        if (getAddTaskRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            for (int i = 0; i < getSelectedUri().size(); i++) {
                objectList.add(FileOperations.getFileObject(MyApplication.getInstance(), getSelectedUri().get(i), "file[" + i + "]", Constants.FILE_TYPE_IMAGE));
            }
            if (!TextUtils.isEmpty(videoPath.get()))
                objectList.add(new FileObject("file[" + objectList.size() + "]", videoPath.get(), Constants.FILE_TYPE_VIDEO));
            compositeDisposable.add(repository.addTask(getAddTaskRequest(), objectList));
        }
    }

    public void onPointsTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            addTaskRequest.setPoints("1");
        }
        notifyChange(BR.addTaskRequest);
    }

    @Bindable
    public AddTaskRequest getAddTaskRequest() {
        return this.addTaskRequest == null ? this.addTaskRequest = new AddTaskRequest() : this.addTaskRequest;
    }

    @Bindable
    public List<Uri> getSelectedUri() {
        return selectedUri;
    }

    @Bindable
    public void setSelectedUri(List<Uri> selectedUri) {
        notifyChange(BR.selectedUri);
        this.selectedUri = selectedUri;
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
