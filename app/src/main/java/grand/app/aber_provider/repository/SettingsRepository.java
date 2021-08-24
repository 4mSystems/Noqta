package grand.app.aber_provider.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.aber_provider.connection.ConnectionHelper;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.notifications.models.NotificationsResponse;
import grand.app.aber_provider.pages.settings.models.AboutResponse;
import grand.app.aber_provider.pages.settings.models.ContactResponse;
import grand.app.aber_provider.pages.settings.models.ContactUsRequest;
import grand.app.aber_provider.pages.settings.models.SocialResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class SettingsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public SettingsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getNotifications(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.NOTIFICATIONS + page, new Object(), NotificationsResponse.class,
                Constants.NOTIFICATIONS, showProgress);
    }

    public Disposable about() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

    public Disposable terms() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), AboutResponse.class,
                Constants.TERMS, true);
    }

    public Disposable sendContact(ContactUsRequest contactUsRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT_US, contactUsRequest, StatusMessage.class,
                Constants.CONTACT, false);
    }

    public Disposable getContact() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_CONTACT, new Object(), ContactResponse.class,
                Constants.GET_CONTACT, true);
    }

    public Disposable getSocial() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_SOCIAL, new Object(), SocialResponse.class,
                Constants.SOCIAL, true);
    }
}