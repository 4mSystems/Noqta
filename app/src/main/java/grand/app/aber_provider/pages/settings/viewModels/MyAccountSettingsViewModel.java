package grand.app.aber_provider.pages.settings.viewModels;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;

public class MyAccountSettingsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;

    @Inject
    public MyAccountSettingsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void buttonActions(String action) {
        liveData.setValue(new Mutable(action));
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

    public AuthRepository getRepository() {
        return repository;
    }

}
