package grand.app.aber_provider.pages.packages.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.PostsAdapter;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.repository.PostRepository;
import io.reactivex.disposables.CompositeDisposable;

public class PackagesViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PostsAdapter postsAdapter;
    @Inject
    PostRepository postRepository;
    MainData mainData;

    @Inject
    public PackagesViewModels(PostRepository postRepository) {
        mainData = new MainData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void posts(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.getPosts(page, showProgress));
    }

    public void liveDataActions(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public PostsAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new PostsAdapter() : this.postsAdapter;
    }

    @Bindable
    public MainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(MainData mainData) {
        if (getPostsAdapter().getPostDataList().size() > 0) {
            getPostsAdapter().loadMore(mainData.getPostDataList());
        } else {
            getPostsAdapter().update(mainData.getPostDataList());
            notifyChange(BR.postsAdapter);
        }
        notifyChange(BR.mainData);
        this.mainData = mainData;
    }

    public PostRepository getPostRepository() {
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
