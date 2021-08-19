package grand.app.aber_provider.pages.profile.viewModels;


import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.profile.adapters.QuestionedPostsAdapter;
import grand.app.aber_provider.repository.ServicesRepository;
import io.reactivex.disposables.CompositeDisposable;

public class QuestionsPostsViewModels extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private QuestionedPostsAdapter questionedPostsAdapter;
    @Inject
    ServicesRepository postRepository;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    MainData mainData;

    @Inject
    public QuestionsPostsViewModels(ServicesRepository postRepository) {
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void profilePosts(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.notAnsweredQuestions(page, getPassingObject().getObject(), showProgress));
    }

    public void deletePost() {
        compositeDisposable.add(postRepository.deleteQuestionedPost(getQuestionedPostsAdapter().lastSelected));
    }

    public void liveDataActions(String action) {
        liveData.setValue(new Mutable(action));
    }


    @Bindable
    public QuestionedPostsAdapter getQuestionedPostsAdapter() {
        return this.questionedPostsAdapter == null ? this.questionedPostsAdapter = new QuestionedPostsAdapter() : this.questionedPostsAdapter;
    }

    @Bindable
    public MainData getMainData() {
        return mainData;
    }

    @Bindable
    public void setMainData(MainData mainData) {
        getQuestionedPostsAdapter().isProfile = false;
        if (getQuestionedPostsAdapter().getPostDataList().size() > 0) {
            getQuestionedPostsAdapter().loadMore(mainData.getOrdersList());
        } else {
            getQuestionedPostsAdapter().update(mainData.getOrdersList());
            notifyChange(BR.questionedPostsAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.mainData);
        this.mainData = mainData;
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
