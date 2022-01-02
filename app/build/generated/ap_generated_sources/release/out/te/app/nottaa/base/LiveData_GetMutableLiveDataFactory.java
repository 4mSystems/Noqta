// Generated by Dagger (https://dagger.dev).
package te.app.nottaa.base;

import androidx.lifecycle.MutableLiveData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import te.app.nottaa.model.base.Mutable;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LiveData_GetMutableLiveDataFactory implements Factory<MutableLiveData<Mutable>> {
  private final LiveData module;

  public LiveData_GetMutableLiveDataFactory(LiveData module) {
    this.module = module;
  }

  @Override
  public MutableLiveData<Mutable> get() {
    return getMutableLiveData(module);
  }

  public static LiveData_GetMutableLiveDataFactory create(LiveData module) {
    return new LiveData_GetMutableLiveDataFactory(module);
  }

  public static MutableLiveData<Mutable> getMutableLiveData(LiveData instance) {
    return Preconditions.checkNotNullFromProvides(instance.getMutableLiveData());
  }
}
