package grand.app.aber_provider.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import grand.app.aber_provider.connection.ConnectionHelper;
import grand.app.aber_provider.model.base.Mutable;


public class BaseRepository {
    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

}
