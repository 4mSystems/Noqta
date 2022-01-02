package te.app.nottaa.pages.notifications.viewModels;


import android.content.Context;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.nottaa.BR;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.notifications.adapters.NotificationsAdapter;
import te.app.nottaa.pages.notifications.models.NotificationsPaginate;
import te.app.nottaa.repository.AuthRepository;
import te.app.nottaa.utils.helper.MovementHelper;
import io.reactivex.disposables.CompositeDisposable;

public class NotificationsViewModels extends BaseViewModel {
    private NotificationsAdapter notificationsAdapter;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository settingsRepository;
    public MutableLiveData<Mutable> liveData;
    NotificationsPaginate notificationsPaginate;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();

    @Inject
    public NotificationsViewModels(AuthRepository settingsRepository) {
        notificationsPaginate = new NotificationsPaginate();
        this.settingsRepository = settingsRepository;
        this.liveData = new MutableLiveData<>();
        settingsRepository.setLiveData(liveData);
    }

    public void notifications(int page, boolean showProgress) {
        compositeDisposable.add(settingsRepository.getNotifications( page,  showProgress));
    }

    public void notificationSettings(Context context) {
        MovementHelper.startNotificationSettings(context);
    }

    public NotificationsPaginate getNotificationsPaginate() {
        return notificationsPaginate;
    }

    public void setNotificationsPaginate(NotificationsPaginate notificationsPaginate) {
        if (getNotificationsAdapter().getItemCount() > 0) {
            getNotificationsAdapter().loadMore(notificationsPaginate.getNotificationsDataList());
        } else {
            getNotificationsAdapter().updateData(notificationsPaginate.getNotificationsDataList());
            notifyChange(BR.notificationsAdapter);
        }
        searchProgressVisible.set(false);
        this.notificationsPaginate = notificationsPaginate;
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

    public AuthRepository getSettingsRepository() {
        return settingsRepository;
    }

    @Bindable
    public NotificationsAdapter getNotificationsAdapter() {
        return this.notificationsAdapter == null ? this.notificationsAdapter = new NotificationsAdapter() : this.notificationsAdapter;
    }
}
