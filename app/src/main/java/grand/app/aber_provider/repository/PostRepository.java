package grand.app.aber_provider.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import grand.app.aber_provider.connection.ConnectionHelper;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.NewPostRequest;
import grand.app.aber_provider.pages.home.models.NewPostResponse;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.home.models.ReactPostRequest;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.CommentResponse;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.pages.postDetails.models.PostDetailsResponse;
import grand.app.aber_provider.pages.postDetails.models.RepliesResponse;
import grand.app.aber_provider.pages.postDetails.models.postReacts.PostReactsResponse;
import grand.app.aber_provider.pages.profile.models.FollowersResponse;
import grand.app.aber_provider.pages.profile.models.UserActionRequest;
import grand.app.aber_provider.pages.profile.models.profile.UserProfileResponse;
import grand.app.aber_provider.pages.profile.models.reportReasons.ReportResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class PostRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public PostRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getPosts(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POSTS + page, new Object(), PostsResponse.class,
                Constants.POSTS, showProgress);
    }
  public Disposable getLives(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LIVE_STREAMS + page, new Object(), PostsResponse.class,
                Constants.POSTS, showProgress);
    }

    public Disposable getFollowersPosts(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.FOLLOWERS_POSTS + page, new Object(), PostsResponse.class,
                Constants.POSTS, showProgress);
    }

    public Disposable reActions(int postId, int page, boolean showProgress, String reactType) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POST_REACTS + postId + "&type=" + reactType + "&page=" + page, new Object(), PostReactsResponse.class,
                Constants.POST_REACTS, showProgress);
    }

    public Disposable createPost(NewPostRequest newPostRequest, List<FileObject> fileObjects) {
        if (fileObjects.size() == 0)
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CREATE_POST, newPostRequest, NewPostResponse.class,
                    Constants.NEW_POST, false);
        else
            return connectionHelper.requestApi(URLS.CREATE_POST, newPostRequest, fileObjects, NewPostResponse.class,
                    Constants.NEW_POST, false);
    }

    public Disposable createLive(NewPostRequest newPostRequest, List<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.CREATE_LIVE, newPostRequest, fileObjects, NewPostResponse.class,
                Constants.NEW_POST, false);
    }

    public Disposable askUser(NewPostRequest newPostRequest, List<FileObject> fileObjects) {
        if (fileObjects.size() == 0)
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ASK_USER, newPostRequest, NewPostResponse.class,
                    Constants.NEW_POST, false);
        else
            return connectionHelper.requestApi(URLS.ASK_USER, newPostRequest, fileObjects, NewPostResponse.class,
                    Constants.NEW_POST, false);
    }

    public Disposable editPost(NewPostRequest newPostRequest, int postId, List<FileObject> fileObjects) {
        if (fileObjects.size() == 0)
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_POST + postId, newPostRequest, NewPostResponse.class,
                    Constants.NEW_POST, false);
        else
            return connectionHelper.requestApi(URLS.EDIT_POST + postId, newPostRequest, fileObjects, NewPostResponse.class,
                    Constants.NEW_POST, false);
    }

    public Disposable postDetails(int postId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POST_DETAILS + postId + "?page=" + page, new Object(), PostDetailsResponse.class,
                Constants.POST_DETAILS, showProgress);
    }

    public Disposable liveDetails(int postId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LIVE_DETAILS + postId, new Object(), PostDetailsResponse.class,
                Constants.POST_DETAILS, true);
    }

    public Disposable deletePost(int postId) {
        return connectionHelper.requestApi(Constants.DELETE_REQUEST, URLS.DELETE_POST + postId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable deleteQuestionedPost(int postId) {
        return connectionHelper.requestApi(Constants.DELETE_REQUEST, URLS.DELETE_QUESTIONED_POST + postId, new Object(), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable hidePost(int postId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.HIDE_POST, new NewPostRequest(String.valueOf(postId)), StatusMessage.class,
                Constants.DELETE, true);
    }

    public Disposable sharePost(int postId) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SHARE_POST, new NewPostRequest(String.valueOf(postId)), StatusMessage.class,
                Constants.SHARE_POST, true);
    }

    public Disposable reactPost(int postId, String reactType) {
        return connectionHelper.requestApiBackground(Constants.POST_REQUEST, URLS.REACT_POST, new ReactPostRequest(postId, reactType));
    }

    public Disposable comment(CreateCommentRequest commentRequest, List<FileObject> fileObjects) {
        if (commentRequest.getCommentId() == 0) {
            if (fileObjects.size() > 0)
                return connectionHelper.requestApi(URLS.MAKE_COMMENT, commentRequest, fileObjects, CommentResponse.class,
                        Constants.COMMENT, false);
            else
                return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.MAKE_COMMENT, commentRequest, CommentResponse.class,
                        Constants.COMMENT, false);
        } else {
            if (fileObjects.size() > 0)
                return connectionHelper.requestApi(URLS.EDIT_COMMENT + commentRequest.getCommentId(), commentRequest, fileObjects, CommentResponse.class,
                        Constants.EDIT_COMMENT, false);
            else
                return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.EDIT_COMMENT + commentRequest.getCommentId(), commentRequest, CommentResponse.class,
                        Constants.EDIT_COMMENT, false);
        }


    }

    public Disposable search(int page, boolean showProgress, String search, String type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH_POSTS + type + "&search=" + search + "&page=" + page, new Object(), PostsResponse.class,
                Constants.SEARCH, showProgress);
    }

    public Disposable searchPeople(int page, boolean showProgress, String search, String type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH_POSTS + type + "&search=" + search + "&page=" + page, new Object(), FollowersResponse.class,
                Constants.SEARCH, showProgress);
    }

    public Disposable deletePostComment(int commentId) {
        return connectionHelper.requestApi(Constants.DELETE_REQUEST, URLS.DELETE_COMMENT + commentId, new Object(), StatusMessage.class,
                Constants.DELETE_COMMENT, true);
    }

    public Disposable replies(int commentId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COMMENT_REPLIES + commentId + "&page=" + page, new Object(), RepliesResponse.class,
                Constants.REPLIES, showProgress);
    }

    public Disposable userProfile(int postId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.USER_PROFILE + postId, new Object(), UserProfileResponse.class,
                Constants.PROFILE, true);
    }

    public Disposable userProfilePosts(int page, String url, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + "&page=" + page, new Object(), PostsResponse.class,
                Constants.PROFILE_POSTS, showProgress);
    }

    public Disposable notAnsweredQuestions(int page, String url, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + page, new Object(), PostsResponse.class,
                Constants.PROFILE_POSTS, showProgress);
    }

    public Disposable userProfileFollowers(int page, String url, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + "&page=" + page, new Object(), FollowersResponse.class,
                Constants.FOLLOWERS, showProgress);
    }

    public Disposable changeFollowStatus(UserActionRequest actionRequest, String url) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, url, actionRequest, StatusMessage.class,
                Constants.FOLLOW, true);
    }

    public Disposable seeFirst(UserActionRequest actionRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEE_FIRST, actionRequest, StatusMessage.class,
                Constants.SEE_FIRST, true);
    }
 public Disposable banUser(UserActionRequest actionRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.BAN_USER, actionRequest, StatusMessage.class,
                Constants.BAN_USER, true);
    }

    public Disposable reportUser(UserActionRequest actionRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REPORT_USER, actionRequest, StatusMessage.class,
                Constants.REPORT_USER, true);
    }

    public Disposable reportReasons() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.REPORT_REASONS, new Object(), ReportResponse.class,
                Constants.REPORT_REASONS, true);
    }

}