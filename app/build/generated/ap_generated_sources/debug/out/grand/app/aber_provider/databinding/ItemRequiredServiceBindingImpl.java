package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRequiredServiceBindingImpl extends ItemRequiredServiceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v_choosen_order, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRequiredServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemRequiredServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
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
        java.lang.String itemViewModelServicePrice = null;
        java.lang.String itemViewModelCurrency = null;
        grand.app.aber_provider.pages.orderDetails.models.SubServices itemViewModelService = null;
        java.lang.String itemViewModelServiceName = null;
        java.lang.String itemViewModelServicePriceConcatJavaLangStringConcatItemViewModelCurrency = null;
        java.lang.String itemViewModelServicePriceConcatJavaLangString = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.currency
                    itemViewModelCurrency = itemViewModel.currency;
                    // read itemViewModel.service
                    itemViewModelService = itemViewModel.getService();
                }


                if (itemViewModelService != null) {
                    // read itemViewModel.service.price
                    itemViewModelServicePrice = itemViewModelService.getPrice();
                    // read itemViewModel.service.name
                    itemViewModelServiceName = itemViewModelService.getName();
                }


                if (itemViewModelServicePrice != null) {
                    // read itemViewModel.service.price.concat(" ")
                    itemViewModelServicePriceConcatJavaLangString = itemViewModelServicePrice.concat(" ");
                }


                if (itemViewModelServicePriceConcatJavaLangString != null) {
                    // read itemViewModel.service.price.concat(" ").concat(itemViewModel.currency)
                    itemViewModelServicePriceConcatJavaLangStringConcatItemViewModelCurrency = itemViewModelServicePriceConcatJavaLangString.concat(itemViewModelCurrency);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemViewModelServiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, itemViewModelServicePriceConcatJavaLangStringConcatItemViewModelCurrency);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.service
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}