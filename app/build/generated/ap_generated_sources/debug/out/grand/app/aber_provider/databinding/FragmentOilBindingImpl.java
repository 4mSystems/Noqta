package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOilBindingImpl extends FragmentOilBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 3);
        sViewsWithIds.put(R.id.input_oil_types, 4);
        sViewsWithIds.put(R.id.input_car_types, 5);
        sViewsWithIds.put(R.id.input_car_categories, 6);
        sViewsWithIds.put(R.id.input_km, 7);
        sViewsWithIds.put(R.id.rc_extra_services, 8);
        sViewsWithIds.put(R.id.input_message, 9);
        sViewsWithIds.put(R.id.search_location, 10);
        sViewsWithIds.put(R.id.pic_time, 11);
        sViewsWithIds.put(R.id.checkbox, 12);
        sViewsWithIds.put(R.id.info_card, 13);
        sViewsWithIds.put(R.id.tv_note, 14);
        sViewsWithIds.put(R.id.tv_price, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOilBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentOilBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[15]
            );
        this.btnPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
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
            setViewModel((grand.app.aber_provider.pages.services.viewModels.ServicesViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.services.viewModels.ServicesViewModels ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.services.viewModels.ServicesViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.services.viewModels.ServicesViewModels ViewModel, int fieldId) {
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
        boolean textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewModelMessageEqualsConstantsSHOWPROGRESS = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = null;
        boolean viewModelMessageEqualsConstantsHIDEPROGRESS = false;
        grand.app.aber_provider.pages.services.viewModels.ServicesViewModels viewModel = mViewModel;
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

        if ((dirtyFlags & 0x10L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.SHOW_PROGRESS)
                    viewModelMessageEqualsConstantsSHOWPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.HIDE_PROGRESS)
                    viewModelMessageEqualsConstantsHIDEPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
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
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_primary_medium)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnPhone, textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium);
            this.btnPhone.setEnabled(textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
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
        flag 7 (0x8L): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 8 (0x9L): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 9 (0xaL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 10 (0xbL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 11 (0xcL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
    flag mapping end*/
    //end
}