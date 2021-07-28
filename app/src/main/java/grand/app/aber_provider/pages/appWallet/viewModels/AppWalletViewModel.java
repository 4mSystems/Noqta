package grand.app.aber_provider.pages.appWallet.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.appWallet.adapters.AppWalletAdapter;
import grand.app.aber_provider.pages.appWallet.models.HistoryWalletData;
import grand.app.aber_provider.pages.appWallet.models.RaiseWalletRequest;
import grand.app.aber_provider.repository.SettingsRepository;
import io.reactivex.disposables.CompositeDisposable;

public class AppWalletViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository settingsRepository;
    RaiseWalletRequest raiseWalletRequest;
    AppWalletAdapter appWalletAdapter;
    HistoryWalletData historyWalletData;

    @Inject
    public AppWalletViewModel(SettingsRepository settingsRepository) {
        historyWalletData = new HistoryWalletData();
        appWalletAdapter = new AppWalletAdapter();
        raiseWalletRequest = new RaiseWalletRequest();
        this.liveData = new MutableLiveData<>();
        this.settingsRepository = settingsRepository;
        settingsRepository.setLiveData(liveData);
    }

    public void putInWallet() {
//        if (!TextUtils.isEmpty(getRaiseWalletRequest().getAmount()))
//            compositeDisposable.add(settingsRepository.raiseWallet(getRaiseWalletRequest()));
//        liveData.setValue(new Mutable(Constants.EMPTY_DRIVER));
    }

    public void walletHistory() {
//        compositeDisposable.add(settingsRepository.walletHistory());
    }

    public SettingsRepository getSettingsRepository() {
        return settingsRepository;
    }

    public AppWalletAdapter getAppWalletAdapter() {
        return appWalletAdapter;
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

    @Bindable
    public HistoryWalletData getHistoryWalletData() {
        return historyWalletData;
    }

    @Bindable
    public void setHistoryWalletData(HistoryWalletData historyWalletData) {
        getAppWalletAdapter().update(historyWalletData.getUserWalletRecharges());
        notifyChange(BR.historyWalletData);
        this.historyWalletData = historyWalletData;
    }

    public RaiseWalletRequest getRaiseWalletRequest() {
        return raiseWalletRequest;
    }

    @Bindable
    public void setRaiseWalletRequest(RaiseWalletRequest raiseWalletRequest) {
        notifyChange(BR.raiseWalletRequest);
        this.raiseWalletRequest = raiseWalletRequest;
    }
}