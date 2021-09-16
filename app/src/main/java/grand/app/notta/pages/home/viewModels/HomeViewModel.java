package grand.app.notta.pages.home.viewModels;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.notta.base.BaseViewModel;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;


public class HomeViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;

    @Inject
    public HomeViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
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
