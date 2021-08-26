package grand.app.aber_provider.pages.profile.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.OrderAdapter;
import grand.app.aber_provider.pages.profile.adapters.ReportReasonsAdapter;
import grand.app.aber_provider.pages.profile.models.UserActionRequest;
import grand.app.aber_provider.pages.profile.models.profile.UserProfile;
import grand.app.aber_provider.repository.ServicesRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import grand.app.aber_provider.utils.session.UserHelper;
import io.reactivex.disposables.CompositeDisposable;

public class ProfileViewModels extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrderAdapter postsAdapter;
    private ReportReasonsAdapter reportReasonsAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    public String search;
    UserProfile userProfile;
    UserActionRequest actionRequest;

    @Inject
    public ProfileViewModels(ServicesRepository postRepository) {
        userProfile = new UserProfile();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
        actionRequest = new UserActionRequest();
    }

    public void userProfile() {
        compositeDisposable.add(postRepository.userProfile(getPassingObject().getId()));
    }

    public void reportUser() {
        List<Integer> reasonsIds = new ArrayList<>();
        for (int i = 0; i < getReportReasonsAdapter().getReportDataList().size(); i++) {
            if (getReportReasonsAdapter().getReportDataList().get(i).isChecked())
                reasonsIds.add(getReportReasonsAdapter().getReportDataList().get(i).getId());
        }
        if (reasonsIds.size() > 0) {
            liveDataActions(Constants.DIALOG_CLOSE);
            actionRequest.setReasonIds(reasonsIds);
            actionRequest.setUserId(getPassingObject().getId());
            compositeDisposable.add(postRepository.reportUser(actionRequest));
        }
    }


    public void liveDataActions(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public OrderAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new OrderAdapter() : this.postsAdapter;
    }

    @Bindable
    public ReportReasonsAdapter getReportReasonsAdapter() {
        return this.reportReasonsAdapter == null ? this.reportReasonsAdapter = new ReportReasonsAdapter() : this.reportReasonsAdapter;
    }

    @Bindable
    public UserProfile getUserProfile() {
        return userProfile;
    }

    @Bindable
    public void setUserProfile(UserProfile userProfile) {
        UserHelper.getInstance(MyApplication.getInstance()).userProfile(userProfile);
        notifyChange(BR.userProfile);
        this.userProfile = userProfile;
    }

    public ServicesRepository getPostRepository() {
        return postRepository;
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
