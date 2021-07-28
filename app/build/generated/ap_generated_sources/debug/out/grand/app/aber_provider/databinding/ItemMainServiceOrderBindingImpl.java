package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMainServiceOrderBindingImpl extends ItemMainServiceOrderBinding  {

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
        sViewsWithIds.put(R.id.tv_service_time, 7);
        sViewsWithIds.put(R.id.tv_service_time_value, 8);
        sViewsWithIds.put(R.id.v_service_status, 9);
        sViewsWithIds.put(R.id.tv_service_status, 10);
        sViewsWithIds.put(R.id.tv_service_status_value, 11);
        sViewsWithIds.put(R.id.v_service, 12);
        sViewsWithIds.put(R.id.tv_service_rc, 13);
        sViewsWithIds.put(R.id.rc_services, 14);
        sViewsWithIds.put(R.id.tv_service_details, 15);
        sViewsWithIds.put(R.id.ic_service_detalis, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMainServiceOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemMainServiceOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[3]
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