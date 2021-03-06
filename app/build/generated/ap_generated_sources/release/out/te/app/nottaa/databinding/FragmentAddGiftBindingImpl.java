package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddGiftBindingImpl extends FragmentAddGiftBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 16);
        sViewsWithIds.put(R.id.tv_profile_title, 17);
        sViewsWithIds.put(R.id.ic_logo, 18);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView12;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final android.view.View.OnClickListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    private OnTextChangedImpl1 mViewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
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
            te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
            // viewmodel
            te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
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
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.numOfWinners
            //         is viewmodel.request.setNumOfWinners((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
            // viewmodel.request.numOfWinners
            java.lang.String viewmodelRequestNumOfWinners = null;
            // viewmodel
            te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setNumOfWinners(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.description
            //         is viewmodel.request.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
            // viewmodel
            te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
            // viewmodel.request.description
            java.lang.String viewmodelRequestDescription = null;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.image
            //         is viewmodel.request.setImage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
            // viewmodel.request.image
            java.lang.String viewmodelRequestImage = null;
            // viewmodel
            te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setImage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.points
            //         is viewmodel.request.setPoints((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
            // viewmodel.request.points
            java.lang.String viewmodelRequestPoints = null;
            // viewmodel
            te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPoints(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddGiftBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentAddGiftBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (te.app.nottaa.customViews.views.IncrementalView) bindings[13]
            , (te.app.nottaa.customViews.views.IncrementalView) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[15]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[17]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.back.setTag(null);
        this.incrementalViewGiftCount.setTag(null);
        this.incrementalViewStudentCount.setTag(null);
        this.inputGiftImage.setTag(null);
        this.inputGiftName.setTag(null);
        this.inputGiftTaker.setTag(null);
        this.inputGroupDesc.setTag(null);
        this.inputPoints.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (com.google.android.material.textfield.TextInputEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback87 = new te.app.nottaa.generated.callback.OnClickListener(this, 3);
        mCallback86 = new te.app.nottaa.generated.callback.OnClickListener(this, 2);
        mCallback85 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewmodel((te.app.nottaa.pages.points.viewModels.PointsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.nottaa.pages.points.viewModels.PointsViewModel Viewmodel) {
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
                return onChangeViewmodelRequestDescError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestPointsError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestWinnersError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelRequestImageError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodel((te.app.nottaa.pages.points.viewModels.PointsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestDescError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestDescError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPointsError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPointsError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestWinnersError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestWinnersError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestImageError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestImageError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.nottaa.pages.points.viewModels.PointsViewModel Viewmodel, int fieldId) {
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
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestDescError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPointsError = null;
        te.app.nottaa.pages.teacher.models.AddGiftRequest viewmodelRequest = null;
        java.lang.String viewmodelRequestImage = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestPoints = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestWinnersError = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelRequestImageErrorGet = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestDescErrorGet = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestImageError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestDescription = null;
        java.lang.String viewmodelRequestNumOfWinners = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        java.lang.String viewmodelRequestWinnersErrorGet = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        java.lang.String viewmodelRequestPointsErrorGet = null;
        te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x17fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0x161L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.descError
                            viewmodelRequestDescError = viewmodelRequest.descError;
                        }
                        updateRegistration(0, viewmodelRequestDescError);


                        if (viewmodelRequestDescError != null) {
                            // read viewmodel.request.descError.get()
                            viewmodelRequestDescErrorGet = viewmodelRequestDescError.get();
                        }
                }
                if ((dirtyFlags & 0x162L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.pointsError
                            viewmodelRequestPointsError = viewmodelRequest.pointsError;
                        }
                        updateRegistration(1, viewmodelRequestPointsError);


                        if (viewmodelRequestPointsError != null) {
                            // read viewmodel.request.pointsError.get()
                            viewmodelRequestPointsErrorGet = viewmodelRequestPointsError.get();
                        }
                }
                if ((dirtyFlags & 0x160L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.image
                            viewmodelRequestImage = viewmodelRequest.getImage();
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                            // read viewmodel.request.points
                            viewmodelRequestPoints = viewmodelRequest.getPoints();
                            // read viewmodel.request.description
                            viewmodelRequestDescription = viewmodelRequest.getDescription();
                            // read viewmodel.request.numOfWinners
                            viewmodelRequestNumOfWinners = viewmodelRequest.getNumOfWinners();
                        }
                }
                if ((dirtyFlags & 0x164L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.winnersError
                            viewmodelRequestWinnersError = viewmodelRequest.winnersError;
                        }
                        updateRegistration(2, viewmodelRequestWinnersError);


                        if (viewmodelRequestWinnersError != null) {
                            // read viewmodel.request.winnersError.get()
                            viewmodelRequestWinnersErrorGet = viewmodelRequestWinnersError.get();
                        }
                }
                if ((dirtyFlags & 0x168L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.imageError
                            viewmodelRequestImageError = viewmodelRequest.imageError;
                        }
                        updateRegistration(3, viewmodelRequestImageError);


                        if (viewmodelRequestImageError != null) {
                            // read viewmodel.request.imageError.get()
                            viewmodelRequestImageErrorGet = viewmodelRequestImageError.get();
                        }
                }
                if ((dirtyFlags & 0x170L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(4, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }
                }
            }
            if ((dirtyFlags & 0x120L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onPointsTextChanged
                        viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                        // read viewmodel::onWinnersTextChanged
                        viewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl1()) : mViewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.nottaa.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.nottaa.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x1a0L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x1a0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x1a0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
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
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback87);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            this.back.setOnClickListener(mCallback85);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView7.setOnClickListener(mCallback86);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelRequestName);
            te.app.nottaa.customViews.views.IncrementalView.getValue(this.incrementalViewGiftCount, viewmodelRequestNumOfWinners);
            te.app.nottaa.customViews.views.IncrementalView.getValue(this.incrementalViewStudentCount, viewmodelRequestPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewmodelRequestNumOfWinners);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelRequestDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelRequestImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewmodelRequestPoints);
        }
        if ((dirtyFlags & 0x168L) != 0) {
            // api target 1

            this.inputGiftImage.setError(viewmodelRequestImageErrorGet);
        }
        if ((dirtyFlags & 0x170L) != 0) {
            // api target 1

            this.inputGiftName.setError(viewmodelRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x164L) != 0) {
            // api target 1

            this.inputGiftTaker.setError(viewmodelRequestWinnersErrorGet);
        }
        if ((dirtyFlags & 0x161L) != 0) {
            // api target 1

            this.inputGroupDesc.setError(viewmodelRequestDescErrorGet);
        }
        if ((dirtyFlags & 0x162L) != 0) {
            // api target 1

            this.inputPoints.setError(viewmodelRequestPointsErrorGet);
        }
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnWinnersTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.nottaa.pages.points.viewModels.PointsViewModel value;
        public OnTextChangedImpl setValue(te.app.nottaa.pages.points.viewModels.PointsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onPointsTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    public static class OnTextChangedImpl1 implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.nottaa.pages.points.viewModels.PointsViewModel value;
        public OnTextChangedImpl1 setValue(te.app.nottaa.pages.points.viewModels.PointsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onWinnersTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createGift();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.nottaa.utils.Constants.IMAGE);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.nottaa.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;



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
        flag 0 (0x1L): viewmodel.request.descError
        flag 1 (0x2L): viewmodel.request.pointsError
        flag 2 (0x3L): viewmodel.request.winnersError
        flag 3 (0x4L): viewmodel.request.imageError
        flag 4 (0x5L): viewmodel.request.nameError
        flag 5 (0x6L): viewmodel
        flag 6 (0x7L): viewmodel.request
        flag 7 (0x8L): viewmodel.message
        flag 8 (0x9L): null
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 15 (0x10L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}