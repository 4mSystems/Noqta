package grand.app.aber_provider.pages.auth.countries.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.models.RegisterRequest;
import grand.app.aber_provider.pages.auth.countries.adapters.CountriesAdapter;
import grand.app.aber_provider.pages.auth.countries.models.UserCertificatesItem;
import grand.app.aber_provider.repository.AuthRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class CountriesViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;
    CountriesAdapter memberCertificatesAdapter;
    public List<UserCertificatesItem> certificatesItems = new ArrayList<>();

    @Inject
    public CountriesViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
        certificatesItems.add(new UserCertificatesItem());
        getMemberCertificatesAdapter().updateData(certificatesItems);
        notifyChange(BR.memberCertificatesAdapter);
    }

    public void register() {
        if (getRequest().isUpgradeValid()) {
            if (getFileObject().size() > 0) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.upgradeAccount(request, fileObject));
            } else {
                liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.select_image_profile)));
            }
        } else
            liveData.setValue(new Mutable(Constants.ERROR, ResourceManager.getString(R.string.empty_warning)));
    }

    @Bindable
    public CountriesAdapter getMemberCertificatesAdapter() {
        return this.memberCertificatesAdapter == null ? this.memberCertificatesAdapter = new CountriesAdapter() : this.memberCertificatesAdapter;
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

    public AuthRepository getRepository() {
        return repository;
    }

    public RegisterRequest getRequest() {
        return request;
    }

    public List<FileObject> getFileObject() {
        return fileObject;
    }

}
