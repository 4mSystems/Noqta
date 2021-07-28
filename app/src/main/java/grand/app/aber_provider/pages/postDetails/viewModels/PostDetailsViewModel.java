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
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.postDetails.adapters.CommentsAdapter;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;
import io.reactivex.disposables.CompositeDisposable;

public class PostDetailsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    PostRepository postRepository;
    PostData postData;
    CommentsAdapter commentsAdapter;
    CreateCommentRequest createCommentRequest;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    public ObservableBoolean like = new ObservableBoolean();
    public ObservableBoolean dislike = new ObservableBoolean();
    public ObservableField<String> likesTitle = new ObservableField<>();
    List<FileObject> fileObject;

    @Inject
    public PostDetailsViewModel(PostRepository postRepository) {
        fileObject = new ArrayList<>();
        createCommentRequest = new CreateCommentRequest();
        postData = new PostData();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void postDetails(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.postDetails(getPassingObject().getId(), page, showProgress));
    }

    public void liveDetails() {
        compositeDisposable.add(postRepository.liveDetails(getPassingObject().getId()));
    }

    public void reactPost(int id, String reactType) {
        compositeDisposable.add(postRepository.reactPost(id, reactType));
    }

    public void deletePost() {
        compositeDisposable.add(postRepository.deletePost(getPassingObject().getId()));
    }

    public void hidePost() {
        compositeDisposable.add(postRepository.hidePost(getPassingObject().getId()));
    }

    public void sharePost() {
        compositeDisposable.add(postRepository.sharePost(getPassingObject().getId()));
    }

    public void deleteComment() {
        compositeDisposable.add(postRepository.deletePostComment(getCommentsAdapter().lastSelected));
    }

    public void createComment() {
        getCreateCommentRequest().setPostId(getPassingObject().getId());
        if (getFileObject().size() == 0) {
            if (getCreateCommentRequest().isValid()) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(postRepository.comment(getCreateCommentRequest(), getFileObject()));
            }
        } else {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(postRepository.comment(getCreateCommentRequest(), getFileObject()));
        }

    }

    public void buttonAction(String action) {
        switch (action) {
            case Constants.LIKE:
                AppHelper.makeActionSound(MyApplication.getInstance(), Constants.LIKE);
                reactPost(getPostData().getId(), getPostData().isLiked() ? null : "like");
                getPostData().setAll_reacts(getPostData().isLiked() ? getPostData().getAll_reacts() - 1 : getPostData().getAll_reacts() + 1);
                getPostData().setLiked(!getPostData().isLiked());
                like.set(getPostData().isLiked());
                if (dislike.get()) {
                    dislike.set(false);
                    getPostData().setDisLiked(false);
                    getPostData().setAll_reacts(getPostData().getAll_reacts() - 1);
                }
                likesTitle.set(likeTitle(getPostData()));
                break;
            case Constants.DIS_LIKE:
                AppHelper.makeActionSound(MyApplication.getInstance(), Constants.LIKE);
                reactPost(getPostData().getId(), getPostData().isDisLiked() ? null : "dislike");
                getPostData().setAll_reacts(getPostData().isDisLiked() ? getPostData().getAll_reacts() - 1 : getPostData().getAll_reacts() + 1);
                getPostData().setDisLiked(!getPostData().isDisLiked());
                if (like.get()) {
                    like.set(false);
                    getPostData().setLiked(false);
                    getPostData().setAll_reacts(getPostData().getAll_reacts() - 1);
                }
                dislike.set(getPostData().isDisLiked());
                likesTitle.set(likeTitle(getPostData()));
                break;
            case Constants.MAKE_COMMENT:
            case Constants.IMAGE:
            case Constants.OPTIONS:
            case Constants.POST_REACTS:
            case Constants.PLAY_VIDEO:
            case Constants.PROFILE:
                liveData.setValue(new Mutable(action));
                break;
            case Constants.REMOVE_IMAGE:
                getFileObject().clear();
                notifyChange(BR.fileObject);
                break;


        }
    }

    @Bindable
    public PostData getPostData() {
        return postData;
    }

    @Bindable
    public void setPostData(PostData postData) {
        getCommentsAdapter().postId = getPassingObject().getId();
        if (getCommentsAdapter().getCommentsList().size() > 0) {
            getCommentsAdapter().loadMore(postData.getCommentsPaginate().getComments());
        } else {
            getCommentsAdapter().update(postData.getCommentsPaginate().getComments());
            notifyChange(BR.postsAdapter);
        }
        searchProgressVisible.set(false);
        like.set(postData.isLiked());
        dislike.set(postData.isDisLiked());
        postData.setAll_reacts((like.get() || dislike.get()) ? postData.getAll_reacts() - 1 : postData.getAll_reacts());
        likesTitle.set(likeTitle(postData));
        notifyChange(BR.postData);
        this.postData = postData;
    }


    public String likeTitle(PostData postData) {
        if ((like.get() || dislike.get()) && postData.getAll_reacts() > 1) {
            return userData.getName().concat(ResourceManager.getString(R.string.wawo)).concat(String.valueOf(postData.getAll_reacts())).concat(ResourceManager.getString(R.string.select_country));
        } else if ((like.get() || dislike.get()) && postData.getAll_reacts() == 1) {
            return userData.getName();
        } else if ((!like.get() || !dislike.get()) && postData.getAll_reacts() > 0) {
            return String.valueOf(postData.getAll_reacts()).concat(ResourceManager.getString(R.string.select_country));
        }
        return "";
    }

    public void setEditedDataToInput() {
        getCreateCommentRequest().setText(getCommentsAdapter().getCommentsList().get(getCommentsAdapter().lastPosition).getText());
        getCreateCommentRequest().setCommentId(getCommentsAdapter().getCommentsList().get(getCommentsAdapter().lastPosition).getId());
        setCreateCommentRequest(getCreateCommentRequest());
    }

    @Bindable
    public CreateCommentRequest getCreateCommentRequest() {
        return createCommentRequest;
    }

    @Bindable
    public void setCreateCommentRequest(CreateCommentRequest createCommentRequest) {
        notifyChange(BR.createCommentRequest);
        this.createCommentRequest = createCommentRequest;
    }

    @Bindable
    public List<FileObject> getFileObject() {
        return fileObject;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    @Bindable
    public CommentsAdapter getCommentsAdapter() {
        return this.commentsAdapter == null ? this.commentsAdapter = new CommentsAdapter() : this.commentsAdapter;
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
