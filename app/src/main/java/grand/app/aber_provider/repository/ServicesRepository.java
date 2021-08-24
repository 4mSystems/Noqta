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
import grand.app.aber_provider.pages.home.models.HomeResponse;
import grand.app.aber_provider.pages.home.models.ReactPostRequest;
import grand.app.aber_provider.pages.packages.models.PackagesResponse;
import grand.app.aber_provider.pages.packages.models.RequestToSend;
import grand.app.aber_provider.pages.postDetails.models.OrderDetailsResponse;
import grand.app.aber_provider.pages.profile.models.FollowersResponse;
import grand.app.aber_provider.pages.profile.models.UserActionRequest;
import grand.app.aber_provider.pages.profile.models.profile.UserProfileResponse;
import grand.app.aber_provider.pages.profile.models.reportReasons.ReportResponse;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ServicesRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ServicesRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getPackages() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PACKAGES, new Object(), PackagesResponse.class,
                Constants.PACKAGES, true);
    }

    public Disposable subscribe(int id) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SUBSCRIBE, new RequestToSend(id), StatusMessage.class,
                Constants.SUBSCRIPTION, true);
    }

    public Disposable getHome() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }


    public Disposable createPost(NewPostRequest newPostRequest, List<FileObject> fileObjects) {
        if (fileObjects.size() == 0)
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.HOME, newPostRequest, NewPostResponse.class,
                    Constants.NEW_POST, false);
        else
            return connectionHelper.requestApi(URLS.HOME, newPostRequest, fileObjects, NewPostResponse.class,
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

    public Disposable orderDetails(int orderId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POST_DETAILS + orderId, new Object(), OrderDetailsResponse.class,
                Constants.ORDER_DETAILS, true);
    }

    public Disposable liveDetails(int postId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LIVE_DETAILS + postId, new Object(), OrderDetailsResponse.class,
                Constants.ORDER_DETAILS, true);
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

    public Disposable search(int page, boolean showProgress, String search, String type) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SEARCH_POSTS + type + "&search=" + search + "&page=" + page, new Object(), HomeResponse.class,
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

    public Disposable userProfile(int postId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.USER_PROFILE + postId, new Object(), UserProfileResponse.class,
                Constants.PROFILE, true);
    }

    public Disposable userProfilePosts(int page, String url, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + "&page=" + page, new Object(), HomeResponse.class,
                Constants.PROFILE_POSTS, showProgress);
    }

    public Disposable notAnsweredQuestions(int page, String url, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + page, new Object(), HomeResponse.class,
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