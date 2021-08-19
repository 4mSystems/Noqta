package grand.app.aber_provider.pages.postDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.pages.postDetails.adapters.CommentsAdapter;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.repository.ServicesRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class PostDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ServicesRepository postRepository;
    Orders postData;
    CreateCommentRequest createCommentRequest;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    List<FileObject> fileObject;

    @Inject
    public PostDetailsViewModel(ServicesRepository postRepository) {
        fileObject = new ArrayList<>();
        createCommentRequest = new CreateCommentRequest();
        postData = new Orders();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void postDetails(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.postDetails(getPassingObject().getId(), page, showProgress));
    }

    @Bindable
    public List<FileObject> getFileObject() {
        return fileObject;
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
