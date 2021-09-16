package grand.app.notta.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.notta.connection.ConnectionHelper;
import grand.app.notta.model.base.Mutable;


public class BaseRepository {
    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

}
