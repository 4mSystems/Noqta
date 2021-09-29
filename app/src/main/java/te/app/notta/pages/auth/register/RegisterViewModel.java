package te.app.notta.pages.auth.register;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.BaseViewModel;
import te.app.notta.base.MyApplication;
import te.app.notta.connection.FileObject;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.auth.models.RegisterRequest;
import te.app.notta.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.utils.Constants;
import te.app.notta.utils.PopUp.PopUp;
import te.app.notta.utils.resources.ResourceManager;
import te.app.notta.utils.session.UserHelper;
import te.app.notta.utils.validation.Validate;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    public List<PopUp> specialist = new ArrayList<>();

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        if (userData != null) {
            getRequest().setName(userData.getName());
            getRequest().setEmail(userData.getEmail());
            getRequest().setType(userData.getType());
        }
    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getRequest().isValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.register(request, getFileObject()));
            } else
                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
        }
    }

    public void updateProfile() {
        if (getRequest().isUpdateValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.updateProfile(request, getFileObject()));
        }
    }

    public void getSpecialist() {
        compositeDisposable.add(repository.getSpecialist());
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
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

    @Bindable
    public RegisterRequest getRequest() {
        return this.request == null ? this.request = new RegisterRequest() : this.request;
    }

    public List<FileObject> getFileObject() {
        return fileObject;
    }

}
