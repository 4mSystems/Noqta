package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrderOptionsDetailsBindingImpl extends ItemOrderOptionsDetailsBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOrderOptionsDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemOrderOptionsDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[5]
            );
        this.childText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.parentText.setTag(null);
        this.subChildText.setTag(null);
        this.tvChild.setTag(null);
        this.tvParent.setTag(null);
        this.tvSubChild.setTag(null);
        setRootTag(root);
        // listeners
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
            setItemViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.childServices) {
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
        grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelChildServicesSubChildText = null;
        boolean textUtilsIsEmptyItemViewModelChildServicesParent = false;
        java.lang.String itemViewModelChildServicesParent = null;
        int textUtilsIsEmptyItemViewModelChildServicesParentViewVISIBLEViewGONE = 0;
        boolean TextUtilsIsEmptyItemViewModelChildServicesParent1 = false;
        grand.app.aber_provider.pages.orderDetails.models.ChildServices itemViewModelChildServices = null;
        java.lang.String itemViewModelChildServicesChildText = null;
        java.lang.String itemViewModelChildServicesParentText = null;
        java.lang.String itemViewModelChildServicesSubChild = null;
        java.lang.String itemViewModelChildServicesChild = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.childServices
                    itemViewModelChildServices = itemViewModel.getChildServices();
                }


                if (itemViewModelChildServices != null) {
                    // read itemViewModel.childServices.subChildText
                    itemViewModelChildServicesSubChildText = itemViewModelChildServices.getSubChildText();
                    // read itemViewModel.childServices.parent
                    itemViewModelChildServicesParent = itemViewModelChildServices.getParent();
                    // read itemViewModel.childServices.childText
                    itemViewModelChildServicesChildText = itemViewModelChildServices.getChildText();
                    // read itemViewModel.childServices.parentText
                    itemViewModelChildServicesParentText = itemViewModelChildServices.getParentText();
                    // read itemViewModel.childServices.sub_child
                    itemViewModelChildServicesSubChild = itemViewModelChildServices.getSub_child();
                    // read itemViewModel.childServices.child
                    itemViewModelChildServicesChild = itemViewModelChildServices.getChild();
                }


                // read TextUtils.isEmpty(itemViewModel.childServices.parent)
                textUtilsIsEmptyItemViewModelChildServicesParent = android.text.TextUtils.isEmpty(itemViewModelChildServicesParent);


                // read !TextUtils.isEmpty(itemViewModel.childServices.parent)
                TextUtilsIsEmptyItemViewModelChildServicesParent1 = !textUtilsIsEmptyItemViewModelChildServicesParent;
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyItemViewModelChildServicesParent1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read !TextUtils.isEmpty(itemViewModel.childServices.parent) ? View.VISIBLE : View.GONE
                textUtilsIsEmptyItemViewModelChildServicesParentViewVISIBLEViewGONE = ((TextUtilsIsEmptyItemViewModelChildServicesParent1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.childText, itemViewModelChildServicesChild);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.parentText, itemViewModelChildServicesParent);
            this.parentText.setVisibility(textUtilsIsEmptyItemViewModelChildServicesParentViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subChildText, itemViewModelChildServicesSubChild);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvChild, itemViewModelChildServicesChildText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvParent, itemViewModelChildServicesParentText);
            this.tvParent.setVisibility(textUtilsIsEmptyItemViewModelChildServicesParentViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubChild, itemViewModelChildServicesSubChildText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.childServices
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(itemViewModel.childServices.parent) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): !TextUtils.isEmpty(itemViewModel.childServices.parent) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}