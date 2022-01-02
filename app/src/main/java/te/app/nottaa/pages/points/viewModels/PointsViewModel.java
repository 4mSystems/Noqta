package te.app.nottaa.pages.points.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.nottaa.BR;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseViewModel;
import te.app.nottaa.connection.FileObject;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.points.adapters.PointsAdapter;
import te.app.nottaa.pages.points.models.TeacherPointsMain;
import te.app.nottaa.pages.points.models.students.StudentMainPoints;
import te.app.nottaa.pages.teacher.models.AddGiftRequest;
import io.reactivex.disposables.CompositeDisposable;
import te.app.nottaa.repository.GroupRepository;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.resources.ResourceManager;


public class PointsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    GroupRepository repository;
    PointsAdapter pointsAdapter;
    AddGiftRequest request;
    public List<FileObject> fileObjects = new ArrayList<>();
    private StudentMainPoints studentMainPoints;
    private TeacherPointsMain teacherPointsMain;

    @Inject
    public PointsViewModel(GroupRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getPoints(int page, boolean showProgress) {
        if (userData.getType().equals("2"))
            compositeDisposable.add(repository.getPoints(page, showProgress));
        else
            compositeDisposable.add(repository.getAvalStudentPoints(page, showProgress));
    }

    public void deleteGift() {
        compositeDisposable.add(repository.deleteGift(getPointsAdapter().lastSelected));
    }

    public void createGift() {
        if (getRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.createPoints(getRequest(), fileObjects));
        }
    }

    public void exchangePoints() {
        if (!TextUtils.isEmpty(userData.getPoints()) && !userData.getPoints().equals("0")) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.movePointsToStore());
        }
    }

    public void getGift() {
        if (Integer.parseInt(getStudentMainPoints().getPointsInStore()) >= Integer.parseInt(getPointsAdapter().getPointsDataList().get(getPointsAdapter().lastPosition).getPoints()))
            compositeDisposable.add(repository.getGift(getPointsAdapter().lastSelected));
        else {
            liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.enough_points_warning)));
            getPointsAdapter().getPointsDataList().clear();
            getPoints(1, true);
        }
    }

    public void updatePoints() {
        int remainPoints = Integer.parseInt(getStudentMainPoints().getPointsInStore()) - Integer.parseInt(getPointsAdapter().getPointsDataList().get(getPointsAdapter().lastPosition).getPoints());
        getStudentMainPoints().setPointsInStore(String.valueOf(remainPoints));
        notifyChange(BR.studentMainPoints);
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void onPointsTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getRequest().setPoints("1");
        }
        notifyChange(BR.request);
    }

    public void onWinnersTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)) {
            getRequest().setNumOfWinners("1");
        }
        notifyChange(BR.request);
    }

    @Bindable
    public AddGiftRequest getRequest() {
        return this.request == null ? this.request = new AddGiftRequest() : this.request;
    }

    @Bindable
    public PointsAdapter getPointsAdapter() {
        return this.pointsAdapter == null ? this.pointsAdapter = new PointsAdapter() : this.pointsAdapter;
    }

    @Bindable
    public StudentMainPoints getStudentMainPoints() {
        return this.studentMainPoints == null ? this.studentMainPoints = new StudentMainPoints() : this.studentMainPoints;
    }

    public void setStudentMainPoints(StudentMainPoints studentMainPoints) {
        if (getPointsAdapter().getPointsDataList().size() > 0) {
            getPointsAdapter().loadMore(studentMainPoints.getGiftsPaginate().getPointsData());
        } else {
            getPointsAdapter().update(studentMainPoints.getGiftsPaginate().getPointsData());
            notifyChange(BR.pointsAdapter);
        }
        notifyChange(BR.studentMainPoints);
        this.studentMainPoints = studentMainPoints;
    }

    @Bindable
    public TeacherPointsMain getTeacherPointsMain() {
        return this.teacherPointsMain == null ? this.teacherPointsMain = new TeacherPointsMain() : this.teacherPointsMain;
    }

    public void setTeacherPointsMain(TeacherPointsMain teacherPointsMain) {
        if (getPointsAdapter().getPointsDataList().size() > 0) {
            getPointsAdapter().loadMore(teacherPointsMain.getPointsDataList());
        } else {
            getPointsAdapter().update(teacherPointsMain.getPointsDataList());
            notifyChange(BR.pointsAdapter);
        }
        notifyChange(BR.teacherPointsMain);
        this.teacherPointsMain = teacherPointsMain;
    }

    public GroupRepository getRepository() {
        return repository;
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
