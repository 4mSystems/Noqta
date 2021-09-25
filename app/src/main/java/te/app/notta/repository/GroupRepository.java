package te.app.notta.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.notta.connection.ConnectionHelper;
import te.app.notta.connection.FileObject;
import te.app.notta.model.MainRequest;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.home.models.details.GroupDetailsResponse;
import te.app.notta.pages.home.models.groupStudents.GroupStudentsResponse;
import te.app.notta.pages.home.models.points.PointsResponse;
import te.app.notta.pages.teacher.models.AddGiftRequest;
import te.app.notta.pages.teacher.models.AddGroupRequest;
import te.app.notta.pages.home.models.HomeResponse;
import te.app.notta.pages.teacher.models.AddGroupResponse;
import te.app.notta.pages.teacher.models.AddTaskRequest;
import te.app.notta.pages.teacher.models.SendInvitationsRequest;
import te.app.notta.pages.teacher.models.inviteStudents.StudentsResponse;
import te.app.notta.utils.Constants;
import te.app.notta.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class GroupRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public GroupRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getHome(int page, boolean showProgress, String searchText) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME + searchText + "&page=" + page, new Object(), HomeResponse.class,
                Constants.HOME, showProgress);
    }

    public Disposable addGroup(AddGroupRequest groupRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_GROUP, groupRequest, AddGroupResponse.class,
                Constants.ADD_GROUP, false);
    }

    public Disposable sendInvitations(SendInvitationsRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_INVITATIONS, request, StatusMessage.class,
                Constants.SEND_INVITATIONS, false);
    }

    public Disposable getStudentToInvite(int page, boolean showProgress, String search) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.INVITE_STUDENTS + search + "&page=" + page, new Object(), StudentsResponse.class,
                Constants.STUDENT, showProgress);
    }

    public Disposable getMyGroups() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.INVITE_STUDENTS, new Object(), StudentsResponse.class,
                Constants.STUDENT, true);
    }

    public Disposable addTask(AddTaskRequest request, List<FileObject> fileObjects) {
        return connectionHelper.requestApi(URLS.ADD_TASK, request, fileObjects, StatusMessage.class,
                Constants.ADD_TASK, false);
    }

    public Disposable getGroupDetails(int groupId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GROUP_DETAILS + groupId, new Object(), GroupDetailsResponse.class,
                Constants.GROUP_DETAILS, true);
    }

    public Disposable deleteGroup(int groupId) {
        MainRequest request = new MainRequest();
        request.setGroupId(String.valueOf(groupId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.DELETE_GROUP, request, StatusMessage.class,
                Constants.DELETE_GROUP, true);
    }

    public Disposable deleteTask(int taskId) {
        MainRequest request = new MainRequest();
        request.setTaskId(String.valueOf(taskId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.DELETE_TASK, request, StatusMessage.class,
                Constants.DELETE_TASK, true);
    }

    public Disposable getPoints() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POINTS, new Object(), PointsResponse.class,
                Constants.MENU_GIFTS, true);
    }

    public Disposable createPoints(AddGiftRequest request, List<FileObject> objectList) {
        return connectionHelper.requestApi(URLS.ADD_GIFT, request, objectList, StatusMessage.class,
                Constants.ADD_GIFT, false);
    }

    public Disposable deleteGift(int lastSelected) {
        MainRequest request = new MainRequest();
        request.setGiftId(String.valueOf(lastSelected));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.DELETE_GIFT, request, StatusMessage.class,
                Constants.DELETE_GIFT, true);
    }

    public Disposable getGroupStudents(int groupId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GROUP_STUDENTS + groupId + "&page=" + page, new Object(), GroupStudentsResponse.class,
                Constants.STUDENT, showProgress);
    }
}