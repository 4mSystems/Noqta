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
import grand.app.aber_provider.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    boolean isTermsAccepted = false;
    ServicesAdapter servicesAdapter;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void authServices() {
        compositeDisposable.add(repository.authServices());
    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        getRequest().setStep("1");
        if (getRequest().isValid()) {
            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                if (!TextUtils.isEmpty(getRequest().getUser_image())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.register(request, fileObject));
                } else {
                    liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.select_image_profile)));
                }
            } else
                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
        } else
            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.empty_warning)));
    }

    public void registerDoc() {
        getRequest().setStep("2");
        if (getRequest().isDocValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.register(request, fileObject));
        } else
            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.empty_warning)));
    }

    public void registerServices() {
        getRequest().setStep("3");
        if (getServicesAdapter().selectedIds.size() > 0) {
            if (isTermsAccepted) {
                getRequest().setMainServicesId(getServicesAdapter().selectedIds);
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.register(request, fileObject));
            } else
                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.terms_warning)));
        } else
            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.services_warning)));
    }

    public void onCheckedChange(CompoundButton button, boolean check) {
        isTermsAccepted = check;
    }

    public void imageSubmit(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public ServicesAdapter getServicesAdapter() {
        return this.servicesAdapter == null ? this.servicesAdapter = new ServicesAdapter() : this.servicesAdapter;
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
