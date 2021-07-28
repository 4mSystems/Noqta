package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNotificationsBindingImpl extends FragmentNotificationsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNotificationsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentNotificationsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.animationView.setTag(null);
        this.progress.setTag(null);
        this.rcNotifications.setTag(null);
        this.searchContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.notifyViewModel == variableId) {
            setNotifyViewModel((grand.app.aber_provider.pages.notifications.viewModels.NotificationsViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotifyViewModel(@Nullable grand.app.aber_provider.pages.notifications.viewModels.NotificationsViewModels NotifyViewModel) {
        updateRegistration(0, NotifyViewModel);
        this.mNotifyViewModel = NotifyViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.notifyViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotifyViewModel((grand.app.aber_provider.pages.notifications.viewModels.NotificationsViewModels) object, fieldId);
            case 1 :
                return onChangeNotifyViewModelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotifyViewModel(grand.app.aber_provider.pages.notifications.viewModels.NotificationsViewModels NotifyViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notificationsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeNotifyViewModelSearchProgressVisible(androidx.databinding.ObservableBoolean NotifyViewModelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        grand.app.aber_provider.pages.notifications.viewModels.NotificationsViewModels notifyViewModel = mNotifyViewModel;
        java.util.List<grand.app.aber_provider.pages.notifications.models.NotificationsData> notifyViewModelNotificationsAdapterNotificationsDataList = null;
        androidx.databinding.ObservableBoolean notifyViewModelSearchProgressVisible = null;
        boolean notifyViewModelSearchProgressVisibleGet = false;
        int notifyViewModelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        int notifyViewModelNotificationsAdapterNotificationsDataListSize = 0;
        int notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.notifications.adapters.NotificationsAdapter notifyViewModelNotificationsAdapter = null;
        boolean notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0 = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (notifyViewModel != null) {
                        // read notifyViewModel.searchProgressVisible
                        notifyViewModelSearchProgressVisible = notifyViewModel.searchProgressVisible;
                    }
                    updateRegistration(1, notifyViewModelSearchProgressVisible);


                    if (notifyViewModelSearchProgressVisible != null) {
                        // read notifyViewModel.searchProgressVisible.get()
                        notifyViewModelSearchProgressVisibleGet = notifyViewModelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(notifyViewModelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read notifyViewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    notifyViewModelSearchProgressVisibleViewVISIBLEViewGONE = ((notifyViewModelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (notifyViewModel != null) {
                        // read notifyViewModel.notificationsAdapter
                        notifyViewModelNotificationsAdapter = notifyViewModel.getNotificationsAdapter();
                    }


                    if (notifyViewModelNotificationsAdapter != null) {
                        // read notifyViewModel.notificationsAdapter.notificationsDataList
                        notifyViewModelNotificationsAdapterNotificationsDataList = notifyViewModelNotificationsAdapter.notificationsDataList;
                    }


                    if (notifyViewModelNotificationsAdapterNotificationsDataList != null) {
                        // read notifyViewModel.notificationsAdapter.notificationsDataList.size()
                        notifyViewModelNotificationsAdapterNotificationsDataListSize = notifyViewModelNotificationsAdapterNotificationsDataList.size();
                    }


                    // read notifyViewModel.notificationsAdapter.notificationsDataList.size() == 0
                    notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0 = (notifyViewModelNotificationsAdapterNotificationsDataListSize) == (0);
                if((dirtyFlags & 0xdL) != 0) {
                    if(notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read notifyViewModel.notificationsAdapter.notificationsDataList.size() == 0 ? View.VISIBLE : View.GONE
                    notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0ViewVISIBLEViewGONE = ((notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.animationView.setVisibility(notifyViewModelNotificationsAdapterNotificationsDataListSizeInt0ViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcNotifications, notifyViewModelNotificationsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(notifyViewModelSearchProgressVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notifyViewModel
        flag 1 (0x2L): notifyViewModel.searchProgressVisible
        flag 2 (0x3L): notifyViewModel.notificationsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): notifyViewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): notifyViewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): notifyViewModel.notificationsAdapter.notificationsDataList.size() == 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): notifyViewModel.notificationsAdapter.notificationsDataList.size() == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}