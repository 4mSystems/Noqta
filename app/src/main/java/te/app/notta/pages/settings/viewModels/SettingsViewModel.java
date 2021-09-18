package te.app.notta.pages.settings.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.settings.models.ContactUsRequest;
import te.app.notta.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;


public class SettingsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    ContactUsRequest contactUsRequest;

    @Inject
    public SettingsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public ContactUsRequest getContactUsRequest() {
        return this.contactUsRequest == null ? this.contactUsRequest = new ContactUsRequest() : this.contactUsRequest;
    }

    public AuthRepository getRepository() {
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
