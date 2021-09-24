package te.app.notta.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.notta.connection.ConnectionHelper;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.teacher.models.AddGroupRequest;
import te.app.notta.pages.home.models.HomeResponse;
import te.app.notta.pages.teacher.models.AddGroupResponse;
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

    public Disposable getHome(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME + "?page=" + page, new Object(), HomeResponse.class,
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
}