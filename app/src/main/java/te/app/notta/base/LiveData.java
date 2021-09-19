package te.app.notta.base;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import te.app.notta.model.base.Mutable;

@Module
public class LiveData {
    public MutableLiveData<Mutable> mutableLiveData;

    @Singleton
    @Provides
    public MutableLiveData<Mutable> getMutableLiveData(){
        mutableLiveData = new MutableLiveData<>();
        return mutableLiveData;
    }
}