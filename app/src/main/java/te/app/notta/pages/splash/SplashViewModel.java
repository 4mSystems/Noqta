package te.app.notta.pages.splash;

import android.os.Handler;
import android.os.Looper;
import android.widget.RadioGroup;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.R;
import te.app.notta.base.BaseViewModel;
import te.app.notta.base.MyApplication;
import te.app.notta.pages.onBoard.OnBoardAdapter;
import te.app.notta.repository.AuthRepository;
import te.app.notta.model.base.Mutable;
import te.app.notta.utils.Constants;
import te.app.notta.utils.session.LanguagesHelper;
import te.app.notta.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    OnBoardAdapter onBoardAdapter = new OnBoardAdapter();
    @Inject
    AuthRepository repository;
    public ObservableBoolean isLangShow = new ObservableBoolean();

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
            } else if (!UserHelper.getInstance(MyApplication.getInstance()).getIsFirst()) {
                liveData.setValue(new Mutable(Constants.BACKGROUND_API));
            } else {
                isLangShow.set(true);
            }
        }, 3000);
    }

    public void onLangChange(RadioGroup radioGroup, int id) {
        if (id == R.id.arabic) {
            lang = "ar";
        } else
            lang = "en";

    }

    public void changeLang() {
        LanguagesHelper.setLanguage(lang);
        liveData.setValue(new Mutable(Constants.BACKGROUND_API));
    }

    @Bindable
    public OnBoardAdapter getOnBoardAdapter() {
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
        notifyChange(BR.onBoardAdapter);
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }


}
