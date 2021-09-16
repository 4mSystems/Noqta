package grand.app.notta.pages.auth.confirmCode;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.notta.base.BaseViewModel;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.pages.auth.models.ConfirmCodeRequest;
import grand.app.notta.pages.auth.models.ForgetPasswordRequest;
import grand.app.notta.repository.AuthRepository;
import grand.app.notta.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ConfirmViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ConfirmCodeRequest request;

    @Inject
    public ConfirmViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ConfirmCodeRequest();
    }

    public void confirmCode() {
        getRequest().setPhone(getPassingObject().getObject());
        getRequest().setType(getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER ? "verify" : "reset");
        if (request.isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.confirmCode(request));
        }
    }

    public void resendCode() {
        setMessage(Constants.SHOW_PROGRESS);
        compositeDisposable.add(repository.forgetPassword(new ForgetPasswordRequest(getPassingObject().getObject(),getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER ? "verify" : "reset")));
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

    public ConfirmCodeRequest getRequest() {
        return request;
    }
}
