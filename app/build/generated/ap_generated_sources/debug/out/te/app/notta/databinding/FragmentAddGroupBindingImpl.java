package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddGroupBindingImpl extends FragmentAddGroupBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

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
    private final te.app.notta.customViews.views.FutureDateEditText mboundView13;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    private OnTextChangedImpl1 mViewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.groupRequest.name
            //         is viewmodel.groupRequest.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(auto);
            // localize variables for thread safety
            // viewmodel.groupRequest.name
            java.lang.String viewmodelGroupRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.groupRequest
            te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
            // viewmodel.groupRequest != null
            boolean viewmodelGroupRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelGroupRequest = viewmodel.getGroupRequest();

                viewmodelGroupRequestJavaLangObjectNull = (viewmodelGroupRequest) != (null);
                if (viewmodelGroupRequestJavaLangObjectNull) {




                    viewmodelGroupRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView13androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.groupRequest.publishDate
            //         is viewmodel.groupRequest.setPublishDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView13);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.groupRequest.publishDate
            java.lang.String viewmodelGroupRequestPublishDate = null;
            // viewmodel.groupRequest
            te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
            // viewmodel.groupRequest != null
            boolean viewmodelGroupRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelGroupRequest = viewmodel.getGroupRequest();

                viewmodelGroupRequestJavaLangObjectNull = (viewmodelGroupRequest) != (null);
                if (viewmodelGroupRequestJavaLangObjectNull) {




                    viewmodelGroupRequest.setPublishDate(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.groupRequest.description
            //         is viewmodel.groupRequest.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.groupRequest
            te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
            // viewmodel.groupRequest.description
            java.lang.String viewmodelGroupRequestDescription = null;
            // viewmodel.groupRequest != null
            boolean viewmodelGroupRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelGroupRequest = viewmodel.getGroupRequest();

                viewmodelGroupRequestJavaLangObjectNull = (viewmodelGroupRequest) != (null);
                if (viewmodelGroupRequestJavaLangObjectNull) {




                    viewmodelGroupRequest.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener noOfStudentsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.groupRequest.noOfStudents
            //         is viewmodel.groupRequest.setNoOfStudents((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(noOfStudents);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.groupRequest.noOfStudents
            java.lang.String viewmodelGroupRequestNoOfStudents = null;
            // viewmodel.groupRequest
            te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
            // viewmodel.groupRequest != null
            boolean viewmodelGroupRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelGroupRequest = viewmodel.getGroupRequest();

                viewmodelGroupRequestJavaLangObjectNull = (viewmodelGroupRequest) != (null);
                if (viewmodelGroupRequestJavaLangObjectNull) {




                    viewmodelGroupRequest.setNoOfStudents(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener noOfTasksandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.groupRequest.noOfTasks
            //         is viewmodel.groupRequest.setNoOfTasks((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(noOfTasks);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.groupRequest
            te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
            // viewmodel.groupRequest != null
            boolean viewmodelGroupRequestJavaLangObjectNull = false;
            // viewmodel.groupRequest.noOfTasks
            java.lang.String viewmodelGroupRequestNoOfTasks = null;
            // viewmodel
            te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelGroupRequest = viewmodel.getGroupRequest();

                viewmodelGroupRequestJavaLangObjectNull = (viewmodelGroupRequest) != (null);
                if (viewmodelGroupRequestJavaLangObjectNull) {




                    viewmodelGroupRequest.setNoOfTasks(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentAddGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (te.app.notta.customViews.views.IncrementalView) bindings[8]
            , (te.app.notta.customViews.views.IncrementalView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[15]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[17]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.back.setTag(null);
        this.incrementalViewStudentCount.setTag(null);
        this.incrementalViewTasksCount.setTag(null);
        this.inputDate.setTag(null);
        this.inputGroupDesc.setTag(null);
        this.inputGroupName.setTag(null);
        this.inputStudents.setTag(null);
        this.inputTasks.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView13 = (te.app.notta.customViews.views.FutureDateEditText) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.noOfStudents.setTag(null);
        this.noOfTasks.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback1 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.notta.pages.teacher.viewModels.AddGroupViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.teacher.viewModels.AddGroupViewModel Viewmodel) {
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
                return onChangeViewmodelGroupRequestDateError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelGroupRequestDescError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelGroupRequestTasksError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelGroupRequestStudentsError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelGroupRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodel((te.app.notta.pages.teacher.viewModels.AddGroupViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelGroupRequestDateError(androidx.databinding.ObservableField<java.lang.String> ViewmodelGroupRequestDateError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelGroupRequestDescError(androidx.databinding.ObservableField<java.lang.String> ViewmodelGroupRequestDescError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelGroupRequestTasksError(androidx.databinding.ObservableField<java.lang.String> ViewmodelGroupRequestTasksError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelGroupRequestStudentsError(androidx.databinding.ObservableField<java.lang.String> ViewmodelGroupRequestStudentsError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelGroupRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelGroupRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.teacher.viewModels.AddGroupViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.groupRequest) {
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
        java.lang.String viewmodelGroupRequestTasksErrorGet = null;
        java.lang.String viewmodelGroupRequestPublishDate = null;
        java.lang.String viewmodelGroupRequestDateErrorGet = null;
        java.lang.String viewmodelGroupRequestNameErrorGet = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelGroupRequestDateError = null;
        java.lang.String viewmodelGroupRequestDescErrorGet = null;
        java.lang.String viewmodelGroupRequestNoOfTasks = null;
        java.lang.String viewmodelGroupRequestName = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelGroupRequestDescError = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelGroupRequestTasksError = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        te.app.notta.pages.teacher.models.AddGroupRequest viewmodelGroupRequest = null;
        java.lang.String viewmodelGroupRequestStudentsErrorGet = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelGroupRequestNoOfStudents = null;
        java.lang.String viewmodelGroupRequestDescription = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelGroupRequestStudentsError = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelGroupRequestNameError = null;
        te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1ffL) != 0) {


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
            if ((dirtyFlags & 0x120L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onStudentTextChanged
                        viewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                        // read viewmodel::onTaskTextChanged
                        viewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl1()) : mViewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x17fL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupRequest
                        viewmodelGroupRequest = viewmodel.getGroupRequest();
                    }

                if ((dirtyFlags & 0x160L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.publishDate
                            viewmodelGroupRequestPublishDate = viewmodelGroupRequest.getPublishDate();
                            // read viewmodel.groupRequest.noOfTasks
                            viewmodelGroupRequestNoOfTasks = viewmodelGroupRequest.getNoOfTasks();
                            // read viewmodel.groupRequest.name
                            viewmodelGroupRequestName = viewmodelGroupRequest.getName();
                            // read viewmodel.groupRequest.noOfStudents
                            viewmodelGroupRequestNoOfStudents = viewmodelGroupRequest.getNoOfStudents();
                            // read viewmodel.groupRequest.description
                            viewmodelGroupRequestDescription = viewmodelGroupRequest.getDescription();
                        }
                }
                if ((dirtyFlags & 0x161L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.dateError
                            viewmodelGroupRequestDateError = viewmodelGroupRequest.dateError;
                        }
                        updateRegistration(0, viewmodelGroupRequestDateError);


                        if (viewmodelGroupRequestDateError != null) {
                            // read viewmodel.groupRequest.dateError.get()
                            viewmodelGroupRequestDateErrorGet = viewmodelGroupRequestDateError.get();
                        }
                }
                if ((dirtyFlags & 0x162L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.descError
                            viewmodelGroupRequestDescError = viewmodelGroupRequest.descError;
                        }
                        updateRegistration(1, viewmodelGroupRequestDescError);


                        if (viewmodelGroupRequestDescError != null) {
                            // read viewmodel.groupRequest.descError.get()
                            viewmodelGroupRequestDescErrorGet = viewmodelGroupRequestDescError.get();
                        }
                }
                if ((dirtyFlags & 0x164L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.tasksError
                            viewmodelGroupRequestTasksError = viewmodelGroupRequest.tasksError;
                        }
                        updateRegistration(2, viewmodelGroupRequestTasksError);


                        if (viewmodelGroupRequestTasksError != null) {
                            // read viewmodel.groupRequest.tasksError.get()
                            viewmodelGroupRequestTasksErrorGet = viewmodelGroupRequestTasksError.get();
                        }
                }
                if ((dirtyFlags & 0x168L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.studentsError
                            viewmodelGroupRequestStudentsError = viewmodelGroupRequest.studentsError;
                        }
                        updateRegistration(3, viewmodelGroupRequestStudentsError);


                        if (viewmodelGroupRequestStudentsError != null) {
                            // read viewmodel.groupRequest.studentsError.get()
                            viewmodelGroupRequestStudentsErrorGet = viewmodelGroupRequestStudentsError.get();
                        }
                }
                if ((dirtyFlags & 0x170L) != 0) {

                        if (viewmodelGroupRequest != null) {
                            // read viewmodel.groupRequest.nameError
                            viewmodelGroupRequestNameError = viewmodelGroupRequest.nameError;
                        }
                        updateRegistration(4, viewmodelGroupRequestNameError);


                        if (viewmodelGroupRequestNameError != null) {
                            // read viewmodel.groupRequest.nameError.get()
                            viewmodelGroupRequestNameErrorGet = viewmodelGroupRequestNameError.get();
                        }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
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

            this.appCompatButtonNext.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            this.back.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView13, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView13androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelGroupRequestName);
            te.app.notta.customViews.views.IncrementalView.getValue(this.incrementalViewStudentCount, viewmodelGroupRequestNoOfStudents);
            te.app.notta.customViews.views.IncrementalView.getValue(this.incrementalViewTasksCount, viewmodelGroupRequestNoOfTasks);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewmodelGroupRequestPublishDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewmodelGroupRequestDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.noOfStudents, viewmodelGroupRequestNoOfStudents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.noOfTasks, viewmodelGroupRequestNoOfTasks);
        }
        if ((dirtyFlags & 0x161L) != 0) {
            // api target 1

            this.inputDate.setError(viewmodelGroupRequestDateErrorGet);
        }
        if ((dirtyFlags & 0x162L) != 0) {
            // api target 1

            this.inputGroupDesc.setError(viewmodelGroupRequestDescErrorGet);
        }
        if ((dirtyFlags & 0x170L) != 0) {
            // api target 1

            this.inputGroupName.setError(viewmodelGroupRequestNameErrorGet);
        }
        if ((dirtyFlags & 0x168L) != 0) {
            // api target 1

            this.inputStudents.setError(viewmodelGroupRequestStudentsErrorGet);
        }
        if ((dirtyFlags & 0x164L) != 0) {
            // api target 1

            this.inputTasks.setError(viewmodelGroupRequestTasksErrorGet);
        }
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.noOfStudents, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnStudentTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, noOfStudentsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.noOfTasks, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnTaskTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, noOfTasksandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.notta.pages.teacher.viewModels.AddGroupViewModel value;
        public OnTextChangedImpl setValue(te.app.notta.pages.teacher.viewModels.AddGroupViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onStudentTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    public static class OnTextChangedImpl1 implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.notta.pages.teacher.viewModels.AddGroupViewModel value;
        public OnTextChangedImpl1 setValue(te.app.notta.pages.teacher.viewModels.AddGroupViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onTaskTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.createGroup();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.teacher.viewModels.AddGroupViewModel viewmodel = mViewmodel;



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
        flag 0 (0x1L): viewmodel.groupRequest.dateError
        flag 1 (0x2L): viewmodel.groupRequest.descError
        flag 2 (0x3L): viewmodel.groupRequest.tasksError
        flag 3 (0x4L): viewmodel.groupRequest.studentsError
        flag 4 (0x5L): viewmodel.groupRequest.nameError
        flag 5 (0x6L): viewmodel
        flag 6 (0x7L): viewmodel.groupRequest
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