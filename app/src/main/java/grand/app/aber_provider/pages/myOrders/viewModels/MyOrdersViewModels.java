package grand.app.aber_provider.pages.myOrders.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.OrderAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class MyOrdersViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private OrderAdapter postsAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    MainData mainData;

    @Inject
    public MyOrdersViewModels(ServicesRepository postRepository) {
        mainData = new MainData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void posts(int page, boolean showProgress) {
//        compositeDisposable.add(postRepository.getPackages(page, showProgress));
    }
    @Bindable
    public OrderAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new OrderAdapter() : this.postsAdapter;
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
