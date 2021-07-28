package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMainMyOrderBindingImpl extends ItemMainMyOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_accept, 1);
        sViewsWithIds.put(R.id.ic_accept_line, 2);
        sViewsWithIds.put(R.id.ic_shipped, 3);
        sViewsWithIds.put(R.id.tv_shipped, 4);
        sViewsWithIds.put(R.id.ic_shipped_line, 5);
        sViewsWithIds.put(R.id.ic_on_way, 6);
        sViewsWithIds.put(R.id.tv_on_way, 7);
        sViewsWithIds.put(R.id.ic_on_way_line, 8);
        sViewsWithIds.put(R.id.ic_delivered, 9);
        sViewsWithIds.put(R.id.tv_delivered, 10);
        sViewsWithIds.put(R.id.br, 11);
        sViewsWithIds.put(R.id.rc_order, 12);
        sViewsWithIds.put(R.id.tv_service_details, 13);
        sViewsWithIds.put(R.id.ic_service_detalis, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMainMyOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ItemMainMyOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.cardInfo.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.itemOrderViewModel == variableId) {
            setItemOrderViewModel((grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemOrderViewModel(@Nullable grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels ItemOrderViewModel) {
        this.mItemOrderViewModel = ItemOrderViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemOrderViewModel((grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemOrderViewModel(grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels ItemOrderViewModel, int fieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemOrderViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}