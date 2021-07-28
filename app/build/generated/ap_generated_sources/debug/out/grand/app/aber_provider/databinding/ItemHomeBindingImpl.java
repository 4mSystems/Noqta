package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeBindingImpl extends ItemHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_services_name, 1);
        sViewsWithIds.put(R.id.tv_services_name_value, 2);
        sViewsWithIds.put(R.id.v_services_name, 3);
        sViewsWithIds.put(R.id.tv_service_location, 4);
        sViewsWithIds.put(R.id.tv_service_location_value, 5);
        sViewsWithIds.put(R.id.v_service_location, 6);
        sViewsWithIds.put(R.id.tv_client_name, 7);
        sViewsWithIds.put(R.id.tv_client_name_value, 8);
        sViewsWithIds.put(R.id.v_client_name, 9);
        sViewsWithIds.put(R.id.tv_service_time, 10);
        sViewsWithIds.put(R.id.tv_service_time_value, 11);
        sViewsWithIds.put(R.id.v_service_status, 12);
        sViewsWithIds.put(R.id.tv_service_status, 13);
        sViewsWithIds.put(R.id.tv_service_status_value, 14);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ItemHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.itemPostViewModel == variableId) {
            setItemPostViewModel((grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPostViewModel(@Nullable grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel ItemPostViewModel) {
        this.mItemPostViewModel = ItemPostViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemPostViewModel((grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemPostViewModel(grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel ItemPostViewModel, int fieldId) {
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
        flag 0 (0x1L): itemPostViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}