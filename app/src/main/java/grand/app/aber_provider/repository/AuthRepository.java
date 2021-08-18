package grand.app.aber_provider.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.aber_provider.connection.ConnectionHelper;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.auth.countries.models.CountriesResponse;
import grand.app.aber_provider.pages.auth.models.ConfirmCodeRequest;
import grand.app.aber_provider.pages.auth.models.ForgetPasswordRequest;
import grand.app.aber_provider.pages.auth.models.LoginRequest;
import grand.app.aber_provider.pages.auth.models.RegisterRequest;
import grand.app.aber_provider.pages.auth.models.UsersResponse;
import grand.app.aber_provider.pages.onBoard.models.BoardResponse;
import grand.app.aber_provider.pages.settings.models.UserDocumentsResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class AuthRepository extends BaseRepository {

    @Inject
    public ConnectionHelper connectionHelper;

    protected MutableLiveData<Mutable> liveData;

    @Inject
    public AuthRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getBoard() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BOARD, new Object(), BoardResponse.class,
                Constants.BOARD, true);
    }

    public Disposable loginPassword(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PASSWORD, request, UsersResponse.class,
                Constants.LOGIN, false);
    }

    public Disposable loginWithSocial(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_SOCIAL, request, UsersResponse.class,
                Constants.LOGIN, true);
    }

    public Disposable register(RegisterRequest request, List<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.REGISTER, request, fileObjects, StatusMessage.class,
                Constants.REGISTER, false);
    }

    public Disposable getCountries() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COUNTRIES, new Object(), CountriesResponse.class,
                Constants.COUNTRIES, true);
    }

    public Disposable getCities(int countryId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CITIES + countryId, new Object(), CountriesResponse.class,
                Constants.CITIES, true);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, false);
    }


    public Disposable updateProfile(RegisterRequest request, ArrayList<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        }

    }

    //    public Disposable updateToken(String token) {
//        return connectionHelper.requestApiBackground(Constants.POST_REQUEST, URLS.UPDATE_TOKEN, new TokenRequest(token));
//    }
//
    public Disposable forgetPassword(ForgetPasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.FORGET_PASSWORD, request, StatusMessage.class,
                Constants.FORGET_PASSWORD, false);
    }

    public Disposable changePassword(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, false);
    }

    public Disposable changeProfilePassword(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PROFILE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, false);
    }


    public Disposable getUserDocuments() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_USER_DOCUMENTS, new Object(), UserDocumentsResponse.class,
                Constants.GET_USER_DOCUMENTS, true);
    }

}