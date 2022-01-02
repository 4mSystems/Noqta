package te.app.nottaa.pages.splash;

import android.os.Handler;
import android.os.Looper;
import android.widget.RadioGroup;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.smarteist.autoimageslider.SliderView;

import javax.inject.Inject;

import te.app.nottaa.BR;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.pages.onBoard.OnBoardAdapter;
import te.app.nottaa.repository.AuthRepository;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.session.LanguagesHelper;
import te.app.nottaa.utils.session.UserHelper;
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
