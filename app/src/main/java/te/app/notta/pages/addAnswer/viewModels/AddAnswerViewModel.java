package te.app.notta.pages.addAnswer.viewModels;

import android.net.Uri;
import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.BR;
import te.app.notta.base.BaseViewModel;
import te.app.notta.base.MyApplication;
import te.app.notta.connection.FileObject;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.addAnswer.adapters.TaskMediaAdapter;
import te.app.notta.pages.addAnswer.models.AddAnswerRequest;
import te.app.notta.pages.addAnswer.models.TaskDetailsData;
import te.app.notta.repository.GroupRepository;
import te.app.notta.utils.Constants;
import te.app.notta.utils.upload.FileOperations;


public class AddAnswerViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    TaskDetailsData taskDetailsData;
    TaskMediaAdapter taskMediaAdapter;
    AddAnswerRequest addAnswerRequest;
    private List<Uri> selectedUri = new ArrayList<>();
    List<FileObject> objectList = new ArrayList<>();

    @Inject
    public AddAnswerViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void taskDetails() {
        compositeDisposable.add(repository.taskDetails(getPassingObject().getId(), getPassingObject().getObject()));
    }

    public void answerTask() {
        getAddAnswerRequest().setTaskId(String.valueOf(getPassingObject().getId()));
        if (selectedUri.size() > 0) {
            for (int i = 0; i < getSelectedUri().size(); i++) {
                objectList.add(FileOperations.getFileObject(MyApplication.getInstance(), getSelectedUri().get(i), Constants.FILE, Constants.FILE_TYPE_IMAGE));
            }
        }
        if (objectList.size() > 0 || !TextUtils.isEmpty(getAddAnswerRequest().getAnswerText())) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.answerTask(getAddAnswerRequest(), objectList));
        }
    }

    @Bindable
    public TaskDetailsData getTaskDetailsData() {
        return this.taskDetailsData == null ? this.taskDetailsData = new TaskDetailsData() : this.taskDetailsData;
    }

    @Bindable
    public void setTaskDetailsData(TaskDetailsData taskDetailsData) {
        taskMediaAdapter.update(taskDetailsData.getTaskFiles());
        notifyChange(BR.taskMediaAdapter);
        notifyChange(BR.taskDetailsData);
        this.taskDetailsData = taskDetailsData;
    }

    @Bindable
    public TaskMediaAdapter getTaskMediaAdapter() {
        return this.taskMediaAdapter == null ? this.taskMediaAdapter = new TaskMediaAdapter() : this.taskMediaAdapter;
    }

    @Bindable
    public AddAnswerRequest getAddAnswerRequest() {
        return this.addAnswerRequest == null ? this.addAnswerRequest = new AddAnswerRequest() : this.addAnswerRequest;
    }

    public List<Uri> getSelectedUri() {
        return selectedUri;
    }

    public void setSelectedUri(List<Uri> selectedUri) {
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
