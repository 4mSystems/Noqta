package grand.app.notta.pages.auth.register;

import android.widget.CompoundButton;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.notta.base.BaseViewModel;
import grand.app.notta.connection.FileObject;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.pages.auth.models.RegisterRequest;
import grand.app.notta.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    boolean isTermsAccepted = false;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void register() {
//        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
//        getRequest().setStep("1");
//        if (getRequest().isValid()) {
//            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
//                if (!TextUtils.isEmpty(getRequest().getUser_image())) {
//                    setMessage(Constants.SHOW_PROGRESS);
//                    compositeDisposable.add(repository.register(request, fileObject));
//                } else {
//                    liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.select_image_profile)));
//                }
//            } else
//                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
//        } else
//            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.empty_warning)));
    }



    public void onCheckedChange(CompoundButton button, boolean check) {
        isTermsAccepted = check;
    }

    public void imageSubmit(String action) {
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
