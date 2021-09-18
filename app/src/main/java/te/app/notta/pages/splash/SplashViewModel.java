package te.app.notta.pages.splash;

import android.os.Handler;
import android.os.Looper;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.base.BaseViewModel;
import te.app.notta.base.MyApplication;
import te.app.notta.pages.onBoard.OnBoardAdapter;
import te.app.notta.repository.AuthRepository;
import te.app.notta.model.base.Mutable;
import te.app.notta.utils.Constants;
import te.app.notta.utils.session.UserHelper;
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
