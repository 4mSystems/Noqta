package te.app.notta.pages.auth.login;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.base.BaseViewModel;
import te.app.notta.base.MyApplication;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.auth.models.LoginRequest;
import te.app.notta.repository.AuthRepository;
import te.app.notta.utils.Constants;
import te.app.notta.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class LoginViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    LoginRequest loginRequest;
    String cpp;

    @Inject
    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }


    public void loginPassword() {
        getLoginRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (getLoginRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.loginPassword(loginRequest));
        }
    }

    public void settings(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
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

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

}
