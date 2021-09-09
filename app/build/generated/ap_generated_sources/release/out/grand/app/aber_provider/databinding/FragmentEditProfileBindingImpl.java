package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditProfileBindingImpl extends FragmentEditProfileBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.curve, 17);
        sViewsWithIds.put(R.id.br, 18);
        sViewsWithIds.put(R.id.input_new_password, 19);
        sViewsWithIds.put(R.id.register, 20);
        sViewsWithIds.put(R.id.card_personal_info, 21);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView10;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView12;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView13;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView14;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.MaterialAutoCompleteTextView mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.address
            //         is viewmodel.request.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.address
            java.lang.String viewmodelRequestAddress = null;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.companyName
            //         is viewmodel.request.setCompanyName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request.companyName
            java.lang.String viewmodelRequestCompanyName = null;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setCompanyName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentEditProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentEditProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.constraintlayout.widget.Barrier) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[16]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[20]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.appCompatButtonNext.setTag(null);
        this.inputCompanyName.setTag(null);
        this.inputEmail.setTag(null);
        this.inputLocation.setTag(null);
        this.inputName.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (androidx.appcompat.widget.AppCompatEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (androidx.appcompat.widget.AppCompatEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (androidx.appcompat.widget.AppCompatEditText) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (androidx.recyclerview.widget.RecyclerView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        this.userImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback43 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback42 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback40 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback41 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewmodel((grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel Viewmodel) {
        updateRegistration(5, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestAddressError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelRequestCompanyNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodel((grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestAddressError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestAddressError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestCompanyNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestCompanyNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.servicesAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        grand.app.aber_provider.pages.auth.register.ServicesAdapter viewmodelServicesAdapter = null;
        grand.app.aber_provider.pages.auth.models.RegisterRequest viewmodelRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        java.lang.String viewmodelRequestCompanyNameErrorGet = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        java.lang.String viewmodelRequestCompanyName = null;
        java.lang.String viewmodelRequestPhoneErrorGet = null;
        java.lang.String viewmodelMessage = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestAddressError = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        int viewmodelRequestNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        java.lang.String viewmodelUserDataImage = null;
        int viewmodelRequestIsCompanyEqualsJavaLangString1ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelRequestAddressErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestEmailError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestPhone = null;
        boolean viewmodelRequestIsCompanyEqualsJavaLangString1 = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPhoneError = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewmodelUserData = null;
        java.lang.String viewmodelRequestAddress = null;
        java.lang.String viewmodelRequestIsCompany = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestCompanyNameError = null;
        boolean viewmodelRequestNameJavaLangObjectNull = false;
        java.lang.String viewmodelRequestEmailErrorGet = null;
        grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.servicesAdapter
                        viewmodelServicesAdapter = viewmodel.getServicesAdapter();
                    }
            }
            if ((dirtyFlags & 0x27fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0x260L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                            // read viewmodel.request.email
                            viewmodelRequestEmail = viewmodelRequest.getEmail();
                            // read viewmodel.request.companyName
                            viewmodelRequestCompanyName = viewmodelRequest.getCompanyName();
                            // read viewmodel.request.phone
                            viewmodelRequestPhone = viewmodelRequest.getPhone();
                            // read viewmodel.request.address
                            viewmodelRequestAddress = viewmodelRequest.getAddress();
                            // read viewmodel.request.isCompany
                            viewmodelRequestIsCompany = viewmodelRequest.getIsCompany();
                        }


                        // read viewmodel.request.name != null
                        viewmodelRequestNameJavaLangObjectNull = (viewmodelRequestName) != (null);
                    if((dirtyFlags & 0x260L) != 0) {
                        if(viewmodelRequestNameJavaLangObjectNull) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }
                        if (viewmodelRequestIsCompany != null) {
                            // read viewmodel.request.isCompany.equals("1")
                            viewmodelRequestIsCompanyEqualsJavaLangString1 = viewmodelRequestIsCompany.equals("1");
                        }
                    if((dirtyFlags & 0x260L) != 0) {
                        if(viewmodelRequestIsCompanyEqualsJavaLangString1) {
                                dirtyFlags |= 0x8000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                        }
                    }


                        // read viewmodel.request.name != null ? View.VISIBLE : View.GONE
                        viewmodelRequestNameJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelRequestNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read viewmodel.request.isCompany.equals("1") ? View.VISIBLE : View.GONE
                        viewmodelRequestIsCompanyEqualsJavaLangString1ViewVISIBLEViewGONE = ((viewmodelRequestIsCompanyEqualsJavaLangString1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x261L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.addressError
                            viewmodelRequestAddressError = viewmodelRequest.addressError;
                        }
                        updateRegistration(0, viewmodelRequestAddressError);


                        if (viewmodelRequestAddressError != null) {
                            // read viewmodel.request.addressError.get()
                            viewmodelRequestAddressErrorGet = viewmodelRequestAddressError.get();
                        }
                }
                if ((dirtyFlags & 0x262L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.emailError
                            viewmodelRequestEmailError = viewmodelRequest.emailError;
                        }
                        updateRegistration(1, viewmodelRequestEmailError);


                        if (viewmodelRequestEmailError != null) {
                            // read viewmodel.request.emailError.get()
                            viewmodelRequestEmailErrorGet = viewmodelRequestEmailError.get();
                        }
                }
                if ((dirtyFlags & 0x264L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(2, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }
                }
                if ((dirtyFlags & 0x268L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.phoneError
                            viewmodelRequestPhoneError = viewmodelRequest.phoneError;
                        }
                        updateRegistration(3, viewmodelRequestPhoneError);


                        if (viewmodelRequestPhoneError != null) {
                            // read viewmodel.request.phoneError.get()
                            viewmodelRequestPhoneErrorGet = viewmodelRequestPhoneError.get();
                        }
                }
                if ((dirtyFlags & 0x270L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.companyNameError
                            viewmodelRequestCompanyNameError = viewmodelRequest.companyNameError;
                        }
                        updateRegistration(4, viewmodelRequestCompanyNameError);


                        if (viewmodelRequestCompanyNameError != null) {
                            // read viewmodel.request.companyNameError.get()
                            viewmodelRequestCompanyNameErrorGet = viewmodelRequestCompanyNameError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x320L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x320L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0x220L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.image
                        viewmodelUserDataImage = viewmodelUserData.getImage();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x320L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x320L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0x320L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
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
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback43);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            this.mboundView12.setOnClickListener(mCallback41);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView13.setOnClickListener(mCallback42);
            this.mboundView2.setOnClickListener(mCallback40);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.userImg.setOnClickListener(mCallback39);
        }
        if ((dirtyFlags & 0x260L) != 0) {
            // api target 1

            this.inputCompanyName.setVisibility(viewmodelRequestIsCompanyEqualsJavaLangString1ViewVISIBLEViewGONE);
            this.mboundView0.setVisibility(viewmodelRequestNameJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewmodelRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelRequestAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelRequestCompanyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelRequestEmail);
        }
        if ((dirtyFlags & 0x270L) != 0) {
            // api target 1

            this.inputCompanyName.setError(viewmodelRequestCompanyNameErrorGet);
        }
        if ((dirtyFlags & 0x262L) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x261L) != 0) {
            // api target 1

            this.inputLocation.setError(viewmodelRequestAddressErrorGet);
        }
        if ((dirtyFlags & 0x264L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x268L) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelRequestPhoneErrorGet);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.mboundView14, viewmodelServicesAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.loadMarketImage(this.userImg, viewmodelUserDataImage);
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
                // viewmodel.userData.image
                java.lang.String viewmodelUserDataImage = null;
                // viewmodel.userData
                grand.app.aber_provider.pages.auth.models.UserData viewmodelUserData = null;
                // viewmodel
                grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;
                // viewmodel.userData != null
                boolean viewmodelUserDataJavaLangObjectNull = false;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodelUserData = viewmodel.userData;

                    viewmodelUserDataJavaLangObjectNull = (viewmodelUserData) != (null);
                    if (viewmodelUserDataJavaLangObjectNull) {


                        viewmodelUserDataImage = viewmodelUserData.getImage();


                        viewmodel.showImage(viewmodelUserDataImage, callbackArg_0);
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.updateProfile();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.changePasword();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.IMAGE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.profile.viewModels.EditProfileViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.imageSubmit(grand.app.aber_provider.utils.Constants.PICK_UP_LOCATION);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.addressError
        flag 1 (0x2L): viewmodel.request.emailError
        flag 2 (0x3L): viewmodel.request.nameError
        flag 3 (0x4L): viewmodel.request.phoneError
        flag 4 (0x5L): viewmodel.request.companyNameError
        flag 5 (0x6L): viewmodel
        flag 6 (0x7L): viewmodel.request
        flag 7 (0x8L): viewmodel.servicesAdapter
        flag 8 (0x9L): viewmodel.message
        flag 9 (0xaL): null
        flag 10 (0xbL): viewmodel.request.name != null ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.request.name != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 14 (0xfL): viewmodel.request.isCompany.equals("1") ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.request.isCompany.equals("1") ? View.VISIBLE : View.GONE
        flag 16 (0x11L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 17 (0x12L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 18 (0x13L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 19 (0x14L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 20 (0x15L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 23 (0x18L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}