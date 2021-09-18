package te.app.notta.pages.auth.changePassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.auth.models.RegisterRequest;
import te.app.notta.repository.AuthRepository;
import te.app.notta.utils.Constants;
import te.app.notta.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class ChangePasswordViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;

    @Inject
    public ChangePasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void submit() {
        if (userData == null) {
            if (request.isPasswordsValid()) {
                if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.changePassword(getRequest()));
                } else
                    liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
            }
        } else {
            if (request.isUpdatePasswordsValid()) {
                if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.changeProfilePassword(getRequest()));
                } else
                    liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
            }
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

    public RegisterRequest getRequest() {
        return request;
    }

}
