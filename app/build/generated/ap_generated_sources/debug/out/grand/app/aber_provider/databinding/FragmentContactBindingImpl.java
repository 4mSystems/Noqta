package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.curve, 11);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.name
            //         is viewmodel.contactUsRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.name
            java.lang.String viewmodelContactUsRequestName = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.aber_provider.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.email
            //         is viewmodel.contactUsRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.aber_provider.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel.contactUsRequest.email
            java.lang.String viewmodelContactUsRequestEmail = null;
            // viewmodel
            grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.phone
            //         is viewmodel.contactUsRequest.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.phone
            java.lang.String viewmodelContactUsRequestPhone = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.aber_provider.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.message
            //         is viewmodel.contactUsRequest.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.message
            java.lang.String viewmodelContactUsRequestMessage = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            grand.app.aber_provider.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelContactUsRequest = viewmodel.getContactUsRequest();

                viewmodelContactUsRequestJavaLangObjectNull = (viewmodelContactUsRequest) != (null);
                if (viewmodelContactUsRequestJavaLangObjectNull) {




                    viewmodelContactUsRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputContactMessage.setTag(null);
        this.inputName.setTag(null);
        this.inputPhone.setTag(null);
        this.inputRegisterEmail.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewmodel((grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodelContactUsRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelContactUsRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelContactUsRequestNoteError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelContactUsRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelContactUsRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelContactUsRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelContactUsRequestNoteError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestNoteError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelContactUsRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.String viewmodelContactUsRequestNoteErrorGet = null;
        grand.app.aber_provider.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestNameError = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelContactUsRequestEmailErrorGet = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestPhoneError = null;
        java.lang.String viewmodelContactUsRequestName = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelContactUsRequestNameErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestNoteError = null;
        java.lang.String viewmodelContactUsRequestPhoneErrorGet = null;
        java.lang.String viewmodelContactUsRequestMessage = null;
        java.lang.String viewmodelContactUsRequestPhone = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestEmailError = null;
        java.lang.String viewmodelContactUsRequestEmail = null;
        grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x5fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.contactUsRequest
                        viewmodelContactUsRequest = viewmodel.getContactUsRequest();
                    }

                if ((dirtyFlags & 0x51L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.nameError
                            viewmodelContactUsRequestNameError = viewmodelContactUsRequest.nameError;
                        }
                        updateRegistration(0, viewmodelContactUsRequestNameError);


                        if (viewmodelContactUsRequestNameError != null) {
                            // read viewmodel.contactUsRequest.nameError.get()
                            viewmodelContactUsRequestNameErrorGet = viewmodelContactUsRequestNameError.get();
                        }
                }
                if ((dirtyFlags & 0x52L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.phoneError
                            viewmodelContactUsRequestPhoneError = viewmodelContactUsRequest.phoneError;
                        }
                        updateRegistration(1, viewmodelContactUsRequestPhoneError);


                        if (viewmodelContactUsRequestPhoneError != null) {
                            // read viewmodel.contactUsRequest.phoneError.get()
                            viewmodelContactUsRequestPhoneErrorGet = viewmodelContactUsRequestPhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x50L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.name
                            viewmodelContactUsRequestName = viewmodelContactUsRequest.getName();
                            // read viewmodel.contactUsRequest.message
                            viewmodelContactUsRequestMessage = viewmodelContactUsRequest.getMessage();
                            // read viewmodel.contactUsRequest.phone
                            viewmodelContactUsRequestPhone = viewmodelContactUsRequest.getPhone();
                            // read viewmodel.contactUsRequest.email
                            viewmodelContactUsRequestEmail = viewmodelContactUsRequest.getEmail();
                        }
                }
                if ((dirtyFlags & 0x54L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.noteError
                            viewmodelContactUsRequestNoteError = viewmodelContactUsRequest.noteError;
                        }
                        updateRegistration(2, viewmodelContactUsRequestNoteError);


                        if (viewmodelContactUsRequestNoteError != null) {
                            // read viewmodel.contactUsRequest.noteError.get()
                            viewmodelContactUsRequestNoteErrorGet = viewmodelContactUsRequestNoteError.get();
                        }
                }
                if ((dirtyFlags & 0x58L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.emailError
                            viewmodelContactUsRequestEmailError = viewmodelContactUsRequest.emailError;
                        }
                        updateRegistration(3, viewmodelContactUsRequestEmailError);


                        if (viewmodelContactUsRequestEmailError != null) {
                            // read viewmodel.contactUsRequest.emailError.get()
                            viewmodelContactUsRequestEmailErrorGet = viewmodelContactUsRequestEmailError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x70L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x70L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x70L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x70L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x70L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
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
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback41);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.inputContactMessage.setError(viewmodelContactUsRequestNoteErrorGet);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelContactUsRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelContactUsRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            this.inputRegisterEmail.setError(viewmodelContactUsRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelContactUsRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelContactUsRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelContactUsRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelContactUsRequestMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.sendContact();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.contactUsRequest.nameError
        flag 1 (0x2L): viewmodel.contactUsRequest.phoneError
        flag 2 (0x3L): viewmodel.contactUsRequest.noteError
        flag 3 (0x4L): viewmodel.contactUsRequest.emailError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.message
        flag 6 (0x7L): null
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}