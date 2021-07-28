package grand.app.aber_provider.pages.profile.viewModels;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.RegisterRequest;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class EditProfileViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    ArrayList<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;

    @Inject
    public EditProfileViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
//        getRequest().setName(userData.getName());
//        getRequest().setEmail(userData.getEmail());
//        getRequest().setPhone(userData.getPhone());
//        getRequest().setJob(userData.getJob());
    }

    public void updateProfile() {
        if (getRequest().isUpdateValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.updateProfile(request, getFileObject()));
        }
    }

    public void changePasword() {
        liveData.setValue(new Mutable(Constants.CHANGE_PASSWORD));
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public RegisterRequest getRequest() {
        return request;
    }

    public AuthRepository getRepository() {
        return repository;
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public ArrayList<FileObject> getFileObject() {
        return fileObject;
    }
}
