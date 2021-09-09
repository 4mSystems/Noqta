package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAuthServicesBindingImpl extends ItemAuthServicesBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAuthServicesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemAuthServicesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (androidx.appcompat.widget.SwitchCompat) bindings[3]
            );
        this.icService.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback85 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.service) {
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
        grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelServiceImage = null;
        boolean itemViewModelServiceSelected = false;
        grand.app.aber_provider.pages.orderDetails.models.SubServices itemViewModelService = null;
        java.lang.String itemViewModelServiceName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.service
                    itemViewModelService = itemViewModel.getService();
                }


                if (itemViewModelService != null) {
                    // read itemViewModel.service.image
                    itemViewModelServiceImage = itemViewModelService.getImage();
                    // read itemViewModel.service.selected
                    itemViewModelServiceSelected = itemViewModelService.isSelected();
                    // read itemViewModel.service.name
                    itemViewModelServiceName = itemViewModelService.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.icService, itemViewModelServiceImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemViewModelServiceName);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.tvPrice, itemViewModelServiceSelected);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvPrice.setOnClickListener(mCallback85);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.service
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}