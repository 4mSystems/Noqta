package te.app.nottaa.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.nottaa.PassingObject;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.connection.ConnectionHelper;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.model.MainRequest;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.addAnswer.models.AddAnswerRequest;
import te.app.nottaa.pages.addAnswer.models.TaskDetailsResponse;
import te.app.nottaa.pages.groupDetails.models.details.GroupDetailsResponse;
import te.app.nottaa.pages.groupDetails.models.groupStudents.GroupStudentsResponse;
import te.app.nottaa.pages.groupDetails.models.studentTasks.StudentTasksResponse;
import te.app.nottaa.pages.points.models.PointsResponse;
import te.app.nottaa.pages.points.models.students.StudentPointsResponse;
import te.app.nottaa.pages.teacher.models.AddGiftRequest;
import te.app.nottaa.pages.teacher.models.AddGroupRequest;
import te.app.nottaa.pages.home.models.HomeResponse;
import te.app.nottaa.pages.teacher.models.AddGroupResponse;
import te.app.nottaa.pages.teacher.models.AddTaskRequest;
import te.app.nottaa.pages.teacher.models.SendInvitationsRequest;
import te.app.nottaa.pages.teacher.models.inviteStudents.StudentsResponse;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.URLS;
import io.reactivex.disposables.Disposable;
import te.app.nottaa.utils.session.UserHelper;

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
        String url = UserHelper.getInstance(MyApplication.getInstance()).getUserData().getType().equals("2") ? URLS.HOME : URLS.HOME_STUDENT;
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + searchText + "&page=" + page, new Object(), HomeResponse.class,
                Constants.HOME, showProgress);
    }

    public Disposable studentTasks(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.STUDENT_TASKS + page, new Object(), HomeResponse.class,
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

    public Disposable takeChance(int taskId) {
        MainRequest request = new MainRequest();
        request.setTaskId(String.valueOf(taskId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.TAKE_CHANCE, request, StatusMessage.class,
                Constants.TAKE_CHANCE, true);
    }

    public Disposable getPoints(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.POINTS + page, new Object(), PointsResponse.class,
                Constants.MENU_GIFTS, showProgress);
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

    public Disposable getGroupStudentsRequests(String groupId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GROUP_STUDENTS_REQUESTS + groupId + "&page=" + page, new Object(), GroupStudentsResponse.class,
                Constants.STUDENT, showProgress);
    }

    public Disposable changeStudentRequestStatus(PassingObject passingObject) {
        MainRequest request = new MainRequest();
        request.setGroupId(String.valueOf(passingObject.getId()));
        request.setStudentId(passingObject.getObject());
        request.setAccept(passingObject.getObject2().equals(Constants.ACCEPT) ? "1" : "2");
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_STUDENT_REQUEST_STATUS, request, StatusMessage.class,
                Constants.JOIN_REQUEST, true);
    }

    //Student
    public Disposable studentJoinRequest(int groupId) {
        MainRequest request = new MainRequest();
        request.setGroupId(String.valueOf(groupId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.SEND_JOIN_REQUEST, request, GroupStudentsResponse.class,
                Constants.JOIN_REQUEST, true);
    }

    public Disposable taskDetails(int taskId, String studentId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TASK_DETAILS + studentId + "&task_id=" + taskId, new Object(), TaskDetailsResponse.class,
                Constants.TASK_DETAILS, true);
    }

    public Disposable answerTask(AddAnswerRequest addAnswerRequest, List<FileObject> objectList) {
        return connectionHelper.requestApi(URLS.ADD_ANSWER, addAnswerRequest, objectList, StatusMessage.class,
                Constants.Add_ANSWER, false);
    }

    public Disposable givePoints(AddAnswerRequest addAnswerRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.GIVE_POINTS, addAnswerRequest, StatusMessage.class,
                Constants.Add_ANSWER, false);
    }

    public Disposable getAvalStudentPoints(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.STUDENT_POINTS + page, new Object(), StudentPointsResponse.class,
                Constants.STUDENT_GIFTS, showProgress);
    }

    public Disposable movePointsToStore() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.MOVE_POINTS, new Object(), StatusMessage.class,
                Constants.MOVE_POINTS, false);
    }

    public Disposable getGift(int giftId) {
        MainRequest request = new MainRequest();
        request.setGiftId(String.valueOf(giftId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.GET_GIFT, request, StatusMessage.class,
                Constants.GET_GIFT, true);
    }

    public Disposable leaveGroup(int groupId) {
        MainRequest request = new MainRequest();
        request.setGroupId(String.valueOf(groupId));
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LEAVE_GROUP, request, StatusMessage.class,
                Constants.LEAVE_GROUP, true);
    }

    public Disposable groupStudentTasks(int page, boolean showProgress, int groupId, String studentId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GROUP_STUDENT_TASKS + studentId + "&group_id=" + groupId + "&page=" + page, new Object(), StudentTasksResponse.class,
                Constants.STUDENT_TASKS, showProgress);
    }
}