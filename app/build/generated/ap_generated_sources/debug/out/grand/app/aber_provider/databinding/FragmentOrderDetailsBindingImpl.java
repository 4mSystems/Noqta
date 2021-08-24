package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderDetailsBindingImpl extends FragmentOrderDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 13);
        sViewsWithIds.put(R.id.textView2, 14);
        sViewsWithIds.put(R.id.card_personal_info, 15);
        sViewsWithIds.put(R.id.header, 16);
        sViewsWithIds.put(R.id.card_service, 17);
        sViewsWithIds.put(R.id.tv_service_type, 18);
        sViewsWithIds.put(R.id.card_time, 19);
        sViewsWithIds.put(R.id.item_time_warning, 20);
        sViewsWithIds.put(R.id.tv_delivery_time, 21);
        sViewsWithIds.put(R.id.br, 22);
        sViewsWithIds.put(R.id.card_main_service, 23);
        sViewsWithIds.put(R.id.required_service_type, 24);
        sViewsWithIds.put(R.id.card_car_desc, 25);
        sViewsWithIds.put(R.id.car_desc, 26);
        sViewsWithIds.put(R.id.car_image_desc, 27);
        sViewsWithIds.put(R.id.car_type, 28);
        sViewsWithIds.put(R.id.car_cat, 29);
        sViewsWithIds.put(R.id.ca_year, 30);
        sViewsWithIds.put(R.id.car_type_value, 31);
        sViewsWithIds.put(R.id.car_cat_value, 32);
        sViewsWithIds.put(R.id.ca_year_value, 33);
        sViewsWithIds.put(R.id.card_other_service, 34);
        sViewsWithIds.put(R.id.other_service, 35);
        sViewsWithIds.put(R.id.card_extra_service, 36);
        sViewsWithIds.put(R.id.extra_service, 37);
        sViewsWithIds.put(R.id.card_invoice, 38);
        sViewsWithIds.put(R.id.tv_invoice, 39);
        sViewsWithIds.put(R.id.tv_services_cost, 40);
        sViewsWithIds.put(R.id.v_services_price, 41);
        sViewsWithIds.put(R.id.tv_services_extra_cost, 42);
        sViewsWithIds.put(R.id.v_services__extra_price, 43);
        sViewsWithIds.put(R.id.tv_delivery_cost, 44);
        sViewsWithIds.put(R.id.v_delivery_price, 45);
        sViewsWithIds.put(R.id.tv_eme_cost, 46);
        sViewsWithIds.put(R.id.v_eme_price, 47);
        sViewsWithIds.put(R.id.tv_total, 48);
        sViewsWithIds.put(R.id.card_battery, 49);
        sViewsWithIds.put(R.id.tv_battery, 50);
        sViewsWithIds.put(R.id.card_tier, 51);
        sViewsWithIds.put(R.id.tv_tier, 52);
        sViewsWithIds.put(R.id.card_desc, 53);
        sViewsWithIds.put(R.id.tv_service_desc, 54);
        sViewsWithIds.put(R.id.tv_service_desc_value, 55);
        sViewsWithIds.put(R.id.location_image, 56);
        sViewsWithIds.put(R.id.btn_accept, 57);
        sViewsWithIds.put(R.id.btn_reject, 58);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewRegular mboundView6;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewRegular mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 59, sIncludes, sViewsWithIds));
    }
    private FragmentOrderDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[22]
            , (com.google.android.material.button.MaterialButton) bindings[57]
            , (com.google.android.material.button.MaterialButton) bindings[58]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[30]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[33]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[29]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[32]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[27]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[28]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[31]
            , (androidx.cardview.widget.CardView) bindings[49]
            , (androidx.cardview.widget.CardView) bindings[25]
            , (androidx.cardview.widget.CardView) bindings[53]
            , (androidx.cardview.widget.CardView) bindings[36]
            , (androidx.cardview.widget.CardView) bindings[38]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[34]
            , (android.widget.RelativeLayout) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[51]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[56]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[35]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[50]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[44]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[21]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[46]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[39]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[54]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[55]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[18]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[40]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[42]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[52]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[48]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (android.view.View) bindings[45]
            , (android.view.View) bindings[47]
            , (android.view.View) bindings[43]
            , (android.view.View) bindings[41]
            );
        this.itemImg.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7];
        this.mboundView7.setTag(null);
        this.tvDeliveryPrice.setTag(null);
        this.tvEmePrice.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvHomeJob.setTag(null);
        this.tvPrice.setTag(null);
        this.tvServicesExtraPrice.setTag(null);
        this.tvTotalPrice.setTag(null);
        this.tvTotalServicesPrice.setTag(null);
        this.userProfileImg.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.aber_provider.pages.postDetails.viewModels.OrderDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.postDetails.viewModels.OrderDetailsViewModel ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.postDetails.viewModels.OrderDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.postDetails.viewModels.OrderDetailsViewModel ViewModel, int fieldId) {
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelOrderDetailsMainIsEmergencyInt0 = false;
        double viewModelOrderDetailsMainDeliveryFees = 0.0;
        java.lang.String viewModelOrderDetailsMainMainServiceImage = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFees = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFees = null;
        double viewModelOrderDetailsMainEmergencyCost = 0.0;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangString = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String viewModelOrderDetailsMainUserName = null;
        grand.app.aber_provider.pages.postDetails.models.OrderDetailsMain viewModelOrderDetailsMain = null;
        int viewModelOrderDetailsMainSubtotal = 0;
        double viewModelOrderDetailsMainTotal = 0.0;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangString = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotal = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCost = null;
        java.lang.String viewModelCurrency = null;
        grand.app.aber_provider.pages.auth.models.UserData viewModelOrderDetailsMainUser = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotal = null;
        java.lang.String viewModelOrderDetailsMainIsEmergencyInt0MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt = null;
        java.lang.String viewModelOrderDetailsMainUserImage = null;
        int viewModelOrderDetailsMainIsEmergency = 0;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangString = null;
        grand.app.aber_provider.pages.postDetails.models.MainServices viewModelOrderDetailsMainMainService = null;
        java.lang.String viewModelOrderDetailsMainMainServiceName = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangStringConcatViewModelCurrency = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangStringConcatViewModelCurrency = null;
        double viewModelOrderDetailsMainExtraFees = 0.0;
        java.lang.String viewModelOrderDetailsMainAddress = null;
        java.lang.String viewModelOrderDetailsMainScheduledAt = null;
        grand.app.aber_provider.pages.postDetails.viewModels.OrderDetailsViewModel viewModel = mViewModel;
        java.lang.String stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangString = null;
        java.lang.String stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangString = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.orderDetailsMain
                    viewModelOrderDetailsMain = viewModel.getOrderDetailsMain();
                    // read viewModel.currency
                    viewModelCurrency = viewModel.currency;
                }


                if (viewModelOrderDetailsMain != null) {
                    // read viewModel.orderDetailsMain.deliveryFees
                    viewModelOrderDetailsMainDeliveryFees = viewModelOrderDetailsMain.getDeliveryFees();
                    // read viewModel.orderDetailsMain.emergencyCost
                    viewModelOrderDetailsMainEmergencyCost = viewModelOrderDetailsMain.getEmergencyCost();
                    // read viewModel.orderDetailsMain.subtotal
                    viewModelOrderDetailsMainSubtotal = viewModelOrderDetailsMain.getSubtotal();
                    // read viewModel.orderDetailsMain.total
                    viewModelOrderDetailsMainTotal = viewModelOrderDetailsMain.getTotal();
                    // read viewModel.orderDetailsMain.user
                    viewModelOrderDetailsMainUser = viewModelOrderDetailsMain.getUser();
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
                // read String.valueOf(viewModel.orderDetailsMain.subtotal)
                stringValueOfViewModelOrderDetailsMainSubtotal = java.lang.String.valueOf(viewModelOrderDetailsMainSubtotal);
                // read String.valueOf(viewModel.orderDetailsMain.total)
                stringValueOfViewModelOrderDetailsMainTotal = java.lang.String.valueOf(viewModelOrderDetailsMainTotal);
                // read viewModel.orderDetailsMain.isEmergency == 0
                viewModelOrderDetailsMainIsEmergencyInt0 = (viewModelOrderDetailsMainIsEmergency) == (0);
                // read String.valueOf(viewModel.orderDetailsMain.extraFees)
                stringValueOfViewModelOrderDetailsMainExtraFees = java.lang.String.valueOf(viewModelOrderDetailsMainExtraFees);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelOrderDetailsMainIsEmergencyInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (viewModelOrderDetailsMainUser != null) {
                    // read viewModel.orderDetailsMain.user.name
                    viewModelOrderDetailsMainUserName = viewModelOrderDetailsMainUser.getName();
                    // read viewModel.orderDetailsMain.user.image
                    viewModelOrderDetailsMainUserImage = viewModelOrderDetailsMainUser.getImage();
                }
                if (viewModelOrderDetailsMainMainService != null) {
                    // read viewModel.orderDetailsMain.mainService.image
                    viewModelOrderDetailsMainMainServiceImage = viewModelOrderDetailsMainMainService.getImage();
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
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (viewModelOrderDetailsMain != null) {
                    // read viewModel.orderDetailsMain.scheduledAt
                    viewModelOrderDetailsMainScheduledAt = viewModelOrderDetailsMain.getScheduledAt();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.orderDetailsMain.isEmergency == 0 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
                viewModelOrderDetailsMainIsEmergencyInt0MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt = ((viewModelOrderDetailsMainIsEmergencyInt0) ? (mboundView7.getResources().getString(R.string.emergency_services)) : (viewModelOrderDetailsMainScheduledAt));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.itemImg, viewModelOrderDetailsMainMainServiceImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelOrderDetailsMainMainServiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelOrderDetailsMainIsEmergencyInt0MboundView7AndroidStringEmergencyServicesViewModelOrderDetailsMainScheduledAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeliveryPrice, stringValueOfViewModelOrderDetailsMainDeliveryFeesConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmePrice, stringValueOfViewModelOrderDetailsMainEmergencyCostConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelOrderDetailsMainUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeJob, viewModelOrderDetailsMainAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServicesExtraPrice, stringValueOfViewModelOrderDetailsMainExtraFeesConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalPrice, stringValueOfViewModelOrderDetailsMainTotalConcatJavaLangStringConcatViewModelCurrency);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalServicesPrice, stringValueOfViewModelOrderDetailsMainSubtotalConcatJavaLangStringConcatViewModelCurrency);
            grand.app.aber_provider.base.ApplicationBinding.loadCommentImage(this.userProfileImg, viewModelOrderDetailsMainUserImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.orderDetailsMain
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.orderDetailsMain.isEmergency == 0 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
        flag 4 (0x5L): viewModel.orderDetailsMain.isEmergency == 0 ? @android:string/emergency_services : viewModel.orderDetailsMain.scheduledAt
    flag mapping end*/
    //end
}