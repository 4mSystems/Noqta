package te.app.nottaa.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.nottaa.connection.ConnectionHelper;
import te.app.nottaa.model.base.Mutable;


public class BaseRepository {
    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

}
