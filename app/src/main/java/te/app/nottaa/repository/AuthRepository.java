package te.app.nottaa.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.nottaa.connection.ConnectionHelper;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.auth.models.ConfirmCodeRequest;
import te.app.nottaa.pages.auth.models.ForgetPasswordRequest;
import te.app.nottaa.pages.auth.models.LoginRequest;
import te.app.nottaa.pages.auth.models.RegisterRequest;
import te.app.nottaa.pages.auth.models.SpecialistResponse;
import te.app.nottaa.pages.auth.models.UsersResponse;
import te.app.nottaa.pages.notifications.models.NotificationsResponse;
import te.app.nottaa.pages.onBoard.models.BoardResponse;
import te.app.nottaa.pages.settings.models.AboutResponse;
import te.app.nottaa.pages.settings.models.ContactUsRequest;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.URLS;
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
        if (fileObjects.size() > 0)
            return connectionHelper.requestApi(URLS.REGISTER, request, fileObjects, StatusMessage.class,
                    Constants.REGISTER, false);
        else
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, StatusMessage.class,
                    Constants.REGISTER, false);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, false);
    }


    public Disposable updateProfile(RegisterRequest request, List<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        }

    }


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

    public Disposable getSpecialist() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SPECIALIST, new Object(), SpecialistResponse.class,
                Constants.SPECIALIST, true);
    }

    public Disposable getNotifications(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.NOTIFICATIONS, new Object(), NotificationsResponse.class,
                Constants.NOTIFICATIONS, true);
    }

    public Disposable getAboutOrTerms(int type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, type == 1 ? URLS.ABOUT : URLS.TERMS, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

    public Disposable sendContact(ContactUsRequest contactUsRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT_US, contactUsRequest, StatusMessage.class,
                Constants.CONTACT, false);
    }
}