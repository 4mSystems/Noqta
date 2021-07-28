package grand.app.aber_provider.pages.settings.viewModels;

import android.widget.RadioGroup;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.settings.models.AboutData;
import grand.app.aber_provider.pages.settings.models.ContactUsRequest;
import grand.app.aber_provider.repository.SettingsRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsViewModel extends BaseViewModel {

    ContactUsRequest contactUsRequest;
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    AboutData aboutData;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        aboutData = new AboutData();
        contactUsRequest = new ContactUsRequest();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void sendContact() {
        if (getContactUsRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.sendContact(getContactUsRequest()));
        } else
            liveData.setValue(new Mutable(Constants.ERROR_TOAST));
    }

    public void about() {
        compositeDisposable.add(repository.about());
    }

    public void terms() {
        compositeDisposable.add(repository.terms());
    }

    public void onLangChange(RadioGroup radioGroup, int id) {
        if (id == R.id.arabic) {
            lang = "ar";
        } else
            lang = "en";
    }

    public void changeLang() {
        liveData.setValue(new Mutable(Constants.LANGUAGE));
    }

    @Bindable
    public AboutData getAboutData() {
        return aboutData;
    }

    @Bindable
    public void setAboutData(AboutData aboutData) {
        notifyChange(BR.aboutData);
        this.aboutData = aboutData;
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

    public SettingsRepository getRepository() {
        return repository;
    }


    public ContactUsRequest getContactUsRequest() {
        return contactUsRequest;
    }

}
