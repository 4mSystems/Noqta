package grand.app.aber_provider.pages.auth.register;

import android.text.TextUtils;
import android.widget.CompoundButton;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.RegisterRequest;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;
import grand.app.aber_provider.utils.session.UserHelper;
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
        request = new RegisterRequest();
        request.setIsCompany("0");
    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getRequest().isValid()) {
            if (!TextUtils.isEmpty(getRequest().getUser_image())) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.register(request, fileObject));
            } else {
                liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.select_image_profile)));
            }
        } else
            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.empty_warning)));
    }

    public void onCheckedChange(CompoundButton button, boolean check) {
        isTermsAccepted = check;
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
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
        return request;
    }

    public List<FileObject> getFileObject() {
        return fileObject;
    }

}
