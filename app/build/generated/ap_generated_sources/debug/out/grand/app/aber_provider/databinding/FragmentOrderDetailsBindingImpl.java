package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderDetailsBindingImpl extends FragmentOrderDetailsBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 31);
        sViewsWithIds.put(R.id.textView2, 32);
        sViewsWithIds.put(R.id.card_personal_info, 33);
        sViewsWithIds.put(R.id.header, 34);
        sViewsWithIds.put(R.id.card_service, 35);
        sViewsWithIds.put(R.id.tv_service_type, 36);
        sViewsWithIds.put(R.id.card_time, 37);
        sViewsWithIds.put(R.id.item_time_warning, 38);
        sViewsWithIds.put(R.id.tv_delivery_time, 39);
        sViewsWithIds.put(R.id.br, 40);
        sViewsWithIds.put(R.id.required_service_type, 41);
        sViewsWithIds.put(R.id.car_desc, 42);
        sViewsWithIds.put(R.id.car_image_desc, 43);
        sViewsWithIds.put(R.id.car_type, 44);
        sViewsWithIds.put(R.id.car_cat, 45);
        sViewsWithIds.put(R.id.ca_year, 46);
        sViewsWithIds.put(R.id.other_service, 47);
        sViewsWithIds.put(R.id.extra_service, 48);
        sViewsWithIds.put(R.id.card_invoice, 49);
        sViewsWithIds.put(R.id.tv_services_cost, 50);
        sViewsWithIds.put(R.id.v_services_price, 51);
        sViewsWithIds.put(R.id.tv_services_extra_cost, 52);
        sViewsWithIds.put(R.id.v_services__extra_price, 53);
        sViewsWithIds.put(R.id.tv_delivery_cost, 54);
        sViewsWithIds.put(R.id.v_delivery_price, 55);
        sViewsWithIds.put(R.id.tv_eme_cost, 56);
        sViewsWithIds.put(R.id.v_eme_price, 57);
        sViewsWithIds.put(R.id.tv_total, 58);
        sViewsWithIds.put(R.id.card_desc, 59);
        sViewsWithIds.put(R.id.tv_service_desc, 60);
        sViewsWithIds.put(R.id.br2, 61);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView15;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView17;
    @NonNull
    private final com.makeramen.roundedimageview.RoundedImageView mboundView25;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewRegular mboundView6;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewRegular mboundView7;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 62, sIncludes, sViewsWithIds));
    }
    private FragmentOrderDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[40]
            , (android.view.View) bindings[61]
            , (com.google.android.material.button.MaterialButton) bindings[28]
            , (com.google.android.material.button.MaterialButton) bindings[29]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[46]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[45]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[42]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[43]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[44]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[59]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[49]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (android.widget.RelativeLayout) bindings[33]
            , (androidx.cardview.widget.CardView) bindings[35]
            , (androidx.cardview.widget.CardView) bindings[37]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[48]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[34]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[27]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[47]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[41]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[31]
            , (com.google.android.material.button.MaterialButton) bindings[30]
            , (android.widget.TextView) bindings[32]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[24]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[54]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[20]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[39]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[56]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[21]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[60]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[26]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[36]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[50]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[52]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[58]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[22]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[18]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (android.view.View) bindings[55]
            , (android.view.View) bindings[57]
            , (android.view.View) bindings[53]
            , (android.view.View) bindings[51]
            );
        this.btnAccept.setTag(null);
        this.btnReject.setTag(null);
        this.caYearValue.setTag(null);
        this.carCatValue.setTag(null);
        this.carTypeValue.setTag(null);
        this.cardBattery.setTag(null);
        this.cardCarDesc.setTag(null);
        this.cardExtraService.setTag(null);
        this.cardMainService.setTag(null);
        this.cardOtherService.setTag(null);
        this.itemImg.setTag(null);
        this.locationImage.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView15 = (androidx.recyclerview.widget.RecyclerView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (androidx.recyclerview.widget.RecyclerView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView25 = (com.makeramen.roundedimageview.RoundedImageView) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView6 = (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (androidx.recyclerview.widget.RecyclerView) bindings[9];
        this.mboundView9.setTag(null);
        this.status.setTag(null);
        this.tvBattery.setTag(null);
        this.tvDeliveryPrice.setTag(null);
        this.tvEmePrice.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvHomeJob.setTag(null);
        this.tvPrice.setTag(null);
        this.tvServiceDescValue.setTag(null);
        this.tvServicesExtraPrice.setTag(null);
        this.tvTotalPrice.setTag(null);
        this.tvTotalServicesPrice.setTag(null);
        this.userProfileImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback79 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback82 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback80 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback81 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.orderDetailsMain) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.servicesRequiredAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.optionsDetailsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.extraRequiredAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        double viewModelOrderDetailsMainDeliveryFees = 0.0;
        boolean viewModelOrderDetailsMainStatusInt0 = false;
        java.lang.String viewModelOrderDetailsMainStatusText = null;
        java.lang.String viewModelOrderDetailsMainVehicleChild = null;
        java.lang.String viewModelOrderDetailsMainMainServiceImage = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFees = null;
        boolean ViewModelOrderDetailsMainStatusInt01 = false;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFees = null;
        boolean textUtilsIsEmptyViewModelOrderDetailsMainImage = false;
        java.lang.String viewModelOrderDetailsMainDescription = null;
        boolean viewModelOrderDetailsMainSubServicesSizeInt0 = false;
        double viewModelOrderDetailsMainEmergencyCost = 0.0;
        java.lang.String viewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangString = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String viewModelOrderDetailsMainUserName = null;
        boolean TextUtilsIsEmptyViewModelOrderDetailsMainImage1 = false;
        int viewModelOrderDetailsMainStatusInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.orderDetails.models.OrderDetailsMain viewModelOrderDetailsMain = null;
        int viewModelOrderDetailsMainStatus = 0;
        boolean viewModelOrderDetailsMainChildServicesSizeInt0 = false;
        boolean viewModelOrderDetailsMainExtraServicesSizeInt0 = false;
        int viewModelOrderDetailsMainSubtotal = 0;
        double viewModelOrderDetailsMainTotal = 0.0;
        java.util.List<grand.app.aber_provider.pages.orderDetails.models.SubServices> viewModelOrderDetailsMainExtraServices = null;
        boolean viewModelOrderDetailsMainIsEmergencyInt1 = false;
        java.lang.String viewModelOrderDetailsMainMainServiceIdInt9TvBatteryAndroidStringTierImageViewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangString = null;
        int viewModelOrderDetailsMainChildServicesSizeInt0ViewGONEViewVISIBLE = 0;
        int viewModelOrderDetailsMainChildServicesSize = 0;
        int textUtilsIsEmptyViewModelOrderDetailsMainImageViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotal = null;
        grand.app.aber_provider.pages.orderDetails.adapters.ServicesRequiredAdapter viewModelServicesRequiredAdapter = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCost = null;
        int viewModelOrderDetailsMainExtraServicesSize = 0;
        java.lang.String viewModelCurrency = null;
        java.lang.String viewModelOrderDetailsMainImage = null;
        java.util.List<grand.app.aber_provider.pages.orderDetails.models.SubServices> viewModelOrderDetailsMainSubServices = null;
        java.lang.String viewModelOrderDetailsMainVehicleSubChild = null;
        grand.app.aber_provider.pages.orderDetails.adapters.OptionsDetailsAdapter viewModelOptionsDetailsAdapter = null;
        boolean viewModelOrderDetailsMainStatusInt4 = false;
        int viewModelOrderDetailsMainMainServiceId = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewModelOrderDetailsMainUser = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotal = null;
        java.util.List<grand.app.aber_provider.pages.orderDetails.models.ChildServices> viewModelOrderDetailsMainChildServices = null;
        boolean viewModelOrderDetailsMainVehicleJavaLangObjectNull = false;
        grand.app.aber_provider.pages.orderDetails.adapters.ServicesRequiredAdapter viewModelExtraRequiredAdapter = null;
        boolean viewModelOrderDetailsMainMainServiceIdInt9 = false;
        java.lang.String viewModelOrderDetailsMainStaticLocationImage = null;
        java.lang.String viewModelOrderDetailsMainUserImage = null;
        grand.app.aber_provider.pages.orderDetails.models.Vehicle viewModelOrderDetailsMainVehicle = null;
        boolean viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalse = false;
        int viewModelOrderDetailsMainUserJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int viewModelOrderDetailsMainIsEmergency = 0;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangString = null;
        int viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalseViewVISIBLEViewGONE = 0;
        int viewModelOrderDetailsMainVehicleJavaLangObjectNullViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.orderDetails.models.MainServices viewModelOrderDetailsMainMainService = null;
        java.lang.String viewModelOrderDetailsMainIsEmergencyInt1MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt = null;
        int viewModelOrderDetailsMainSubServicesSizeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelOrderDetailsMainVehicleParent = null;
        boolean viewModelOrderDetailsMainUserJavaLangObjectNull = false;
        java.lang.String viewModelOrderDetailsMainMainServiceName = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangStringConcatViewModelCurrency = null;
        int viewModelOrderDetailsMainExtraServicesSizeInt0ViewGONEViewVISIBLE = 0;
        double viewModelOrderDetailsMainExtraFees = 0.0;
        java.lang.String viewModelOrderDetailsMainAddress = null;
        java.lang.String viewModelOrderDetailsMainScheduledAt = null;
        grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangString = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangString = null;
        int viewModelOrderDetailsMainSubServicesSize = 0;
        boolean viewModelOrderDetailsMainMainServiceIdInt19 = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderDetailsMain
                        viewModelOrderDetailsMain = viewModel.getOrderDetailsMain();
                        // read viewModel.currency
                        viewModelCurrency = viewModel.currency;
                    }


                    if (viewModelOrderDetailsMain != null) {
                        // read viewModel.orderDetailsMain.deliveryFees
                        viewModelOrderDetailsMainDeliveryFees = viewModelOrderDetailsMain.getDeliveryFees();
                        // read viewModel.orderDetailsMain.statusText
                        viewModelOrderDetailsMainStatusText = viewModelOrderDetailsMain.getStatusText();
                        // read viewModel.orderDetailsMain.description
                        viewModelOrderDetailsMainDescription = viewModelOrderDetailsMain.getDescription();
                        // read viewModel.orderDetailsMain.emergencyCost
                        viewModelOrderDetailsMainEmergencyCost = viewModelOrderDetailsMain.getEmergencyCost();
                        // read viewModel.orderDetailsMain.status
                        viewModelOrderDetailsMainStatus = viewModelOrderDetailsMain.getStatus();
                        // read viewModel.orderDetailsMain.subtotal
                        viewModelOrderDetailsMainSubtotal = viewModelOrderDetailsMain.getSubtotal();
                        // read viewModel.orderDetailsMain.total
                        viewModelOrderDetailsMainTotal = viewModelOrderDetailsMain.getTotal();
                        // read viewModel.orderDetailsMain.extraServices
                        viewModelOrderDetailsMainExtraServices = viewModelOrderDetailsMain.getExtraServices();
                        // read viewModel.orderDetailsMain.image
                        viewModelOrderDetailsMainImage = viewModelOrderDetailsMain.getImage();
                        // read viewModel.orderDetailsMain.subServices
                        viewModelOrderDetailsMainSubServices = viewModelOrderDetailsMain.getSubServices();
                        // read viewModel.orderDetailsMain.user
                        viewModelOrderDetailsMainUser = viewModelOrderDetailsMain.getUser();
                        // read viewModel.orderDetailsMain.childServices
                        viewModelOrderDetailsMainChildServices = viewModelOrderDetailsMain.getChildServices();
                        // read viewModel.orderDetailsMain.staticLocationImage
                        viewModelOrderDetailsMainStaticLocationImage = viewModelOrderDetailsMain.getStaticLocationImage();
                        // read viewModel.orderDetailsMain.vehicle
                        viewModelOrderDetailsMainVehicle = viewModelOrderDetailsMain.getVehicle();
                        // read viewModel.orderDetailsMain.isEmergency
                        viewModelOrderDetailsMainIsEmergency = viewModelOrderDetailsMain.getIsEmergency();
                        // read viewModel.orderDetailsMain.mainService
                        viewModelOrderDetailsMainMainService = viewModelOrderDetailsMain.getMainService();
                        // read viewModel.orderDetailsMain.extraFees
                        viewModelOrderDetailsMainExtraFees = viewModelOrderDetailsMain.getExtraFees();
                        // read viewModel.orderDetailsMain.address
                        viewModelOrderDetailsMainAddress = viewModelOrderDetailsMain.getAddress();
                    }


                    // read String.valueOf(viewModel.orderDetailsMain.deliveryFees)
                    stringValueOfViewModelOrderDetailsMainDeliveryFees = java.lang.String.valueOf(viewModelOrderDetailsMainDeliveryFees);
                    // read String.valueOf(viewModel.orderDetailsMain.emergencyCost)
                    stringValueOfViewModelOrderDetailsMainEmergencyCost = java.lang.String.valueOf(viewModelOrderDetailsMainEmergencyCost);
                    // read viewModel.orderDetailsMain.status == 0
                    viewModelOrderDetailsMainStatusInt0 = (viewModelOrderDetailsMainStatus) == (0);
                    // read viewModel.orderDetailsMain.status != 0
                    ViewModelOrderDetailsMainStatusInt01 = (viewModelOrderDetailsMainStatus) != (0);
                    // read String.valueOf(viewModel.orderDetailsMain.subtotal)
                    stringValueOfViewModelOrderDetailsMainSubtotal = java.lang.String.valueOf(viewModelOrderDetailsMainSubtotal);
                    // read String.valueOf(viewModel.orderDetailsMain.total)
                    stringValueOfViewModelOrderDetailsMainTotal = java.lang.String.valueOf(viewModelOrderDetailsMainTotal);
                    // read TextUtils.isEmpty(viewModel.orderDetailsMain.image)
                    textUtilsIsEmptyViewModelOrderDetailsMainImage = android.text.TextUtils.isEmpty(viewModelOrderDetailsMainImage);
                    // read viewModel.orderDetailsMain.user != null
                    viewModelOrderDetailsMainUserJavaLangObjectNull = (viewModelOrderDetailsMainUser) != (null);
                    // read viewModel.orderDetailsMain.vehicle != null
                    viewModelOrderDetailsMainVehicleJavaLangObjectNull = (viewModelOrderDetailsMainVehicle) != (null);
                    // read viewModel.orderDetailsMain.isEmergency == 1
                    viewModelOrderDetailsMainIsEmergencyInt1 = (viewModelOrderDetailsMainIsEmergency) == (1);
                    // read String.valueOf(viewModel.orderDetailsMain.extraFees)
                    stringValueOfViewModelOrderDetailsMainExtraFees = java.lang.String.valueOf(viewModelOrderDetailsMainExtraFees);
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainStatusInt0) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(ViewModelOrderDetailsMainStatusInt01) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainUserJavaLangObjectNull) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainVehicleJavaLangObjectNull) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainIsEmergencyInt1) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                    if (viewModelOrderDetailsMainExtraServices != null) {
                        // read viewModel.orderDetailsMain.extraServices.size()
                        viewModelOrderDetailsMainExtraServicesSize = viewModelOrderDetailsMainExtraServices.size();
                    }
                    if (viewModelOrderDetailsMainSubServices != null) {
                        // read viewModel.orderDetailsMain.subServices.size()
                        viewModelOrderDetailsMainSubServicesSize = viewModelOrderDetailsMainSubServices.size();
                    }
                    if (viewModelOrderDetailsMainUser != null) {
                        // read viewModel.orderDetailsMain.user.name
                        viewModelOrderDetailsMainUserName = viewModelOrderDetailsMainUser.getName();
                        // read viewModel.orderDetailsMain.user.image
                        viewModelOrderDetailsMainUserImage = viewModelOrderDetailsMainUser.getImage();
                    }
                    if (viewModelOrderDetailsMainChildServices != null) {
                        // read viewModel.orderDetailsMain.childServices.size()
                        viewModelOrderDetailsMainChildServicesSize = viewModelOrderDetailsMainChildServices.size();
                    }
                    if (viewModelOrderDetailsMainVehicle != null) {
                        // read viewModel.orderDetailsMain.vehicle.child
                        viewModelOrderDetailsMainVehicleChild = viewModelOrderDetailsMainVehicle.getChild();
                        // read viewModel.orderDetailsMain.vehicle.sub_child
                        viewModelOrderDetailsMainVehicleSubChild = viewModelOrderDetailsMainVehicle.getSub_child();
                        // read viewModel.orderDetailsMain.vehicle.parent
                        viewModelOrderDetailsMainVehicleParent = viewModelOrderDetailsMainVehicle.getParent();
                    }
                    if (viewModelOrderDetailsMainMainService != null) {
                        // read viewModel.orderDetailsMain.mainService.image
                        viewModelOrderDetailsMainMainServiceImage = viewModelOrderDetailsMainMainService.getImage();
                        // read viewModel.orderDetailsMain.mainService.id
                        viewModelOrderDetailsMainMainServiceId = viewModelOrderDetailsMainMainService.getId();
                        // read viewModel.orderDetailsMain.mainService.name
                        viewModelOrderDetailsMainMainServiceName = viewModelOrderDetailsMainMainService.getName();
                    }


                    if (stringValueOfViewModelOrderDetailsMainDeliveryFees != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.deliveryFees).concat(" ")
                        stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangString = stringValueOfViewModelOrderDetailsMainDeliveryFees.concat(" ");
                    }
                    if (stringValueOfViewModelOrderDetailsMainEmergencyCost != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.emergencyCost).concat(" ")
                        stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangString = stringValueOfViewModelOrderDetailsMainEmergencyCost.concat(" ");
                    }
                    // read viewModel.orderDetailsMain.status == 0 ? View.VISIBLE : View.GONE
                    viewModelOrderDetailsMainStatusInt0ViewVISIBLEViewGONE = ((viewModelOrderDetailsMainStatusInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read !TextUtils.isEmpty(viewModel.orderDetailsMain.image)
                    TextUtilsIsEmptyViewModelOrderDetailsMainImage1 = !textUtilsIsEmptyViewModelOrderDetailsMainImage;
                    // read viewModel.orderDetailsMain.user != null ? View.VISIBLE : View.GONE
                    viewModelOrderDetailsMainUserJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelOrderDetailsMainUserJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.orderDetailsMain.vehicle != null ? View.VISIBLE : View.GONE
                    viewModelOrderDetailsMainVehicleJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelOrderDetailsMainVehicleJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.orderDetailsMain.extraServices.size() == 0
                    viewModelOrderDetailsMainExtraServicesSizeInt0 = (viewModelOrderDetailsMainExtraServicesSize) == (0);
                    // read viewModel.orderDetailsMain.subServices.size() > 0
                    viewModelOrderDetailsMainSubServicesSizeInt0 = (viewModelOrderDetailsMainSubServicesSize) > (0);
                    // read viewModel.orderDetailsMain.childServices.size() == 0
                    viewModelOrderDetailsMainChildServicesSizeInt0 = (viewModelOrderDetailsMainChildServicesSize) == (0);
                    // read viewModel.orderDetailsMain.mainService.id == 9
                    viewModelOrderDetailsMainMainServiceIdInt9 = (viewModelOrderDetailsMainMainServiceId) == (9);
                if((dirtyFlags & 0x23L) != 0) {
                    if(TextUtilsIsEmptyViewModelOrderDetailsMainImage1) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainExtraServicesSizeInt0) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainSubServicesSizeInt0) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainChildServicesSizeInt0) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0x23L) != 0) {
                    if(viewModelOrderDetailsMainMainServiceIdInt9) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                    if (stringValueOfViewModelOrderDetailsMainSubtotal != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.subtotal).concat(" ")
                        stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangString = stringValueOfViewModelOrderDetailsMainSubtotal.concat(" ");
                    }
                    if (stringValueOfViewModelOrderDetailsMainTotal != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.total).concat(" ")
                        stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangString = stringValueOfViewModelOrderDetailsMainTotal.concat(" ");
                    }
                    if (stringValueOfViewModelOrderDetailsMainExtraFees != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.extraFees).concat(" ")
                        stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangString = stringValueOfViewModelOrderDetailsMainExtraFees.concat(" ");
                    }


                    if (stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangString != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.deliveryFees).concat(" ").concat(viewModel.currency)
                        stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangStringConcatViewModelCurrency = stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangString.concat(viewModelCurrency);
                    }
                    if (stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangString != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.emergencyCost).concat(" ").concat(viewModel.currency)
                        stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangStringConcatViewModelCurrency = stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangString.concat(viewModelCurrency);
                    }
                    // read !TextUtils.isEmpty(viewModel.orderDetailsMain.image) ? View.VISIBLE : View.GONE
                    textUtilsIsEmptyViewModelOrderDetailsMainImageViewVISIBLEViewGONE = ((TextUtilsIsEmptyViewModelOrderDetailsMainImage1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.orderDetailsMain.extraServices.size() == 0 ? View.GONE : View.VISIBLE
                    viewModelOrderDetailsMainExtraServicesSizeInt0ViewGONEViewVISIBLE = ((viewModelOrderDetailsMainExtraServicesSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.orderDetailsMain.subServices.size() > 0 ? View.VISIBLE : View.GONE
                    viewModelOrderDetailsMainSubServicesSizeInt0ViewVISIBLEViewGONE = ((viewModelOrderDetailsMainSubServicesSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.orderDetailsMain.childServices.size() == 0 ? View.GONE : View.VISIBLE
                    viewModelOrderDetailsMainChildServicesSizeInt0ViewGONEViewVISIBLE = ((viewModelOrderDetailsMainChildServicesSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    if (stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangString != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.subtotal).concat(" ").concat(viewModel.currency)
                        stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangStringConcatViewModelCurrency = stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangString.concat(viewModelCurrency);
                    }
                    if (stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangString != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.total).concat(" ").concat(viewModel.currency)
                        stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency = stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangString.concat(viewModelCurrency);
                    }
                    if (stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangString != null) {
                        // read String.valueOf(viewModel.orderDetailsMain.extraFees).concat(" ").concat(viewModel.currency)
                        stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangStringConcatViewModelCurrency = stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangString.concat(viewModelCurrency);
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.servicesRequiredAdapter
                        viewModelServicesRequiredAdapter = viewModel.getServicesRequiredAdapter();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.optionsDetailsAdapter
                        viewModelOptionsDetailsAdapter = viewModel.getOptionsDetailsAdapter();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.extraRequiredAdapter
                        viewModelExtraRequiredAdapter = viewModel.getExtraRequiredAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

                // read viewModel.orderDetailsMain.status != 4
                viewModelOrderDetailsMainStatusInt4 = (viewModelOrderDetailsMainStatus) != (4);
        }
        if ((dirtyFlags & 0x1000000L) != 0) {

                if (viewModelOrderDetailsMain != null) {
                    // read viewModel.orderDetailsMain.scheduledAt
                    viewModelOrderDetailsMainScheduledAt = viewModelOrderDetailsMain.getScheduledAt();
                }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                // read viewModel.orderDetailsMain.mainService.id == 19
                viewModelOrderDetailsMainMainServiceIdInt19 = (viewModelOrderDetailsMainMainServiceId) == (19);
            if((dirtyFlags & 0x400L) != 0) {
                if(viewModelOrderDetailsMainMainServiceIdInt19) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
                viewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage = ((viewModelOrderDetailsMainMainServiceIdInt19) ? (tvBattery.getResources().getString(R.string.license_civil_image_hint)) : (tvBattery.getResources().getString(R.string.battery_image)));
        }

        if ((dirtyFlags & 0x23L) != 0) {

                // read viewModel.orderDetailsMain.mainService.id == 9 ? @android:string/tier_image : viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
                viewModelOrderDetailsMainMainServiceIdInt9TvBatteryAndroidStringTierImageViewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage = ((viewModelOrderDetailsMainMainServiceIdInt9) ? (tvBattery.getResources().getString(R.string.tier_image)) : (viewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage));
                // read viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false
                viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalse = ((ViewModelOrderDetailsMainStatusInt01) ? (viewModelOrderDetailsMainStatusInt4) : (false));
                // read viewModel.orderDetailsMain.isEmergency == 1 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
                viewModelOrderDetailsMainIsEmergencyInt1MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt = ((viewModelOrderDetailsMainIsEmergencyInt1) ? (mboundView7.getResources().getString(R.string.emergency_services)) : (viewModelOrderDetailsMainScheduledAt));
            if((dirtyFlags & 0x23L) != 0) {
                if(viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false ? View.VISIBLE : View.GONE
                viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalseViewVISIBLEViewGONE = ((viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnAccept.setOnClickListener(mCallback80);
            this.btnReject.setOnClickListener(mCallback81);
            this.locationImage.setOnClickListener(mCallback79);
            this.status.setOnClickListener(mCallback82);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.btnAccept.setVisibility(viewModelOrderDetailsMainStatusInt0ViewVISIBLEViewGONE);
            this.btnReject.setVisibility(viewModelOrderDetailsMainStatusInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.caYearValue, viewModelOrderDetailsMainVehicleSubChild);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.carCatValue, viewModelOrderDetailsMainVehicleChild);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.carTypeValue, viewModelOrderDetailsMainVehicleParent);
            this.cardBattery.setVisibility(textUtilsIsEmptyViewModelOrderDetailsMainImageViewVISIBLEViewGONE);
            this.cardCarDesc.setVisibility(viewModelOrderDetailsMainVehicleJavaLangObjectNullViewVISIBLEViewGONE);
            this.cardExtraService.setVisibility(viewModelOrderDetailsMainExtraServicesSizeInt0ViewGONEViewVISIBLE);
            this.cardMainService.setVisibility(viewModelOrderDetailsMainSubServicesSizeInt0ViewVISIBLEViewGONE);
            this.cardOtherService.setVisibility(viewModelOrderDetailsMainChildServicesSizeInt0ViewGONEViewVISIBLE);
            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.itemImg, viewModelOrderDetailsMainMainServiceImage);
            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.locationImage, viewModelOrderDetailsMainStaticLocationImage);
            this.mboundView0.setVisibility(viewModelOrderDetailsMainUserJavaLangObjectNullViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.loadCommentImage(this.mboundView25, viewModelOrderDetailsMainImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelOrderDetailsMainMainServiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelOrderDetailsMainIsEmergencyInt1MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.status, viewModelOrderDetailsMainStatusText);
            this.status.setVisibility(viewModelOrderDetailsMainStatusInt0ViewModelOrderDetailsMainStatusInt4BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBattery, viewModelOrderDetailsMainMainServiceIdInt9TvBatteryAndroidStringTierImageViewModelOrderDetailsMainMainServiceIdInt19TvBatteryAndroidStringLicenseCivilImageHintTvBatteryAndroidStringBatteryImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeliveryPrice, stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmePrice, stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelOrderDetailsMainUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeJob, viewModelOrderDetailsMainAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceDescValue, viewModelOrderDetailsMainDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServicesExtraPrice, stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalPrice, stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalServicesPrice, stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangStringConcatViewModelCurrency);
            grand.app.aber_provider.base.ApplicationBinding.loadCommentImage(this.userProfileImg, viewModelOrderDetailsMainUserImage);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.mboundView15, viewModelOptionsDetailsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.mboundView17, viewModelExtraRequiredAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.mboundView9, viewModelServicesRequiredAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toFollowOrder();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.orderDetailsMain != null
                boolean viewModelOrderDetailsMainJavaLangObjectNull = false;
                // (viewModel.orderDetailsMain.status) + (1)
                int viewModelOrderDetailsMainStatusInt1 = 0;
                // viewModel.orderDetailsMain
                grand.app.aber_provider.pages.orderDetails.models.OrderDetailsMain viewModelOrderDetailsMain = null;
                // viewModel
                grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel.orderDetailsMain.status
                int viewModelOrderDetailsMainStatus = 0;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelOrderDetailsMain = viewModel.getOrderDetailsMain();

                    viewModelOrderDetailsMainJavaLangObjectNull = (viewModelOrderDetailsMain) != (null);
                    if (viewModelOrderDetailsMainJavaLangObjectNull) {


                        viewModelOrderDetailsMainStatus = viewModelOrderDetailsMain.getStatus();


                        viewModelOrderDetailsMainStatusInt1 = (viewModelOrderDetailsMainStatus) + (1);

                        viewModel.changeStatus(viewModelOrderDetailsMainStatusInt1);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.changeStatus(1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.changeStatus(-1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.orderDetailsMain
        flag 2 (0x3L): viewModel.servicesRequiredAdapter
        flag 3 (0x4L): viewModel.optionsDetailsAdapter
        flag 4 (0x5L): viewModel.extraRequiredAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
        flag 7 (0x8L): viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
        flag 8 (0x9L): viewModel.orderDetailsMain.status == 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.orderDetailsMain.status == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.orderDetailsMain.mainService.id == 9 ? @android:string/tier_image : viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
        flag 11 (0xcL): viewModel.orderDetailsMain.mainService.id == 9 ? @android:string/tier_image : viewModel.orderDetailsMain.mainService.id == 19 ? @android:string/license_civil_image_hint : @android:string/battery_image
        flag 12 (0xdL): viewModel.orderDetailsMain.childServices.size() == 0 ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.orderDetailsMain.childServices.size() == 0 ? View.GONE : View.VISIBLE
        flag 14 (0xfL): !TextUtils.isEmpty(viewModel.orderDetailsMain.image) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !TextUtils.isEmpty(viewModel.orderDetailsMain.image) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false
        flag 17 (0x12L): viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false
        flag 18 (0x13L): viewModel.orderDetailsMain.user != null ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.orderDetailsMain.user != null ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.orderDetailsMain.status != 0 ? viewModel.orderDetailsMain.status != 4 : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.orderDetailsMain.vehicle != null ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.orderDetailsMain.vehicle != null ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.orderDetailsMain.isEmergency == 1 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
        flag 25 (0x1aL): viewModel.orderDetailsMain.isEmergency == 1 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
        flag 26 (0x1bL): viewModel.orderDetailsMain.subServices.size() > 0 ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.orderDetailsMain.subServices.size() > 0 ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.orderDetailsMain.extraServices.size() == 0 ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): viewModel.orderDetailsMain.extraServices.size() == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}