package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEditProfileBindingImpl extends FragmentEditProfileBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 11);
        sViewsWithIds.put(R.id.tv_profile_title, 12);
        sViewsWithIds.put(R.id.input_password, 13);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView7;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
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
            te.app.notta.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            te.app.notta.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentEditProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[12]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.memberProfile.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback21 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback20 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback22 = new te.app.notta.generated.callback.OnClickListener(this, 5);
        mCallback18 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.notta.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.auth.register.RegisterViewModel Viewmodel) {
        updateRegistration(2, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodel((te.app.notta.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
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
        te.app.notta.pages.auth.models.RegisterRequest viewmodelRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        java.lang.String viewmodelUserDataImage = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestEmailError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        java.lang.String viewmodelRequestEmailErrorGet = null;
        te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x2fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0x2cL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                            // read viewmodel.request.email
                            viewmodelRequestEmail = viewmodelRequest.getEmail();
                        }
                }
                if ((dirtyFlags & 0x2dL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.emailError
                            viewmodelRequestEmailError = viewmodelRequest.emailError;
                        }
                        updateRegistration(0, viewmodelRequestEmailError);


                        if (viewmodelRequestEmailError != null) {
                            // read viewmodel.request.emailError.get()
                            viewmodelRequestEmailErrorGet = viewmodelRequestEmailError.get();
                        }
                }
                if ((dirtyFlags & 0x2eL) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(1, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x34L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x34L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0x24L) != 0) {

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

        if ((dirtyFlags & 0x100L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x34L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x34L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x34L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
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
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback22);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback18);
            this.mboundView3.setOnClickListener(mCallback20);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback21);
            this.memberProfile.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelRequestEmail);
        }
        if ((dirtyFlags & 0x2dL) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelRequestEmailErrorGet);
        }
        if ((dirtyFlags & 0x2eL) != 0) {
            // api target 1

            this.inputName.setError(viewmodelRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadImage(this.memberProfile, viewmodelUserDataImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.IMAGE);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.CHANGE_PASSWORD);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.IMAGE);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.updateProfile();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.emailError
        flag 1 (0x2L): viewmodel.request.nameError
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): viewmodel.request
        flag 4 (0x5L): viewmodel.message
        flag 5 (0x6L): null
        flag 6 (0x7L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 12 (0xdL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}