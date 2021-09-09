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
        sViewsWithIds.put(R.id.v_services_name, 9);
        sViewsWithIds.put(R.id.tv_service_location, 10);
        sViewsWithIds.put(R.id.v_service_location, 11);
        sViewsWithIds.put(R.id.tv_client_name, 12);
        sViewsWithIds.put(R.id.v_client_name, 13);
        sViewsWithIds.put(R.id.tv_service_time, 14);
        sViewsWithIds.put(R.id.v_service_status, 15);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewMedium mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ItemHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[9]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[8];
        this.mboundView8.setTag(null);
        this.tvClientNameValue.setTag(null);
        this.tvServiceLocationValue.setTag(null);
        this.tvServiceStatus.setTag(null);
        this.tvServiceStatusValue.setTag(null);
        this.tvServiceTimeValue.setTag(null);
        this.tvServicesName.setTag(null);
        this.tvServicesNameValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback31 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
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
        java.lang.String itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt = null;
        java.lang.String itemPostViewModelOrdersTotalConcatJavaLangStringConcatItemPostViewModelCurrency = null;
        grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel itemPostViewModel = mItemPostViewModel;
        java.lang.String itemPostViewModelOrdersAddress = null;
        java.lang.String itemPostViewModelOrdersScheduledAt = null;
        boolean itemPostViewModelOrdersPosition = false;
        boolean itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0 = false;
        java.lang.String itemPostViewModelOrdersTotalConcatJavaLangString = null;
        java.lang.String itemPostViewModelOrdersClientName = null;
        boolean itemPostViewModelOrdersIsEmergencyInt1 = false;
        int itemPostViewModelOrdersAcceptancePeriodInt0ViewVISIBLEViewGONE = 0;
        long itemPostViewModelOrdersAcceptancePeriod = 0;
        java.lang.String itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidStringViewDetailsMboundView8AndroidStringExpire = null;
        java.lang.String itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangString = null;
        boolean itemPostViewModelOrdersAcceptancePeriodInt0 = false;
        boolean itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0BooleanTrueBooleanFalse = false;
        grand.app.aber_provider.pages.home.models.Orders itemPostViewModelOrders = null;
        java.lang.String itemPostViewModelCurrency = null;
        java.lang.String itemPostViewModelOrdersTotal = null;
        java.lang.String itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangStringConcatTvServiceStatusValueAndroidStringMinute = null;
        int itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidColorColorPrimaryMboundView8AndroidColorMediumColor = 0;
        java.lang.String itemPostViewModelOrdersServiceName = null;
        boolean ItemPostViewModelOrdersAcceptancePeriodInt01 = false;
        java.lang.String itemPostViewModelOrdersAcceptMilSeconds = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemPostViewModel != null) {
                    // read itemPostViewModel.orders
                    itemPostViewModelOrders = itemPostViewModel.getOrders();
                    // read itemPostViewModel.currency
                    itemPostViewModelCurrency = itemPostViewModel.currency;
                }


                if (itemPostViewModelOrders != null) {
                    // read itemPostViewModel.orders.is_emergency
                    itemPostViewModelOrdersIsEmergency = itemPostViewModelOrders.getIs_emergency();
                    // read itemPostViewModel.orders.address
                    itemPostViewModelOrdersAddress = itemPostViewModelOrders.getAddress();
                    // read itemPostViewModel.orders.position
                    itemPostViewModelOrdersPosition = itemPostViewModelOrders.position;
                    // read itemPostViewModel.orders.clientName
                    itemPostViewModelOrdersClientName = itemPostViewModelOrders.getClientName();
                    // read itemPostViewModel.orders.acceptancePeriod
                    itemPostViewModelOrdersAcceptancePeriod = itemPostViewModelOrders.getAcceptancePeriod();
                    // read itemPostViewModel.orders.total
                    itemPostViewModelOrdersTotal = itemPostViewModelOrders.getTotal();
                    // read itemPostViewModel.orders.serviceName
                    itemPostViewModelOrdersServiceName = itemPostViewModelOrders.getServiceName();
                    // read itemPostViewModel.orders.acceptMilSeconds
                    itemPostViewModelOrdersAcceptMilSeconds = itemPostViewModelOrders.getAcceptMilSeconds();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemPostViewModelOrdersPosition) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemPostViewModel.orders.is_emergency == 1
                itemPostViewModelOrdersIsEmergencyInt1 = (itemPostViewModelOrdersIsEmergency) == (1);
                // read itemPostViewModel.orders.acceptancePeriod != 0
                itemPostViewModelOrdersAcceptancePeriodInt0 = (itemPostViewModelOrdersAcceptancePeriod) != (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemPostViewModelOrdersIsEmergencyInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemPostViewModelOrdersAcceptancePeriodInt0) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
                if (itemPostViewModelOrdersTotal != null) {
                    // read itemPostViewModel.orders.total.concat(" ")
                    itemPostViewModelOrdersTotalConcatJavaLangString = itemPostViewModelOrdersTotal.concat(" ");
                }
                if (itemPostViewModelOrdersAcceptMilSeconds != null) {
                    // read itemPostViewModel.orders.acceptMilSeconds.concat(" ")
                    itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangString = itemPostViewModelOrdersAcceptMilSeconds.concat(" ");
                }


                // read itemPostViewModel.orders.acceptancePeriod != 0 ? View.VISIBLE : View.GONE
                itemPostViewModelOrdersAcceptancePeriodInt0ViewVISIBLEViewGONE = ((itemPostViewModelOrdersAcceptancePeriodInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (itemPostViewModelOrdersTotalConcatJavaLangString != null) {
                    // read itemPostViewModel.orders.total.concat(" ").concat(itemPostViewModel.currency)
                    itemPostViewModelOrdersTotalConcatJavaLangStringConcatItemPostViewModelCurrency = itemPostViewModelOrdersTotalConcatJavaLangString.concat(itemPostViewModelCurrency);
                }
                if (itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangString != null) {
                    // read itemPostViewModel.orders.acceptMilSeconds.concat(" ").concat(@android:string/minute)
                    itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangStringConcatTvServiceStatusValueAndroidStringMinute = itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangString.concat(tvServiceStatusValue.getResources().getString(R.string.minute));
                }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (itemPostViewModelOrders != null) {
                    // read itemPostViewModel.orders.scheduledAt
                    itemPostViewModelOrdersScheduledAt = itemPostViewModelOrders.getScheduledAt();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                // read itemPostViewModel.orders.acceptancePeriod == 0
                ItemPostViewModelOrdersAcceptancePeriodInt01 = (itemPostViewModelOrdersAcceptancePeriod) == (0);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemPostViewModel.orders.is_emergency == 1 ? @android:string/emergency_services : itemPostViewModel.orders.scheduledAt
                itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt = ((itemPostViewModelOrdersIsEmergencyInt1) ? (tvServiceTimeValue.getResources().getString(R.string.emergency_services)) : (itemPostViewModelOrdersScheduledAt));
                // read itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0
                itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0 = ((itemPostViewModelOrdersPosition) ? (true) : (ItemPostViewModelOrdersAcceptancePeriodInt01));
            if((dirtyFlags & 0x7L) != 0) {
                if(itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
            }


                // read itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:string/view_details : @android:string/expire
                itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidStringViewDetailsMboundView8AndroidStringExpire = ((itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0) ? (mboundView8.getResources().getString(R.string.view_details)) : (mboundView8.getResources().getString(R.string.expire)));
                // read itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? true : false
                itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0BooleanTrueBooleanFalse = ((itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0) ? (true) : (false));
                // read itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:color/colorPrimary : @android:color/medium_color
                itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidColorColorPrimaryMboundView8AndroidColorMediumColor = ((itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0) ? (getColorFromResource(mboundView8, R.color.colorPrimary)) : (getColorFromResource(mboundView8, R.color.medium_color)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView0.setEnabled(itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0BooleanTrueBooleanFalse);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView8, androidx.databinding.adapters.Converters.convertColorToDrawable(itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidColorColorPrimaryMboundView8AndroidColorMediumColor));
            this.mboundView8.setEnabled(itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0BooleanTrueBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, itemPostViewModelOrdersPositionBooleanTrueItemPostViewModelOrdersAcceptancePeriodInt0MboundView8AndroidStringViewDetailsMboundView8AndroidStringExpire);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvClientNameValue, itemPostViewModelOrdersClientName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceLocationValue, itemPostViewModelOrdersAddress);
            this.tvServiceStatus.setVisibility(itemPostViewModelOrdersAcceptancePeriodInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceStatusValue, itemPostViewModelOrdersAcceptMilSecondsConcatJavaLangStringConcatTvServiceStatusValueAndroidStringMinute);
            this.tvServiceStatusValue.setVisibility(itemPostViewModelOrdersAcceptancePeriodInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceTimeValue, itemPostViewModelOrdersIsEmergencyInt1TvServiceTimeValueAndroidStringEmergencyServicesItemPostViewModelOrdersScheduledAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServicesName, itemPostViewModelOrdersServiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServicesNameValue, itemPostViewModelOrdersTotalConcatJavaLangStringConcatItemPostViewModelCurrency);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback30);
            this.mboundView8.setOnClickListener(mCallback31);
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
        flag 5 (0x6L): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0
        flag 6 (0x7L): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0
        flag 7 (0x8L): itemPostViewModel.orders.acceptancePeriod != 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): itemPostViewModel.orders.acceptancePeriod != 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:string/view_details : @android:string/expire
        flag 10 (0xbL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:string/view_details : @android:string/expire
        flag 11 (0xcL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? true : false
        flag 12 (0xdL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? true : false
        flag 13 (0xeL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:color/colorPrimary : @android:color/medium_color
        flag 14 (0xfL): itemPostViewModel.orders.position ? true : itemPostViewModel.orders.acceptancePeriod == 0 ? @android:color/colorPrimary : @android:color/medium_color
    flag mapping end*/
    //end
}