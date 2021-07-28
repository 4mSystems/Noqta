package grand.app.aber_provider.pages.splash;

import android.os.Handler;
import android.os.Looper;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.pages.onBoard.OnBoardAdapter;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    OnBoardAdapter onBoardAdapter = new OnBoardAdapter();
    @Inject
    AuthRepository repository;

    @Inject
    public SplashViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public AuthRepository getRepository() {
        return repository;
    }

    public void runSplash() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null) {
                liveData.setValue(new Mutable(Constants.HOME));
            } else {
                liveData.setValue(new Mutable(Constants.BACKGROUND_API));
            }
        }, 3000);
    }

    public void toLogin() {
        liveData.setValue(new Mutable(Constants.LOGIN));
    }

    @Bindable
    public OnBoardAdapter getOnBoardAdapter() {
        notifyChange(BR.onBoardAdapter);
        return onBoardAdapter;
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

    public void getSlider() {
        compositeDisposable.add(repository.getBoard());
    }

    public void setupSlider(SliderView sliderView) {
        sliderView.setSliderAdapter(onBoardAdapter);
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }


}
