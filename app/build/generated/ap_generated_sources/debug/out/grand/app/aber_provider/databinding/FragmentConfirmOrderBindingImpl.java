package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConfirmOrderBindingImpl extends FragmentConfirmOrderBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 4);
        sViewsWithIds.put(R.id.header, 5);
        sViewsWithIds.put(R.id.curve, 6);
        sViewsWithIds.put(R.id.card_info, 7);
        sViewsWithIds.put(R.id.tv_choosen_order, 8);
        sViewsWithIds.put(R.id.v_choosen_order, 9);
        sViewsWithIds.put(R.id.rc_services, 10);
        sViewsWithIds.put(R.id.tv_services_cost, 11);
        sViewsWithIds.put(R.id.tv_services_price, 12);
        sViewsWithIds.put(R.id.v_services_price, 13);
        sViewsWithIds.put(R.id.tv_delivery_cost, 14);
        sViewsWithIds.put(R.id.tv_delivery_price, 15);
        sViewsWithIds.put(R.id.v_delivery_price, 16);
        sViewsWithIds.put(R.id.tv_total, 17);
        sViewsWithIds.put(R.id.tv_total_price, 18);
        sViewsWithIds.put(R.id.card_required_additional, 19);
        sViewsWithIds.put(R.id.tv_required_additional, 20);
        sViewsWithIds.put(R.id.v_additional_desc, 21);
        sViewsWithIds.put(R.id.tv_car_types, 22);
        sViewsWithIds.put(R.id.tv_car_types_value, 23);
        sViewsWithIds.put(R.id.v_car_types_value, 24);
        sViewsWithIds.put(R.id.tv_car_model, 25);
        sViewsWithIds.put(R.id.tv_car_model_value, 26);
        sViewsWithIds.put(R.id.v_car_model_value, 27);
        sViewsWithIds.put(R.id.tv_car_tire_desc, 28);
        sViewsWithIds.put(R.id.tv_car_tire_desc_value, 29);
        sViewsWithIds.put(R.id.v_car_tire_desc_value, 30);
        sViewsWithIds.put(R.id.tv_car_tire_type, 31);
        sViewsWithIds.put(R.id.tv_car_tire_type_value, 32);
        sViewsWithIds.put(R.id.card_payment, 33);
        sViewsWithIds.put(R.id.tv_choosen_payment, 34);
        sViewsWithIds.put(R.id.v_choosen_payment, 35);
        sViewsWithIds.put(R.id.tv_cash, 36);
        sViewsWithIds.put(R.id.radio, 37);
        sViewsWithIds.put(R.id.card_location, 38);
        sViewsWithIds.put(R.id.tv_choosen_location, 39);
        sViewsWithIds.put(R.id.tv_urgent, 40);
        sViewsWithIds.put(R.id.flow, 41);
        sViewsWithIds.put(R.id.v_choosen_location, 42);
        sViewsWithIds.put(R.id.card_desc, 43);
        sViewsWithIds.put(R.id.tv_desc, 44);
        sViewsWithIds.put(R.id.v_desc, 45);
        sViewsWithIds.put(R.id.tv_desc_text, 46);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConfirmOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 47, sIncludes, sViewsWithIds));
    }
    private FragmentConfirmOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[43]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[38]
            , (androidx.cardview.widget.CardView) bindings[33]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[41]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[3]
            , (android.widget.RadioButton) bindings[37]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[25]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[26]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[28]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[29]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[31]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[32]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[22]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[23]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[36]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[39]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[34]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[44]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[46]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[20]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[18]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[40]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[42]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[35]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[45]
            , (android.view.View) bindings[13]
            );
        this.back.setTag(null);
        this.btnPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback52 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setViewModel((grand.app.aber_provider.pages.home.viewModels.HomeViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.home.viewModels.HomeViewModels ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.home.viewModels.HomeViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.home.viewModels.HomeViewModels ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
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
        boolean textUtilsIsEmptyViewModelMessage = false;
        java.lang.String viewModelMessage = null;
        boolean TextUtilsIsEmptyViewModelMessage1 = false;
        boolean textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;
        int textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = null;
        boolean viewModelMessageEqualsConstantsHIDEPROGRESS = false;
        boolean textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewModelMessageEqualsConstantsSHOWPROGRESS = false;
        grand.app.aber_provider.pages.home.viewModels.HomeViewModels viewModel = mViewModel;
        boolean textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.message
                    viewModelMessage = viewModel.getMessage();
                }


                // read TextUtils.isEmpty(viewModel.message)
                TextUtilsIsEmptyViewModelMessage1 = android.text.TextUtils.isEmpty(viewModelMessage);
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewModelMessage1) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read !TextUtils.isEmpty(viewModel.message)
                textUtilsIsEmptyViewModelMessage = !TextUtilsIsEmptyViewModelMessage1;
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewModelMessage) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.HIDE_PROGRESS)
                    viewModelMessageEqualsConstantsHIDEPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.SHOW_PROGRESS)
                    viewModelMessageEqualsConstantsSHOWPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((textUtilsIsEmptyViewModelMessage) ? (viewModelMessageEqualsConstantsSHOWPROGRESS) : (false));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS = ((TextUtilsIsEmptyViewModelMessage1) ? (true) : (viewModelMessageEqualsConstantsHIDEPROGRESS));
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_primary_medium)));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback52);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnPhone, textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium);
            this.btnPhone.setEnabled(textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        grand.app.aber_provider.pages.home.viewModels.HomeViewModels viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.goBack(getRoot().getContext());
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.message
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 4 (0x5L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 5 (0x6L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 8 (0x9L): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 9 (0xaL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 10 (0xbL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 11 (0xcL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
    flag mapping end*/
    //end
}