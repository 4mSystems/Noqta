package te.app.notta.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.notta.connection.ConnectionHelper;
import te.app.notta.model.base.Mutable;


public class BaseRepository {
    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

}
