package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterDocumentsBindingImpl extends FragmentRegisterDocumentsBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.register, 11);
        sViewsWithIds.put(R.id.progress_percentage, 12);
        sViewsWithIds.put(R.id.tv_percentage, 13);
        sViewsWithIds.put(R.id.card_personal_info, 14);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.MaterialAutoCompleteTextView mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.licence_image
            //         is viewmodel.request.setLicence_image((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(auto);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request.licence_image
            java.lang.String viewmodelRequestLicenceImage = null;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setLicence_image(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.tax_image
            //         is viewmodel.request.setTax_image((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.tax_image
            java.lang.String viewmodelRequestTaxImage = null;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setTax_image(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.identity_image
            //         is viewmodel.request.setIdentity_image((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.identity_image
            java.lang.String viewmodelRequestIdentityImage = null;
            // viewmodel
            grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setIdentity_image(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.passport_image
            //         is viewmodel.request.setPassport_image((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel.request.passport_image
            java.lang.String viewmodelRequestPassportImage = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPassport_image(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterDocumentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterDocumentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[13]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.inputCompanyName.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        mCallback63 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback64 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback60 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback61 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.aber_provider.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.auth.register.RegisterViewModel Viewmodel) {
        updateRegistration(4, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestPassportError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestIdentityError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestLicenceError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelRequestTaxError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((grand.app.aber_provider.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPassportError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPassportError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestIdentityError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestIdentityError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestLicenceError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestLicenceError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestTaxError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestTaxError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestIdentityErrorGet = null;
        java.lang.String viewmodelRequestLicenceImage = null;
        java.lang.String viewmodelMessage = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPassportError = null;
        boolean userHelperGetInstanceContextAccountTypeEqualsJavaLangString0 = false;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestTaxImage = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestIdentityImage = null;
        java.lang.String viewmodelRequestPassportImage = null;
        java.lang.String userHelperGetInstanceContextAccountType = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestIdentityError = null;
        int userHelperGetInstanceContextAccountTypeEqualsJavaLangString0ViewGONEViewVISIBLE = 0;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        java.lang.String viewmodelRequestLicenceErrorGet = null;
        java.lang.String viewmodelRequestTaxErrorGet = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelRequestPassportErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestLicenceError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestTaxError = null;
        grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x80L) != 0) {

                // read UserHelper.getInstance(context).accountType
                userHelperGetInstanceContextAccountType = grand.app.aber_provider.utils.session.UserHelper.getInstance(getRoot().getContext()).getAccountType();


                if (userHelperGetInstanceContextAccountType != null) {
                    // read UserHelper.getInstance(context).accountType.equals("0")
                    userHelperGetInstanceContextAccountTypeEqualsJavaLangString0 = userHelperGetInstanceContextAccountType.equals("0");
                }
            if((dirtyFlags & 0x80L) != 0) {
                if(userHelperGetInstanceContextAccountTypeEqualsJavaLangString0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read UserHelper.getInstance(context).accountType.equals("0") ? View.GONE : View.VISIBLE
                userHelperGetInstanceContextAccountTypeEqualsJavaLangString0ViewGONEViewVISIBLE = ((userHelperGetInstanceContextAccountTypeEqualsJavaLangString0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xbfL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0xb0L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.licence_image
                            viewmodelRequestLicenceImage = viewmodelRequest.getLicence_image();
                            // read viewmodel.request.tax_image
                            viewmodelRequestTaxImage = viewmodelRequest.getTax_image();
                            // read viewmodel.request.identity_image
                            viewmodelRequestIdentityImage = viewmodelRequest.getIdentity_image();
                            // read viewmodel.request.passport_image
                            viewmodelRequestPassportImage = viewmodelRequest.getPassport_image();
                        }
                }
                if ((dirtyFlags & 0xb1L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.passportError
                            viewmodelRequestPassportError = viewmodelRequest.passportError;
                        }
                        updateRegistration(0, viewmodelRequestPassportError);


                        if (viewmodelRequestPassportError != null) {
                            // read viewmodel.request.passportError.get()
                            viewmodelRequestPassportErrorGet = viewmodelRequestPassportError.get();
                        }
                }
                if ((dirtyFlags & 0xb2L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.identityError
                            viewmodelRequestIdentityError = viewmodelRequest.identityError;
                        }
                        updateRegistration(1, viewmodelRequestIdentityError);


                        if (viewmodelRequestIdentityError != null) {
                            // read viewmodel.request.identityError.get()
                            viewmodelRequestIdentityErrorGet = viewmodelRequestIdentityError.get();
                        }
                }
                if ((dirtyFlags & 0xb4L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.licenceError
                            viewmodelRequestLicenceError = viewmodelRequest.licenceError;
                        }
                        updateRegistration(2, viewmodelRequestLicenceError);


                        if (viewmodelRequestLicenceError != null) {
                            // read viewmodel.request.licenceError.get()
                            viewmodelRequestLicenceErrorGet = viewmodelRequestLicenceError.get();
                        }
                }
                if ((dirtyFlags & 0xb8L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.taxError
                            viewmodelRequestTaxError = viewmodelRequest.taxError;
                        }
                        updateRegistration(3, viewmodelRequestTaxError);


                        if (viewmodelRequestTaxError != null) {
                            // read viewmodel.request.taxError.get()
                            viewmodelRequestTaxErrorGet = viewmodelRequestTaxError.get();
                        }
                }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xd0L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xd0L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xd0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0xd0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_primary_medium)));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback64);
            this.auto.setOnClickListener(mCallback60);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            this.inputCompanyName.setVisibility(userHelperGetInstanceContextAccountTypeEqualsJavaLangString0ViewGONEViewVISIBLE);
            this.inputName.setVisibility(userHelperGetInstanceContextAccountTypeEqualsJavaLangString0ViewGONEViewVISIBLE);
            this.mboundView4.setOnClickListener(mCallback61);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback62);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback63);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelRequestLicenceImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelRequestTaxImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelRequestIdentityImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelRequestPassportImage);
        }
        if ((dirtyFlags & 0xb8L) != 0) {
            // api target 1

            this.inputCompanyName.setError(viewmodelRequestTaxErrorGet);
        }
        if ((dirtyFlags & 0xb1L) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelRequestPassportErrorGet);
        }
        if ((dirtyFlags & 0xb4L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelRequestLicenceErrorGet);
        }
        if ((dirtyFlags & 0xb2L) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelRequestIdentityErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.NATIONAL_ID_PHOTO);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.PASSPORT_PHOTO);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.registerDoc();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.COMMERCIAL_IMAGE);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.TAX_CARD_PHOTO);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.passportError
        flag 1 (0x2L): viewmodel.request.identityError
        flag 2 (0x3L): viewmodel.request.licenceError
        flag 3 (0x4L): viewmodel.request.taxError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.request
        flag 6 (0x7L): viewmodel.message
        flag 7 (0x8L): null
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): UserHelper.getInstance(context).accountType.equals("0") ? View.GONE : View.VISIBLE
        flag 13 (0xeL): UserHelper.getInstance(context).accountType.equals("0") ? View.GONE : View.VISIBLE
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 15 (0x10L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}