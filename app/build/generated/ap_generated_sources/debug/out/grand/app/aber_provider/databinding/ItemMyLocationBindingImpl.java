package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyLocationBindingImpl extends ItemMyLocationBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.slider_container, 5);
        sViewsWithIds.put(R.id.v23, 6);
        sViewsWithIds.put(R.id.tv_your_location, 7);
        sViewsWithIds.put(R.id.your_location, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyLocationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemMyLocationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (android.widget.RadioButton) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7]
            , (android.view.View) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            );
        this.icDelete.setTag(null);
        this.icEdit.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.radio.setTag(null);
        this.tvFirstLocation.setTag(null);
        setRootTag(root);
        // listeners
        mCallback29 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback30 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback31 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.locationsData) {
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
        grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels itemViewModel = mItemViewModel;
        java.lang.String itemViewModelLocationsDataTitle = null;
        grand.app.aber_provider.pages.myLocations.models.LocationsData itemViewModelLocationsData = null;
        java.lang.String javaLangStringConcatItemViewModelLocationsDataTitle = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.locationsData
                    itemViewModelLocationsData = itemViewModel.getLocationsData();
                }


                if (itemViewModelLocationsData != null) {
                    // read itemViewModel.locationsData.title
                    itemViewModelLocationsDataTitle = itemViewModelLocationsData.getTitle();
                }


                // read "#".concat(itemViewModel.locationsData.title)
                javaLangStringConcatItemViewModelLocationsDataTitle = "#".concat(itemViewModelLocationsDataTitle);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icDelete.setOnClickListener(mCallback31);
            this.icEdit.setOnClickListener(mCallback30);
            this.radio.setOnClickListener(mCallback29);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFirstLocation, javaLangStringConcatItemViewModelLocationsDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(grand.app.aber_provider.utils.Constants.MENu);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(grand.app.aber_provider.utils.Constants.EDIT);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {




                    itemViewModel.itemAction(grand.app.aber_provider.utils.Constants.DELETE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.locationsData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}