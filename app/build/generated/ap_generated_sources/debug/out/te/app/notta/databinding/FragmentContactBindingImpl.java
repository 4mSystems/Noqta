package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_login_header, 12);
        sViewsWithIds.put(R.id.tv_about_title, 13);
        sViewsWithIds.put(R.id.login_container, 14);
        sViewsWithIds.put(R.id.ic_logo, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView7;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.name
            //         is viewmodel.contactUsRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.name
            java.lang.String viewmodelContactUsRequestName = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            te.app.notta.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



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
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.email
            //         is viewmodel.contactUsRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            te.app.notta.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel.contactUsRequest.email
            java.lang.String viewmodelContactUsRequestEmail = null;
            // viewmodel
            te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



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
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.phone
            //         is viewmodel.contactUsRequest.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.phone
            java.lang.String viewmodelContactUsRequestPhone = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            te.app.notta.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



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
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.contactUsRequest.message
            //         is viewmodel.contactUsRequest.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.contactUsRequest.message
            java.lang.String viewmodelContactUsRequestMessage = null;
            // viewmodel.contactUsRequest != null
            boolean viewmodelContactUsRequestJavaLangObjectNull = false;
            // viewmodel.contactUsRequest
            te.app.notta.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
            // viewmodel
            te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[11]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[13]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputContactMessage.setTag(null);
        this.inputName.setTag(null);
        this.inputRegisterEmail.setTag(null);
        this.inputRegisterPhone.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (androidx.appcompat.widget.AppCompatEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback66 = new te.app.notta.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((te.app.notta.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodelContactUsRequestNoteError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelContactUsRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelContactUsRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((te.app.notta.pages.settings.viewModels.SettingsViewModel) object, fieldId);
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
    private boolean onChangeViewmodelContactUsRequestNoteError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestNoteError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelContactUsRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelContactUsRequestPhoneError, int fieldId) {
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
    private boolean onChangeViewmodel(te.app.notta.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
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
        te.app.notta.pages.settings.models.ContactUsRequest viewmodelContactUsRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestNameError = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        java.lang.String viewmodelMessage = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestNoteError = null;
        java.lang.String viewmodelContactUsRequestEmailErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestPhoneError = null;
        java.lang.String viewmodelContactUsRequestPhoneErrorGet = null;
        java.lang.String viewmodelContactUsRequestMessage = null;
        java.lang.String viewmodelContactUsRequestName = null;
        java.lang.String viewmodelContactUsRequestPhone = null;
        java.lang.String viewmodelContactUsRequestNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelContactUsRequestEmailError = null;
        java.lang.String viewmodelContactUsRequestEmail = null;
        te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
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
                            // read viewmodel.contactUsRequest.noteError
                            viewmodelContactUsRequestNoteError = viewmodelContactUsRequest.noteError;
                        }
                        updateRegistration(1, viewmodelContactUsRequestNoteError);


                        if (viewmodelContactUsRequestNoteError != null) {
                            // read viewmodel.contactUsRequest.noteError.get()
                            viewmodelContactUsRequestNoteErrorGet = viewmodelContactUsRequestNoteError.get();
                        }
                }
                if ((dirtyFlags & 0x54L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.phoneError
                            viewmodelContactUsRequestPhoneError = viewmodelContactUsRequest.phoneError;
                        }
                        updateRegistration(2, viewmodelContactUsRequestPhoneError);


                        if (viewmodelContactUsRequestPhoneError != null) {
                            // read viewmodel.contactUsRequest.phoneError.get()
                            viewmodelContactUsRequestPhoneErrorGet = viewmodelContactUsRequestPhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x50L) != 0) {

                        if (viewmodelContactUsRequest != null) {
                            // read viewmodel.contactUsRequest.message
                            viewmodelContactUsRequestMessage = viewmodelContactUsRequest.getMessage();
                            // read viewmodel.contactUsRequest.name
                            viewmodelContactUsRequestName = viewmodelContactUsRequest.getName();
                            // read viewmodel.contactUsRequest.phone
                            viewmodelContactUsRequestPhone = viewmodelContactUsRequest.getPhone();
                            // read viewmodel.contactUsRequest.email
                            viewmodelContactUsRequestEmail = viewmodelContactUsRequest.getEmail();
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


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x70L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x70L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x70L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback66);
            this.mboundView1.setOnClickListener(mCallback65);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.inputContactMessage.setError(viewmodelContactUsRequestNoteErrorGet);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelContactUsRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            this.inputRegisterEmail.setError(viewmodelContactUsRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.inputRegisterPhone.setError(viewmodelContactUsRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelContactUsRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelContactUsRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelContactUsRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelContactUsRequestMessage);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sendContact();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.contactUsRequest.nameError
        flag 1 (0x2L): viewmodel.contactUsRequest.noteError
        flag 2 (0x3L): viewmodel.contactUsRequest.phoneError
        flag 3 (0x4L): viewmodel.contactUsRequest.emailError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.message
        flag 6 (0x7L): null
        flag 7 (0x8L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}