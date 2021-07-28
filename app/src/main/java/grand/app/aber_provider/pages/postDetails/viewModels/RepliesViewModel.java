package grand.app.aber_provider.pages.postDetails.viewModels;


import android.util.Log;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.CommentsPaginate;
import grand.app.aber_provider.pages.postDetails.adapters.CommentsAdapter;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.repository.PostRepository;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import io.reactivex.disposables.CompositeDisposable;

public class RepliesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    PostRepository postRepository;
    CommentsPaginate commentsPaginate;
    Comments mainComment;
    CommentsAdapter commentsAdapter;
    CreateCommentRequest createCommentRequest;
    public ObservableBoolean searchProgressVisible = new ObservableBoolean();
    List<FileObject> fileObject;
    public ObservableBoolean like = new ObservableBoolean();

    @Inject
    public RepliesViewModel(PostRepository postRepository) {
        fileObject = new ArrayList<>();
        createCommentRequest = new CreateCommentRequest();
        mainComment = new Comments();
        commentsPaginate = new CommentsPaginate();
        this.postRepository = postRepository;
        this.liveData = new MutableLiveData<>();
        postRepository.setLiveData(liveData);
    }

    public void replies(int page, boolean showProgress) {
        compositeDisposable.add(postRepository.replies(getPassingObject().getId(), page, showProgress));
    }

    public void reactPost(int id, String reactType) {
        compositeDisposable.add(postRepository.reactPost(id, reactType));
    }

    public void deleteComment() {
        compositeDisposable.add(postRepository.deletePostComment(getCommentsAdapter().lastSelected));
    }

    public void createComment() {
        getCreateCommentRequest().setPostId(Integer.parseInt(getPassingObject().getObject())); // post id
        getCreateCommentRequest().setParentId(String.valueOf(getMainComment().getId()));
        Log.e("createComment", "createComment: " + getCreateCommentRequest().getParentId());
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
            case Constants.MAKE_COMMENT:
            case Constants.IMAGE:
            case Constants.OPTIONS:
            case Constants.PROFILE:
                liveData.setValue(new Mutable(action));
                break;
            case Constants.REMOVE_IMAGE:
                getFileObject().clear();
                notifyChange(BR.fileObject);
                break;
            case Constants.LIKE:
                AppHelper.makeActionSound(MyApplication.getInstance(), action);
                like.set(!getMainComment().isLiked());
                getMainComment().setLiked(!getMainComment().isLiked());
                reactPost(getMainComment().getId(), getMainComment().isLiked() ? null : "like");
                break;

        }
    }

    @Bindable
    public Comments getMainComment() {
        return mainComment;
    }

    @Bindable
    public void setMainComment(Comments mainComment) {
        like.set(mainComment.isLiked());
        getCommentsAdapter().isVisible = false;
        if (getCommentsAdapter().getCommentsList().size() > 0) {
            getCommentsAdapter().loadMore(mainComment.getCommentsPaginate().getComments());
        } else {
            getCommentsAdapter().update(mainComment.getCommentsPaginate().getComments());
            notifyChange(BR.postsAdapter);
        }
        searchProgressVisible.set(false);
        notifyChange(BR.mainComment);
        this.mainComment = mainComment;
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
