package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddTaskBindingImpl extends FragmentAddTaskBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 13);
        sViewsWithIds.put(R.id.tv_profile_title, 14);
        sViewsWithIds.put(R.id.ic_logo, 15);
        sViewsWithIds.put(R.id.tv_images, 16);
        sViewsWithIds.put(R.id.images_container, 17);
        sViewsWithIds.put(R.id.tv_video, 18);
        sViewsWithIds.put(R.id.video_container, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addTaskRequest.description
            //         is viewmodel.addTaskRequest.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(auto);
            // localize variables for thread safety
            // viewmodel.addTaskRequest
            te.app.notta.pages.teacher.models.AddTaskRequest viewmodelAddTaskRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addTaskRequest.description
            java.lang.String viewmodelAddTaskRequestDescription = null;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;
            // viewmodel.addTaskRequest != null
            boolean viewmodelAddTaskRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddTaskRequest = viewmodel.getAddTaskRequest();

                viewmodelAddTaskRequestJavaLangObjectNull = (viewmodelAddTaskRequest) != (null);
                if (viewmodelAddTaskRequestJavaLangObjectNull) {




                    viewmodelAddTaskRequest.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addTaskRequest.groupId
            //         is viewmodel.addTaskRequest.setGroupId((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel.addTaskRequest
            te.app.notta.pages.teacher.models.AddTaskRequest viewmodelAddTaskRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addTaskRequest.groupId
            java.lang.String viewmodelAddTaskRequestGroupId = null;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;
            // viewmodel.addTaskRequest != null
            boolean viewmodelAddTaskRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddTaskRequest = viewmodel.getAddTaskRequest();

                viewmodelAddTaskRequestJavaLangObjectNull = (viewmodelAddTaskRequest) != (null);
                if (viewmodelAddTaskRequestJavaLangObjectNull) {




                    viewmodelAddTaskRequest.setGroupId(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener noOfStudentsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addTaskRequest.points
            //         is viewmodel.addTaskRequest.setPoints((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(noOfStudents);
            // localize variables for thread safety
            // viewmodel.addTaskRequest
            te.app.notta.pages.teacher.models.AddTaskRequest viewmodelAddTaskRequest = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addTaskRequest.points
            java.lang.String viewmodelAddTaskRequestPoints = null;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;
            // viewmodel.addTaskRequest != null
            boolean viewmodelAddTaskRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddTaskRequest = viewmodel.getAddTaskRequest();

                viewmodelAddTaskRequestJavaLangObjectNull = (viewmodelAddTaskRequest) != (null);
                if (viewmodelAddTaskRequestJavaLangObjectNull) {




                    viewmodelAddTaskRequest.setPoints(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentAddTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (te.app.notta.customViews.views.IncrementalView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[12]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.back.setTag(null);
        this.icCloudUpload.setTag(null);
        this.icCloudUploadVideo.setTag(null);
        this.incrementalViewStudentCount.setTag(null);
        this.inputGroupDesc.setTag(null);
        this.inputGroupName.setTag(null);
        this.inputStudents.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.noOfStudents.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback44 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback45 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback46 = new te.app.notta.generated.callback.OnClickListener(this, 3);
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
            setViewmodel((te.app.notta.pages.teacher.viewModels.AddTaskViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.teacher.viewModels.AddTaskViewModel Viewmodel) {
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
                return onChangeViewmodelAddTaskRequestDescError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddTaskRequestGroupIdError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddTaskRequestPointsError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodel((te.app.notta.pages.teacher.viewModels.AddTaskViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelAddTaskRequestDescError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddTaskRequestDescError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddTaskRequestGroupIdError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddTaskRequestGroupIdError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddTaskRequestPointsError(androidx.databinding.ObservableField<java.lang.String> ViewmodelAddTaskRequestPointsError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.teacher.viewModels.AddTaskViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.addTaskRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
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
        te.app.notta.PassingObject viewmodelPassingObject = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelAddTaskRequestDescErrorGet = null;
        te.app.notta.pages.teacher.models.AddTaskRequest viewmodelAddTaskRequest = null;
        java.lang.String viewmodelAddTaskRequestPointsErrorGet = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelPassingObjectIdInt0 = false;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelAddTaskRequestGroupId = null;
        int viewmodelPassingObjectId = 0;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddTaskRequestDescError = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddTaskRequestGroupIdError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelAddTaskRequestPointsError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int viewmodelPassingObjectIdInt0ViewGONEViewVISIBLE = 0;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelAddTaskRequestDescription = null;
        java.lang.String viewmodelAddTaskRequestGroupIdErrorGet = null;
        java.lang.String viewmodelAddTaskRequestPoints = null;
        te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xa8L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.id
                        viewmodelPassingObjectId = viewmodelPassingObject.getId();
                    }


                    // read viewmodel.passingObject.id != 0
                    viewmodelPassingObjectIdInt0 = (viewmodelPassingObjectId) != (0);
                if((dirtyFlags & 0xa8L) != 0) {
                    if(viewmodelPassingObjectIdInt0) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewmodel.passingObject.id != 0 ? View.GONE : View.VISIBLE
                    viewmodelPassingObjectIdInt0ViewGONEViewVISIBLE = ((viewmodelPassingObjectIdInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x88L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onPointsTextChanged
                        viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x9fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addTaskRequest
                        viewmodelAddTaskRequest = viewmodel.getAddTaskRequest();
                    }

                if ((dirtyFlags & 0x98L) != 0) {

                        if (viewmodelAddTaskRequest != null) {
                            // read viewmodel.addTaskRequest.groupId
                            viewmodelAddTaskRequestGroupId = viewmodelAddTaskRequest.getGroupId();
                            // read viewmodel.addTaskRequest.description
                            viewmodelAddTaskRequestDescription = viewmodelAddTaskRequest.getDescription();
                            // read viewmodel.addTaskRequest.points
                            viewmodelAddTaskRequestPoints = viewmodelAddTaskRequest.getPoints();
                        }
                }
                if ((dirtyFlags & 0x99L) != 0) {

                        if (viewmodelAddTaskRequest != null) {
                            // read viewmodel.addTaskRequest.descError
                            viewmodelAddTaskRequestDescError = viewmodelAddTaskRequest.descError;
                        }
                        updateRegistration(0, viewmodelAddTaskRequestDescError);


                        if (viewmodelAddTaskRequestDescError != null) {
                            // read viewmodel.addTaskRequest.descError.get()
                            viewmodelAddTaskRequestDescErrorGet = viewmodelAddTaskRequestDescError.get();
                        }
                }
                if ((dirtyFlags & 0x9aL) != 0) {

                        if (viewmodelAddTaskRequest != null) {
                            // read viewmodel.addTaskRequest.groupIdError
                            viewmodelAddTaskRequestGroupIdError = viewmodelAddTaskRequest.groupIdError;
                        }
                        updateRegistration(1, viewmodelAddTaskRequestGroupIdError);


                        if (viewmodelAddTaskRequestGroupIdError != null) {
                            // read viewmodel.addTaskRequest.groupIdError.get()
                            viewmodelAddTaskRequestGroupIdErrorGet = viewmodelAddTaskRequestGroupIdError.get();
                        }
                }
                if ((dirtyFlags & 0x9cL) != 0) {

                        if (viewmodelAddTaskRequest != null) {
                            // read viewmodel.addTaskRequest.pointsError
                            viewmodelAddTaskRequestPointsError = viewmodelAddTaskRequest.pointsError;
                        }
                        updateRegistration(2, viewmodelAddTaskRequestPointsError);


                        if (viewmodelAddTaskRequestPointsError != null) {
                            // read viewmodel.addTaskRequest.pointsError.get()
                            viewmodelAddTaskRequestPointsErrorGet = viewmodelAddTaskRequestPointsError.get();
                        }
                }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xc8L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xc8L) != 0) {
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
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xc8L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xc8L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xc8L) != 0) {
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
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback47);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            this.back.setOnClickListener(mCallback44);
            this.icCloudUpload.setOnClickListener(mCallback45);
            this.icCloudUploadVideo.setOnClickListener(mCallback46);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x98L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelAddTaskRequestDescription);
            te.app.notta.customViews.views.IncrementalView.getValue(this.incrementalViewStudentCount, viewmodelAddTaskRequestPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelAddTaskRequestGroupId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.noOfStudents, viewmodelAddTaskRequestPoints);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            this.inputGroupDesc.setVisibility(viewmodelPassingObjectIdInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x9aL) != 0) {
            // api target 1

            this.inputGroupDesc.setError(viewmodelAddTaskRequestGroupIdErrorGet);
        }
        if ((dirtyFlags & 0x99L) != 0) {
            // api target 1

            this.inputGroupName.setError(viewmodelAddTaskRequestDescErrorGet);
        }
        if ((dirtyFlags & 0x9cL) != 0) {
            // api target 1

            this.inputStudents.setError(viewmodelAddTaskRequestPointsErrorGet);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.noOfStudents, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, noOfStudentsandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.notta.pages.teacher.viewModels.AddTaskViewModel value;
        public OnTextChangedImpl setValue(te.app.notta.pages.teacher.viewModels.AddTaskViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onPointsTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createTask();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;



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
                te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.IMAGE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.teacher.viewModels.AddTaskViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.PLAY_VIDEO);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.addTaskRequest.descError
        flag 1 (0x2L): viewmodel.addTaskRequest.groupIdError
        flag 2 (0x3L): viewmodel.addTaskRequest.pointsError
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): viewmodel.addTaskRequest
        flag 5 (0x6L): viewmodel.passingObject
        flag 6 (0x7L): viewmodel.message
        flag 7 (0x8L): null
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 14 (0xfL): viewmodel.passingObject.id != 0 ? View.GONE : View.VISIBLE
        flag 15 (0x10L): viewmodel.passingObject.id != 0 ? View.GONE : View.VISIBLE
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}