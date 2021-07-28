package grand.app.aber_provider.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;


import java.util.ArrayList;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.settings.models.UserDocuments;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class DocumentsViewModel extends BaseViewModel {
    ArrayList<FileObject> fileObjects;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    private UserDocuments userDocuments;
    public ObservableField<Boolean> isEditVisable = new ObservableField<>();

    @Inject
    public DocumentsViewModel(AuthRepository repository) {
        userDocuments = new UserDocuments();
        this.repository = repository;
        fileObjects = new ArrayList<>();
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void userDocuments() {
        compositeDisposable.add(repository.getUserDocuments());
    }

    public void uploadDocs() {
        compositeDisposable.add(repository.updateProfile(null, getFileObjects()));
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

    public ArrayList<FileObject> getFileObjects() {
        return fileObjects;
    }

    public AuthRepository getRepository() {
        return repository;
    }

    @Bindable
    public UserDocuments getUserDocuments() {
        return userDocuments;
    }

    @Bindable
    public void setUserDocuments(UserDocuments userDocuments) {
        if (userDocuments.getBackCarFlag() == 1 && userDocuments.getFrontCarFlag() == 1 && userDocuments.getInsuranceFlag() == 1
                && userDocuments.getLicenseFlag() == 1 && userDocuments.getCivilFlag() == 1)
            isEditVisable.set(true);
        notifyChange(BR.userDocuments);
        this.userDocuments = userDocuments;
    }

    public void toBackImage() {
        liveData.setValue(new Mutable(Constants.back_car_image));
    }

    public void toFrontImage() {
        liveData.setValue(new Mutable(Constants.front_car_image));
    }

    public void toInsuranceImage() {
    }

    public void toLicenseImage() {
        liveData.setValue(new Mutable(Constants.license_image));
    }

}
