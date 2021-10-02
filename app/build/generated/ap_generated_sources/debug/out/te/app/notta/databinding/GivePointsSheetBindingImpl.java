package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GivePointsSheetBindingImpl extends GivePointsSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_close, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnTextChangedImpl mViewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener noOfStudentsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addAnswerRequest.points
            //         is viewModel.addAnswerRequest.setPoints((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(noOfStudents);
            // localize variables for thread safety
            // viewModel.addAnswerRequest.points
            java.lang.String viewModelAddAnswerRequestPoints = null;
            // viewModel.addAnswerRequest
            te.app.notta.pages.addAnswer.models.AddAnswerRequest viewModelAddAnswerRequest = null;
            // viewModel.addAnswerRequest != null
            boolean viewModelAddAnswerRequestJavaLangObjectNull = false;
            // viewModel
            te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddAnswerRequest = viewModel.getAddAnswerRequest();

                viewModelAddAnswerRequestJavaLangObjectNull = (viewModelAddAnswerRequest) != (null);
                if (viewModelAddAnswerRequestJavaLangObjectNull) {




                    viewModelAddAnswerRequest.setPoints(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public GivePointsSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private GivePointsSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (te.app.notta.customViews.views.IncrementalView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.incrementalViewStudentCount.setTag(null);
        this.inputPoints.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.noOfStudents.setTag(null);
        this.progress.setTag(null);
        this.tvDesc.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddAnswerRequestPointsError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddAnswerRequestPointsError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddAnswerRequestPointsError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.taskDetailsData) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.addAnswerRequest) {
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
        java.lang.String tvHeaderAndroidStringGivePointsToConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName = null;
        boolean textUtilsIsEmptyViewModelMessage = false;
        java.lang.String viewModelMessage = null;
        boolean TextUtilsIsEmptyViewModelMessage1 = false;
        java.lang.String viewModelAddAnswerRequestPoints = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddAnswerRequestPointsError = null;
        boolean textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;
        int textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTaskDetailsDataTaskAnswerStudentName = null;
        te.app.notta.pages.addAnswer.models.TaskAnswersItem viewModelTaskDetailsDataTaskAnswer = null;
        boolean viewModelMessageEqualsConstantsSHOWPROGRESS = false;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        java.lang.String viewModelAddAnswerRequestPointsErrorGet = null;
        te.app.notta.pages.addAnswer.models.TaskDetailsData viewModelTaskDetailsData = null;
        java.lang.String tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName = null;
        te.app.notta.pages.addAnswer.models.AddAnswerRequest viewModelAddAnswerRequest = null;
        te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewModel = mViewModel;
        java.lang.String tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentNameConcatTvDescAndroidStringPointsBody2 = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.message
                        viewModelMessage = viewModel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewModel.message)
                    TextUtilsIsEmptyViewModelMessage1 = android.text.TextUtils.isEmpty(viewModelMessage);


                    // read !TextUtils.isEmpty(viewModel.message)
                    textUtilsIsEmptyViewModelMessage = !TextUtilsIsEmptyViewModelMessage1;
                if((dirtyFlags & 0x32L) != 0) {
                    if(textUtilsIsEmptyViewModelMessage) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
            if ((dirtyFlags & 0x22L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onPointsTextChanged
                        viewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewModel));
                    }
            }
            if ((dirtyFlags & 0x26L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.taskDetailsData
                        viewModelTaskDetailsData = viewModel.getTaskDetailsData();
                    }


                    if (viewModelTaskDetailsData != null) {
                        // read viewModel.taskDetailsData.taskAnswer
                        viewModelTaskDetailsDataTaskAnswer = viewModelTaskDetailsData.getTaskAnswer();
                    }


                    if (viewModelTaskDetailsDataTaskAnswer != null) {
                        // read viewModel.taskDetailsData.taskAnswer.studentName
                        viewModelTaskDetailsDataTaskAnswerStudentName = viewModelTaskDetailsDataTaskAnswer.getStudentName();
                    }


                    // read @android:string/give_points_to.concat(" ").concat(viewModel.taskDetailsData.taskAnswer.studentName)
                    tvHeaderAndroidStringGivePointsToConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName = tvHeader.getResources().getString(R.string.give_points_to).concat(" ").concat(viewModelTaskDetailsDataTaskAnswerStudentName);
                    // read @android:string/points_body1.concat(" ").concat(viewModel.taskDetailsData.taskAnswer.studentName)
                    tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName = tvDesc.getResources().getString(R.string.points_body1).concat(" ").concat(viewModelTaskDetailsDataTaskAnswerStudentName);


                    if (tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName != null) {
                        // read @android:string/points_body1.concat(" ").concat(viewModel.taskDetailsData.taskAnswer.studentName).concat(@android:string/points_body2)
                        tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentNameConcatTvDescAndroidStringPointsBody2 = tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName.concat(tvDesc.getResources().getString(R.string.points_body2));
                    }
            }
            if ((dirtyFlags & 0x2bL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addAnswerRequest
                        viewModelAddAnswerRequest = viewModel.getAddAnswerRequest();
                    }

                if ((dirtyFlags & 0x2aL) != 0) {

                        if (viewModelAddAnswerRequest != null) {
                            // read viewModel.addAnswerRequest.points
                            viewModelAddAnswerRequestPoints = viewModelAddAnswerRequest.getPoints();
                        }
                }

                    if (viewModelAddAnswerRequest != null) {
                        // read viewModel.addAnswerRequest.pointsError
                        viewModelAddAnswerRequestPointsError = viewModelAddAnswerRequest.pointsError;
                    }
                    updateRegistration(0, viewModelAddAnswerRequestPointsError);


                    if (viewModelAddAnswerRequestPointsError != null) {
                        // read viewModel.addAnswerRequest.pointsError.get()
                        viewModelAddAnswerRequestPointsErrorGet = viewModelAddAnswerRequestPointsError.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.SHOW_PROGRESS)
                    viewModelMessageEqualsConstantsSHOWPROGRESS = viewModelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x32L) != 0) {

                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((textUtilsIsEmptyViewModelMessage) ? (viewModelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x32L) != 0) {
                if(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            te.app.notta.customViews.views.IncrementalView.getValue(this.incrementalViewStudentCount, viewModelAddAnswerRequestPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.noOfStudents, viewModelAddAnswerRequestPoints);
        }
        if ((dirtyFlags & 0x2bL) != 0) {
            // api target 1

            this.inputPoints.setError(viewModelAddAnswerRequestPointsErrorGet);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.noOfStudents, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewModelOnPointsTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, noOfStudentsandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.progress.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x26L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, tvDescAndroidStringPointsBody1ConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentNameConcatTvDescAndroidStringPointsBody2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, tvHeaderAndroidStringGivePointsToConcatJavaLangStringConcatViewModelTaskDetailsDataTaskAnswerStudentName);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel value;
        public OnTextChangedImpl setValue(te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onPointsTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.addAnswerRequest.pointsError
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): viewModel.taskDetailsData
        flag 3 (0x4L): viewModel.addAnswerRequest
        flag 4 (0x5L): viewModel.message
        flag 5 (0x6L): null
        flag 6 (0x7L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 7 (0x8L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 8 (0x9L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}