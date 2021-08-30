package grand.app.aber_provider.pages.profile.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.RegisterRequest;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.pages.auth.register.ServicesAdapter;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class EditProfileViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    ArrayList<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    ServicesAdapter servicesAdapter;

    @Inject
    public EditProfileViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void userProfile() {
        compositeDisposable.add(repository.userProfile());
    }

    public void updateProfile() {
        if (getRequest().isUpdateValid()) {
            if (getServicesAdapter().selectedIds.size() > 0) {
                getRequest().setMainServicesId(getServicesAdapter().selectedIds);
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.updateProfile(request, getFileObject()));
            } else
                liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.services_warning)));
        }
    }

    public void updateUserData(UserData userProfile) {
        getRequest().setName(userProfile.getName());
        getRequest().setCompanyName(userProfile.getCompanyName());
        getRequest().setPhone(userProfile.getPhone());
        getRequest().setEmail(userProfile.getEmail());
        getRequest().setAddress(userProfile.getAddress());
        getRequest().setIsCompany(userProfile.getIsCompany());
        getRequest().setLatitude(String.valueOf(userProfile.getLatitude()));
        getRequest().setLongitude(String.valueOf(userProfile.getLongitude()));
        getServicesAdapter().update(userProfile.getMainService());
        notifyChange(BR.servicesAdapter);
        notifyChange(BR.request);
    }

    public void changePasword() {
        liveData.setValue(new Mutable(Constants.CHANGE_PASSWORD));
    }

    public void imageSubmit(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public ServicesAdapter getServicesAdapter() {
        return this.servicesAdapter == null ? this.servicesAdapter = new ServicesAdapter() : this.servicesAdapter;
    }

    @Bindable
    public RegisterRequest getRequest() {
        return this.request == null ? this.request = new RegisterRequest() : this.request;
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
