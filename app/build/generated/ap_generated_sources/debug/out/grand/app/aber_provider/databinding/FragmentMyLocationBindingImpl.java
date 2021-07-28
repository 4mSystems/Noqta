package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyLocationBindingImpl extends FragmentMyLocationBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyLocationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentMyLocationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.addPlace.setTag(null);
        this.icNoPlaces.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.recyclerview.widget.RecyclerView) bindings[3];
        this.mboundView3.setTag(null);
        this.tvNoPlaces1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.locationsAdapters) {
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
        boolean viewmodelLocationsAdaptersItemCountInt0 = false;
        grand.app.aber_provider.pages.myLocations.adapters.LocationsAdapters viewmodelLocationsAdapters = null;
        int viewmodelLocationsAdaptersItemCount = 0;
        int viewmodelLocationsAdaptersItemCountInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.locationsAdapters
                    viewmodelLocationsAdapters = viewmodel.getLocationsAdapters();
                }


                if (viewmodelLocationsAdapters != null) {
                    // read viewmodel.locationsAdapters.itemCount
                    viewmodelLocationsAdaptersItemCount = viewmodelLocationsAdapters.getItemCount();
                }


                // read viewmodel.locationsAdapters.itemCount == 0
                viewmodelLocationsAdaptersItemCountInt0 = (viewmodelLocationsAdaptersItemCount) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelLocationsAdaptersItemCountInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.locationsAdapters.itemCount == 0 ? View.VISIBLE : View.GONE
                viewmodelLocationsAdaptersItemCountInt0ViewVISIBLEViewGONE = ((viewmodelLocationsAdaptersItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addPlace.setOnClickListener(mCallback59);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.icNoPlaces.setVisibility(viewmodelLocationsAdaptersItemCountInt0ViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.mboundView3, viewmodelLocationsAdapters, "1", "1");
            this.tvNoPlaces1.setVisibility(viewmodelLocationsAdaptersItemCountInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.toAddPlace();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.locationsAdapters
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.locationsAdapters.itemCount == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.locationsAdapters.itemCount == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}