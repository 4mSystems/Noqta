package te.app.notta.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.notta.connection.ConnectionHelper;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.utils.Constants;
import te.app.notta.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ServiceRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ServiceRepository(ConnectionHelper connectionHelper){
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData){
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getServices() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SERVICES,new Object(), StatusMessage.class,
                Constants.SERVICES,false);
    }

}