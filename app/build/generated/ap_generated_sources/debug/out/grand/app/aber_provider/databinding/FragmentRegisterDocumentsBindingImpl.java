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
        sViewsWithIds.put(R.id.register, 9);
        sViewsWithIds.put(R.id.progress_percentage, 10);
        sViewsWithIds.put(R.id.tv_percentage, 11);
        sViewsWithIds.put(R.id.card_personal_info, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(auto);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
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




                    viewmodelRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterDocumentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterDocumentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[8]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[11]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.inputCompanyName.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback68 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((grand.app.aber_provider.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.auth.register.RegisterViewModel Viewmodel) {
        updateRegistration(3, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodel((grand.app.aber_provider.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
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
        grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestPhone = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPhoneError = null;
        java.lang.String viewmodelRequestPhoneErrorGet = null;
        java.lang.String viewmodelMessage = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestEmailError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestEmailErrorGet = null;
        grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x5fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0x58L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.phone
                            viewmodelRequestPhone = viewmodelRequest.getPhone();
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                        }
                }
                if ((dirtyFlags & 0x59L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(0, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }
                }
                if ((dirtyFlags & 0x5aL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.phoneError
                            viewmodelRequestPhoneError = viewmodelRequest.phoneError;
                        }
                        updateRegistration(1, viewmodelRequestPhoneError);


                        if (viewmodelRequestPhoneError != null) {
                            // read viewmodel.request.phoneError.get()
                            viewmodelRequestPhoneErrorGet = viewmodelRequestPhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x5cL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.emailError
                            viewmodelRequestEmailError = viewmodelRequest.emailError;
                        }
                        updateRegistration(2, viewmodelRequestEmailError);


                        if (viewmodelRequestEmailError != null) {
                            // read viewmodel.request.emailError.get()
                            viewmodelRequestEmailErrorGet = viewmodelRequestEmailError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x68L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x68L) != 0) {
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

        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x68L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x68L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x68L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_primary_medium)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback68);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelRequestPhone);
        }
        if ((dirtyFlags & 0x59L) != 0) {
            // api target 1

            this.inputCompanyName.setError(viewmodelRequestNameErrorGet);
            this.inputName.setError(viewmodelRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x5cL) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x5aL) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelRequestPhoneErrorGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.aber_provider.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.nameError
        flag 1 (0x2L): viewmodel.request.phoneError
        flag 2 (0x3L): viewmodel.request.emailError
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): viewmodel.request
        flag 5 (0x6L): viewmodel.message
        flag 6 (0x7L): null
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}