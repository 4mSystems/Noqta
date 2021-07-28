package grand.app.aber_provider.pages.favorites.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.adapters.PostsAdapter;
import grand.app.aber_provider.pages.home.models.NewPostRequest;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class FavoritesViewModels extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private PostsAdapter postsAdapter;
    @Inject
    PostRepository postRepository;
    NewPostRequest newPostRequest;
    PostData postData;
    List<FileObject> fileObject;
    CreateCommentRequest createCommentRequest;

    @Inject
    public FavoritesViewModels(PostRepository postRepository) {
        fileObject = new ArrayList<>();
        postData = new PostData();
        createCommentRequest = new CreateCommentRequest();
        newPostRequest = new NewPostRequest();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void newPost() {
        if (getNewPostRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            if (getPassingObject().getObjectClass() == null)
                compositeDisposable.add(postRepository.createPost(getNewPostRequest(), getFileObject()));
            else
                compositeDisposable.add(postRepository.editPost(getNewPostRequest(), getPostData().getId(), getFileObject()));
        } else
            liveData.setValue(new Mutable(Constants.WARNING));
    }

    public void createLive() {
        getNewPostRequest().setStartAt(getNewPostRequest().date.concat(" ").concat(getNewPostRequest().time));
        FileObject fileObject = new FileObject(Constants.FILE, getNewPostRequest().filePath, Constants.FILE_TYPE_VIDEO);
        getFileObject().add(fileObject);
        getNewPostRequest().setFilePath(null);
        setMessage(Constants.SHOW_PROGRESS);
        compositeDisposable.add(postRepository.createLive(getNewPostRequest(), getFileObject()));
    }

    public void addAnswer() {
        if (getPassingObject().getObject().equals(Constants.Add_ANSWER)) {
            if (!TextUtils.isEmpty(getCreateCommentRequest().getText())) {
                getCreateCommentRequest().setPostId(getPassingObject().getId());
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(postRepository.comment(getCreateCommentRequest(), getFileObject()));
            } else
                liveData.setValue(new Mutable(Constants.WARNING));
        } else {
            if (getNewPostRequest().isValid()) {
                getNewPostRequest().setUserId(String.valueOf(getPassingObject().getId()));
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(postRepository.askUser(getNewPostRequest(), getFileObject()));
            } else
                liveData.setValue(new Mutable(Constants.WARNING));
        }
    }

    public void buttonsAction(String action) {
        if (action.equals(Constants.REMOVE_IMAGE)) {
            getFileObject().clear();
            notifyChange(BR.fileObject);
        } else
            liveData.setValue(new Mutable(action));
    }

    @Bindable
    public List<FileObject> getFileObject() {
        return fileObject;
    }

    public NewPostRequest getNewPostRequest() {
        return newPostRequest;
    }

    public void setNewPostRequest(NewPostRequest newPostRequest) {
        this.newPostRequest = newPostRequest;
    }

    @Bindable
    public PostsAdapter getPostsAdapter() {
        return this.postsAdapter == null ? this.postsAdapter = new PostsAdapter() : this.postsAdapter;
    }

    public PostData getPostData() {
        return postData;
    }

    public void setPostData(PostData postData) {
        if (getPassingObject().getObjectClass() != null) {
            getNewPostRequest().setTitle(postData.getTitle());
            getNewPostRequest().setContent(postData.getContent());
            notifyChange();
        }
        this.postData = postData;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    public CreateCommentRequest getCreateCommentRequest() {
        return createCommentRequest;
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
