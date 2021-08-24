package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeBindingImpl extends ItemHomeBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_services_name_value, 6);
        sViewsWithIds.put(R.id.v_services_name, 7);
        sViewsWithIds.put(R.id.tv_service_location, 8);
        sViewsWithIds.put(R.id.v_service_location, 9);
        sViewsWithIds.put(R.id.tv_client_name, 10);
        sViewsWithIds.put(R.id.v_client_name, 11);
        sViewsWithIds.put(R.id.tv_service_time, 12);
        sViewsWithIds.put(R.id.v_service_status, 13);
        sViewsWithIds.put(R.id.tv_service_status, 14);
        sViewsWithIds.put(R.id.tv_service_status_value, 15);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewMedium mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ItemHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[7]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5];
        this.mboundView5.setTag(null);
        this.tvClientNameValue.setTag(null);
        this.tvServiceLocationValue.setTag(null);
        this.tvServiceTimeValue.setTag(null);
        this.tvServicesName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback52 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback53 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
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
        if (BR.itemPostViewModel == variableId) {
            setItemPostViewModel((grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPostViewModel(@Nullable grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel ItemPostViewModel) {
        updateRegistration(0, ItemPostViewModel);
        this.mItemPostViewModel = ItemPostViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemPostViewModel);
        super.requestRebind();
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
        else if (fieldId == BR.orders) {
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
        int itemPostViewModelOrdersIsEmergency = 0;
        grand.app.aber_provider.pages.home.models.Orders itemPostViewModelOrders = null;
        java.lang.String itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt = null;
        grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel itemPostViewModel = mItemPostViewModel;
        java.lang.String itemPostViewModelOrdersAddress = null;
        java.lang.String itemPostViewModelOrdersScheduledAt = null;
        java.lang.String itemPostViewModelOrdersClientName = null;
        boolean itemPostViewModelOrdersIsEmergencyInt1 = false;
        java.lang.String itemPostViewModelOrdersServiceName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemPostViewModel != null) {
                    // read itemPostViewModel.orders
                    itemPostViewModelOrders = itemPostViewModel.getOrders();
                }


                if (itemPostViewModelOrders != null) {
                    // read itemPostViewModel.orders.is_emergency
                    itemPostViewModelOrdersIsEmergency = itemPostViewModelOrders.getIs_emergency();
                    // read itemPostViewModel.orders.address
                    itemPostViewModelOrdersAddress = itemPostViewModelOrders.getAddress();
                    // read itemPostViewModel.orders.clientName
                    itemPostViewModelOrdersClientName = itemPostViewModelOrders.getClientName();
                    // read itemPostViewModel.orders.serviceName
                    itemPostViewModelOrdersServiceName = itemPostViewModelOrders.getServiceName();
                }


                // read itemPostViewModel.orders.is_emergency == 1
                itemPostViewModelOrdersIsEmergencyInt1 = (itemPostViewModelOrdersIsEmergency) == (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemPostViewModelOrdersIsEmergencyInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (itemPostViewModelOrders != null) {
                    // read itemPostViewModel.orders.scheduledAt
                    itemPostViewModelOrdersScheduledAt = itemPostViewModelOrders.getScheduledAt();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemPostViewModel.orders.is_emergency == 1 ? @android:string/emergency_services : itemPostViewModel.orders.scheduledAt
                itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt = ((itemPostViewModelOrdersIsEmergencyInt1) ? (tvServiceTimeValue.getResources().getString(R.string.emergency_services)) : (itemPostViewModelOrdersScheduledAt));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback52);
            this.mboundView5.setOnClickListener(mCallback53);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvClientNameValue, itemPostViewModelOrdersClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceLocationValue, itemPostViewModelOrdersAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceTimeValue, itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServicesName, itemPostViewModelOrdersServiceName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // itemPostViewModel
                grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel itemPostViewModel = mItemPostViewModel;
                // itemPostViewModel != null
                boolean itemPostViewModelJavaLangObjectNull = false;



                itemPostViewModelJavaLangObjectNull = (itemPostViewModel) != (null);
                if (itemPostViewModelJavaLangObjectNull) {




                    itemPostViewModel.itemAction(grand.app.aber_provider.utils.Constants.ORDER_DETAILS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // itemPostViewModel
                grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel itemPostViewModel = mItemPostViewModel;
                // itemPostViewModel != null
                boolean itemPostViewModelJavaLangObjectNull = false;



                itemPostViewModelJavaLangObjectNull = (itemPostViewModel) != (null);
                if (itemPostViewModelJavaLangObjectNull) {




                    itemPostViewModel.itemAction(grand.app.aber_provider.utils.Constants.ORDER_DETAILS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemPostViewModel
        flag 1 (0x2L): itemPostViewModel.orders
        flag 2 (0x3L): null
        flag 3 (0x4L): itemPostViewModel.orders.is_emergency == 1 ? @android:string/emergency_services : itemPostViewModel.orders.scheduledAt
        flag 4 (0x5L): itemPostViewModel.orders.is_emergency == 1 ? @android:string/emergency_services : itemPostViewModel.orders.scheduledAt
    flag mapping end*/
    //end
}