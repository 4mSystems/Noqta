package grand.app.notta.pages.splash;

import android.os.Handler;
import android.os.Looper;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import grand.app.notta.BR;
import grand.app.notta.base.BaseViewModel;
import grand.app.notta.base.MyApplication;
import grand.app.notta.pages.onBoard.OnBoardAdapter;
import grand.app.notta.repository.AuthRepository;
import grand.app.notta.model.base.Mutable;
import grand.app.notta.utils.Constants;
import grand.app.notta.utils.session.UserHelper;
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
