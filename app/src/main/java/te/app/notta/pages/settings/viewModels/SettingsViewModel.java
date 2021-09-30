package te.app.notta.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.R;
import te.app.notta.base.BaseViewModel;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.auth.register.EditProfileFragment;
import te.app.notta.pages.home.PointsFragment;
import te.app.notta.pages.myGroups.MyGroupsFragment;
import te.app.notta.pages.settings.AboutFragment;
import te.app.notta.pages.settings.ContactUsFragment;
import te.app.notta.pages.settings.LangFragment;
import te.app.notta.pages.settings.adapters.MoreAdapter;
import te.app.notta.pages.settings.adapters.ProfileAdaptersAdapter;
import te.app.notta.pages.settings.models.AboutData;
import te.app.notta.pages.settings.models.ContactUsRequest;
import te.app.notta.pages.settings.models.ProfileItem;
import te.app.notta.pages.teacher.StudentRequestsFragment;
import te.app.notta.repository.AuthRepository;
import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.utils.Constants;


public class SettingsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    AuthRepository repository;
    ContactUsRequest contactUsRequest;
    ProfileAdaptersAdapter profileAdaptersAdapter;
    MoreAdapter moreAdapter;
    AboutData aboutData;

    @Inject
    public SettingsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getAboutOrTerms() {
        compositeDisposable.add(repository.getAboutOrTerms(getPassingObject().getId()));
    }

    public void sendContact() {
        if (getContactUsRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.sendContact(getContactUsRequest()));
        }
    }

    public void setupProfile() {
        List<ProfileItem> profileItems = new ArrayList<>();
        profileItems.add(new ProfileItem(1, getString(R.string.edit_profile), R.drawable.ic_profile, EditProfileFragment.class.getName()));
        profileItems.add(new ProfileItem(2, getString(R.string.my_groups), R.drawable.ic_groups, MyGroupsFragment.class.getName()));
        profileItems.add(new ProfileItem(3, getString(R.string.my_requests), R.drawable.ic_requets, StudentRequestsFragment.class.getName()));
        profileItems.add(new ProfileItem(4, getString(R.string.my_gifts), R.drawable.ic_gift, PointsFragment.class.getName()));
        getProfileAdaptersAdapter().update(profileItems);
        notifyChange(BR.profileAdaptersAdapter);
    }

    public void setupMore() {
        List<ProfileItem> profileItems = new ArrayList<>();
        profileItems.add(new ProfileItem(1, getString(R.string.about_app), R.drawable.ic_about, AboutFragment.class.getName()));
        profileItems.add(new ProfileItem(2, getString(R.string.contact_title), R.drawable.ic_contact, ContactUsFragment.class.getName()));
        profileItems.add(new ProfileItem(3, getString(R.string.terms), R.drawable.ic_terms, AboutFragment.class.getName()));
        profileItems.add(new ProfileItem(4, getString(R.string.rate_app), R.drawable.ic_rate, null));
        profileItems.add(new ProfileItem(5, getString(R.string.share_app), R.drawable.ic_share, null));
        profileItems.add(new ProfileItem(6, getString(R.string.change_lang), R.drawable.ic_lang, LangFragment.class.getName()));
        getMoreAdapter().update(profileItems);
        notifyChange(BR.moreAdapter);
    }

    @Bindable
    public ProfileAdaptersAdapter getProfileAdaptersAdapter() {
        return this.profileAdaptersAdapter == null ? this.profileAdaptersAdapter = new ProfileAdaptersAdapter() : this.profileAdaptersAdapter;
    }

    @Bindable
    public MoreAdapter getMoreAdapter() {
        return this.moreAdapter == null ? this.moreAdapter = new MoreAdapter() : this.moreAdapter;
    }

    @Bindable
    public AboutData getAboutData() {
        return this.aboutData == null ? this.aboutData = new AboutData() : this.aboutData;
    }

    public void setAboutData(AboutData aboutData) {
        notifyChange(BR.aboutData);
        this.aboutData = aboutData;
    }

    public void logout() {
        liveData.setValue(new Mutable(Constants.LOGOUT));
    }

    public void profile() {
        liveData.setValue(new Mutable(Constants.EDIT_PROFILE));
    }

    public ContactUsRequest getContactUsRequest() {
        return this.contactUsRequest == null ? this.contactUsRequest = new ContactUsRequest() : this.contactUsRequest;
    }

    public AuthRepository getRepository() {
        return repository;
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

}
