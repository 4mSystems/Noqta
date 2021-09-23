package te.app.notta.pages.auth.forgetPassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.auth.models.ForgetPasswordRequest;
import te.app.notta.repository.AuthRepository;
import te.app.notta.utils.Constants;
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
