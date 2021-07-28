package grand.app.aber_provider.pages.auth.forgetPassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.ForgetPasswordRequest;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ForgetPasswordViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ForgetPasswordRequest request;

    @Inject
    public ForgetPasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ForgetPasswordRequest();
    }

    public void sendCode() {
        getRequest().setType("reset");
        if (getRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.forgetPassword(request));
        }
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

    public ForgetPasswordRequest getRequest() {
        return request;
    }
}
