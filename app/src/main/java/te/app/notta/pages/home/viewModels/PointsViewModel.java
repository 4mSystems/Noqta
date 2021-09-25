package te.app.notta.pages.home.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.base.BaseViewModel;
import te.app.notta.connection.FileObject;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.home.adapters.PointsAdapter;
import te.app.notta.pages.teacher.models.AddGiftRequest;
import io.reactivex.disposables.CompositeDisposable;
import te.app.notta.repository.GroupRepository;
import te.app.notta.utils.Constants;


public class PointsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    PointsAdapter pointsAdapter;
    AddGiftRequest request;
    public List<FileObject> fileObjects = new ArrayList<>();

    @Inject
    public PointsViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getPoints() {
        compositeDisposable.add(repository.getPoints());
    }

    public void deleteGift() {
        compositeDisposable.add(repository.deleteGift(getPointsAdapter().lastSelected));
    }

    public void createGift() {
        if (getRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.createPoints(getRequest(), fileObjects));
        }
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void onPointsTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getRequest().setPoints("1");
        }
        notifyChange(BR.request);
    }

    @Bindable
    public AddGiftRequest getRequest() {
        return this.request == null ? this.request = new AddGiftRequest() : this.request;
    }

    @Bindable
    public PointsAdapter getPointsAdapter() {
        return this.pointsAdapter == null ? this.pointsAdapter = new PointsAdapter() : this.pointsAdapter;
    }

    public GroupRepository getRepository() {
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
