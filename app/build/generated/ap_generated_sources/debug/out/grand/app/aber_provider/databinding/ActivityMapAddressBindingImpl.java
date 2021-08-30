package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMapAddressBindingImpl extends ActivityMapAddressBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_container, 3);
        sViewsWithIds.put(R.id.map_view, 4);
        sViewsWithIds.put(R.id.img_marker_center, 5);
        sViewsWithIds.put(R.id.map_progress, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMapAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMapAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (android.widget.ProgressBar) bindings[6]
            , (com.google.android.gms.maps.MapView) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            );
        this.locationSearch.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatButton) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback50 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.mapAddressViewModel == variableId) {
            setMapAddressViewModel((grand.app.aber_provider.utils.locations.MapAddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMapAddressViewModel(@Nullable grand.app.aber_provider.utils.locations.MapAddressViewModel MapAddressViewModel) {
        updateRegistration(0, MapAddressViewModel);
        this.mMapAddressViewModel = MapAddressViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mapAddressViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMapAddressViewModel((grand.app.aber_provider.utils.locations.MapAddressViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMapAddressViewModel(grand.app.aber_provider.utils.locations.MapAddressViewModel MapAddressViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        grand.app.aber_provider.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.locationSearch.setOnClickListener(mCallback49);
            this.mboundView2.setOnClickListener(mCallback50);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // mapAddressViewModel
                grand.app.aber_provider.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
                // mapAddressViewModel != null
                boolean mapAddressViewModelJavaLangObjectNull = false;



                mapAddressViewModelJavaLangObjectNull = (mapAddressViewModel) != (null);
                if (mapAddressViewModelJavaLangObjectNull) {


                    mapAddressViewModel.toSearchPlace();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mapAddressViewModel
                grand.app.aber_provider.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
                // mapAddressViewModel != null
                boolean mapAddressViewModelJavaLangObjectNull = false;



                mapAddressViewModelJavaLangObjectNull = (mapAddressViewModel) != (null);
                if (mapAddressViewModelJavaLangObjectNull) {


                    mapAddressViewModel.submit();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mapAddressViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}