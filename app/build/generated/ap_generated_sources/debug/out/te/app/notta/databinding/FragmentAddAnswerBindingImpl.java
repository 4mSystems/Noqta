package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddAnswerBindingImpl extends FragmentAddAnswerBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 18);
        sViewsWithIds.put(R.id.tv_tasks, 19);
        sViewsWithIds.put(R.id.MaterialCardView, 20);
        sViewsWithIds.put(R.id.br4, 21);
        sViewsWithIds.put(R.id.v_line4, 22);
        sViewsWithIds.put(R.id.tv_answer, 23);
        sViewsWithIds.put(R.id.input_answer, 24);
        sViewsWithIds.put(R.id.ic_cloud_upload_video, 25);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final te.app.notta.customViews.views.CustomTextViewRegular mboundView12;
    @NonNull
    private final te.app.notta.customViews.views.CustomTextViewRegular mboundView13;
    @NonNull
    private final te.app.notta.customViews.views.CustomTextViewMedium mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addAnswerRequest.answerText
            //         is viewmodel.addAnswerRequest.setAnswerText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel.addAnswerRequest.answerText
            java.lang.String viewmodelAddAnswerRequestAnswerText = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addAnswerRequest
            te.app.notta.pages.addAnswer.models.AddAnswerRequest viewmodelAddAnswerRequest = null;
            // viewmodel.addAnswerRequest != null
            boolean viewmodelAddAnswerRequestJavaLangObjectNull = false;
            // viewmodel
            te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddAnswerRequest = viewmodel.getAddAnswerRequest();

                viewmodelAddAnswerRequestJavaLangObjectNull = (viewmodelAddAnswerRequest) != (null);
                if (viewmodelAddAnswerRequestJavaLangObjectNull) {




                    viewmodelAddAnswerRequest.setAnswerText(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddAnswerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentAddAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[20]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.constraintlayout.widget.Barrier) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[6]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[23]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[19]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[14]
            , (android.view.View) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            );
        this.appCompatButtonNext.setTag(null);
        this.back.setTag(null);
        this.icCloudUpload.setTag(null);
        this.imagesContainer.setTag(null);
        this.mainImage.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (te.app.notta.customViews.views.CustomTextViewRegular) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (te.app.notta.customViews.views.CustomTextViewRegular) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView3 = (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        this.rcTaskMedia.setTag(null);
        this.tvDate.setTag(null);
        this.tvDetails.setTag(null);
        this.tvImages.setTag(null);
        this.tvProfileTitle.setTag(null);
        this.tvVideo.setTag(null);
        this.videoContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback71 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback74 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback75 = new te.app.notta.generated.callback.OnClickListener(this, 5);
        mCallback72 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback73 = new te.app.notta.generated.callback.OnClickListener(this, 3);
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
            setViewmodel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.taskDetailsData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.taskMediaAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.addAnswerRequest) {
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
        te.app.notta.pages.addAnswer.models.TaskDetailsData viewmodelTaskDetailsData = null;
        boolean viewmodelSelectedUriSizeInt0 = false;
        java.util.List<android.net.Uri> viewmodelSelectedUri = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelPassingObjectObject = null;
        java.lang.String viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangString = null;
        java.lang.String viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswer = null;
        te.app.notta.pages.addAnswer.adapters.TaskMediaAdapter viewmodelTaskMediaAdapter = null;
        int viewmodelTaskDetailsDataCreatedAtJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int viewmodelTaskMediaAdapterItemCountInt0ViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        int viewmodelTaskMediaAdapterItemCount = 0;
        java.lang.String viewmodelPassingObjectObjectEqualsConstantsAddANSWERAppCompatButtonNextAndroidStringSendAnswerAppCompatButtonNextAndroidStringGivePoints = null;
        java.lang.String viewmodelTaskDetailsDataDescription = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNull = false;
        java.lang.String stringValueOfViewmodelTaskDetailsDataId = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        int viewmodelSelectedUriSize = 0;
        boolean viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS = false;
        boolean viewmodelTaskMediaAdapterItemCountInt0 = false;
        te.app.notta.pages.addAnswer.models.AddAnswerRequest viewmodelAddAnswerRequest = null;
        int viewmodelTaskDetailsDataId = 0;
        te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;
        boolean viewmodelTaskDetailsDataCreatedAtJavaLangObjectNull = false;
        te.app.notta.PassingObject viewmodelPassingObject = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        boolean viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSBooleanFalseBooleanTrue = false;
        java.lang.String viewmodelTaskMediaAdapterFilesItemListGetInt0File = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangString = null;
        te.app.notta.pages.addAnswer.models.TaskFilesItem viewmodelTaskMediaAdapterFilesItemListGetInt0 = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.util.List<te.app.notta.pages.addAnswer.models.TaskFilesItem> viewmodelTaskMediaAdapterFilesItemList = null;
        int viewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE = 0;
        int ViewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE1 = 0;
        java.lang.String viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangStringTvProfileTitleAndroidStringAddAnswer = null;
        te.app.notta.pages.addAnswer.models.TaskAnswersItem viewmodelTaskDetailsDataTaskAnswer = null;
        java.lang.String viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString = null;
        java.lang.String viewmodelTaskDetailsDataCreatedAt = null;
        java.lang.String viewmodelAddAnswerRequestAnswerText = null;
        boolean viewmodelPassingObjectObjectEqualsConstantsAddANSWER = false;
        boolean ViewmodelSelectedUriSizeInt01 = false;
        java.lang.String viewmodelTaskDetailsDataTaskAnswerStudentName = null;
        int viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE = 0;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x43L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.taskDetailsData
                        viewmodelTaskDetailsData = viewmodel.getTaskDetailsData();
                    }


                    if (viewmodelTaskDetailsData != null) {
                        // read viewmodel.taskDetailsData.description
                        viewmodelTaskDetailsDataDescription = viewmodelTaskDetailsData.getDescription();
                        // read viewmodel.taskDetailsData.id
                        viewmodelTaskDetailsDataId = viewmodelTaskDetailsData.getId();
                        // read viewmodel.taskDetailsData.createdAt
                        viewmodelTaskDetailsDataCreatedAt = viewmodelTaskDetailsData.getCreatedAt();
                    }


                    // read String.valueOf(viewmodel.taskDetailsData.id)
                    stringValueOfViewmodelTaskDetailsDataId = java.lang.String.valueOf(viewmodelTaskDetailsDataId);
                    // read viewmodel.taskDetailsData.createdAt != null
                    viewmodelTaskDetailsDataCreatedAtJavaLangObjectNull = (viewmodelTaskDetailsDataCreatedAt) != (null);
                if((dirtyFlags & 0x43L) != 0) {
                    if(viewmodelTaskDetailsDataCreatedAtJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewmodel.taskDetailsData.createdAt != null ? View.VISIBLE : View.GONE
                    viewmodelTaskDetailsDataCreatedAtJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelTaskDetailsDataCreatedAtJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x41L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.selectedUri
                        viewmodelSelectedUri = viewmodel.getSelectedUri();
                    }


                    if (viewmodelSelectedUri != null) {
                        // read viewmodel.selectedUri.size()
                        viewmodelSelectedUriSize = viewmodelSelectedUri.size();
                    }


                    // read viewmodel.selectedUri.size() > 0
                    viewmodelSelectedUriSizeInt0 = (viewmodelSelectedUriSize) > (0);
                    // read viewmodel.selectedUri.size() == 0
                    ViewmodelSelectedUriSizeInt01 = (viewmodelSelectedUriSize) == (0);
                if((dirtyFlags & 0x41L) != 0) {
                    if(viewmodelSelectedUriSizeInt0) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x41L) != 0) {
                    if(ViewmodelSelectedUriSizeInt01) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read viewmodel.selectedUri.size() > 0 ? View.VISIBLE : View.GONE
                    viewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE = ((viewmodelSelectedUriSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.selectedUri.size() == 0 ? View.VISIBLE : View.GONE
                    ViewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE1 = ((ViewmodelSelectedUriSizeInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x61L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x61L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x49L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.taskMediaAdapter
                        viewmodelTaskMediaAdapter = viewmodel.getTaskMediaAdapter();
                    }


                    if (viewmodelTaskMediaAdapter != null) {
                        // read viewmodel.taskMediaAdapter.itemCount
                        viewmodelTaskMediaAdapterItemCount = viewmodelTaskMediaAdapter.getItemCount();
                    }


                    // read viewmodel.taskMediaAdapter.itemCount > 0
                    viewmodelTaskMediaAdapterItemCountInt0 = (viewmodelTaskMediaAdapterItemCount) > (0);
                if((dirtyFlags & 0x49L) != 0) {
                    if(viewmodelTaskMediaAdapterItemCountInt0) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read viewmodel.taskMediaAdapter.itemCount > 0 ? View.VISIBLE : View.GONE
                    viewmodelTaskMediaAdapterItemCountInt0ViewVISIBLEViewGONE = ((viewmodelTaskMediaAdapterItemCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x51L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addAnswerRequest
                        viewmodelAddAnswerRequest = viewmodel.getAddAnswerRequest();
                    }


                    if (viewmodelAddAnswerRequest != null) {
                        // read viewmodel.addAnswerRequest.answerText
                        viewmodelAddAnswerRequestAnswerText = viewmodelAddAnswerRequest.getAnswerText();
                    }
            }
            if ((dirtyFlags & 0x47L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.object
                        viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                    }


                    if (viewmodelPassingObjectObject != null) {
                        // read viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS)
                        viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS = viewmodelPassingObjectObject.equals(te.app.notta.utils.Constants.SHOW_ANSWERS);
                    }
                if((dirtyFlags & 0x45L) != 0) {
                    if(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS) {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x200000000L;
                    }
                }
                if((dirtyFlags & 0x47L) != 0) {
                    if(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x45L) != 0) {

                        // read viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? false : true
                        viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSBooleanFalseBooleanTrue = ((viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS) ? (false) : (true));
                        // read viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? View.GONE : View.VISIBLE
                        viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE = ((viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
                if ((dirtyFlags & 0x45L) != 0) {

                        if (viewmodelPassingObjectObject != null) {
                            // read viewmodel.passingObject.object.equals(Constants.Add_ANSWER)
                            viewmodelPassingObjectObjectEqualsConstantsAddANSWER = viewmodelPassingObjectObject.equals(te.app.notta.utils.Constants.Add_ANSWER);
                        }
                    if((dirtyFlags & 0x45L) != 0) {
                        if(viewmodelPassingObjectObjectEqualsConstantsAddANSWER) {
                                dirtyFlags |= 0x10000L;
                        }
                        else {
                                dirtyFlags |= 0x8000L;
                        }
                    }


                        // read viewmodel.passingObject.object.equals(Constants.Add_ANSWER) ? @android:string/send_answer : @android:string/give_points
                        viewmodelPassingObjectObjectEqualsConstantsAddANSWERAppCompatButtonNextAndroidStringSendAnswerAppCompatButtonNextAndroidStringGivePoints = ((viewmodelPassingObjectObjectEqualsConstantsAddANSWER) ? (appCompatButtonNext.getResources().getString(R.string.send_answer)) : (appCompatButtonNext.getResources().getString(R.string.give_points)));
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x40000000L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.taskDetailsData
                    viewmodelTaskDetailsData = viewmodel.getTaskDetailsData();
                }


                if (viewmodelTaskDetailsData != null) {
                    // read viewmodel.taskDetailsData.taskAnswer
                    viewmodelTaskDetailsDataTaskAnswer = viewmodelTaskDetailsData.getTaskAnswer();
                }


                // read viewmodel.taskDetailsData.taskAnswer != null
                viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNull = (viewmodelTaskDetailsDataTaskAnswer) != (null);
            if((dirtyFlags & 0x40000000L) != 0) {
                if(viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x100000000L) != 0) {

                if (viewmodelTaskMediaAdapter != null) {
                    // read viewmodel.taskMediaAdapter.filesItemList
                    viewmodelTaskMediaAdapterFilesItemList = viewmodelTaskMediaAdapter.getFilesItemList();
                }


                if (viewmodelTaskMediaAdapterFilesItemList != null) {
                    // read viewmodel.taskMediaAdapter.filesItemList.get(0)
                    viewmodelTaskMediaAdapterFilesItemListGetInt0 = viewmodelTaskMediaAdapterFilesItemList.get(0);
                }


                if (viewmodelTaskMediaAdapterFilesItemListGetInt0 != null) {
                    // read viewmodel.taskMediaAdapter.filesItemList.get(0).file
                    viewmodelTaskMediaAdapterFilesItemListGetInt0File = viewmodelTaskMediaAdapterFilesItemListGetInt0.getFile();
                }
        }

        if ((dirtyFlags & 0x61L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x61L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x800000L;
                }
            }
            if((dirtyFlags & 0x61L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_primary_medium)));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x49L) != 0) {

                // read viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
                viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString = ((viewmodelTaskMediaAdapterItemCountInt0) ? (viewmodelTaskMediaAdapterFilesItemListGetInt0File) : (""));
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (viewmodelTaskDetailsDataTaskAnswer != null) {
                    // read viewmodel.taskDetailsData.taskAnswer.studentName
                    viewmodelTaskDetailsDataTaskAnswerStudentName = viewmodelTaskDetailsDataTaskAnswer.getStudentName();
                }


                if (viewmodelTaskDetailsDataTaskAnswerStudentName != null) {
                    // read viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ")
                    viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangString = viewmodelTaskDetailsDataTaskAnswerStudentName.concat(" ");
                }


                if (viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangString != null) {
                    // read viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer)
                    viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswer = viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangString.concat(tvProfileTitle.getResources().getString(R.string.answer));
                }
        }

        if ((dirtyFlags & 0x40000000L) != 0) {

                // read viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : ""
                viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangString = ((viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNull) ? (viewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswer) : (""));
        }

        if ((dirtyFlags & 0x47L) != 0) {

                // read viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : "" : @android:string/add_answer
                viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangStringTvProfileTitleAndroidStringAddAnswer = ((viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERS) ? (viewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangString) : (tvProfileTitle.getResources().getString(R.string.add_answer)));
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback75);
            this.back.setOnClickListener(mCallback71);
            this.icCloudUpload.setOnClickListener(mCallback72);
            this.mboundView12.setOnClickListener(mCallback73);
            this.mboundView13.setOnClickListener(mCallback74);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appCompatButtonNext, viewmodelPassingObjectObjectEqualsConstantsAddANSWERAppCompatButtonNextAndroidStringSendAnswerAppCompatButtonNextAndroidStringGivePoints);
            this.imagesContainer.setVisibility(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE);
            this.mboundView8.setEnabled(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSBooleanFalseBooleanTrue);
            this.tvImages.setVisibility(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE);
            this.tvVideo.setVisibility(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE);
            this.videoContainer.setVisibility(viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            this.mainImage.setVisibility(viewmodelTaskMediaAdapterItemCountInt0ViewVISIBLEViewGONE);
            te.app.notta.base.ApplicationBinding.loadFullImage(this.mainImage, viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString);
            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.rcTaskMedia, viewmodelTaskMediaAdapter, "1", "2");
        }
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(viewmodelTaskDetailsDataCreatedAtJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringValueOfViewmodelTaskDetailsDataId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewmodelTaskDetailsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetails, viewmodelTaskDetailsDataDescription);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(ViewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE1);
            this.mboundView13.setVisibility(viewmodelSelectedUriSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelAddAnswerRequestAnswerText);
        }
        if ((dirtyFlags & 0x47L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileTitle, viewmodelPassingObjectObjectEqualsConstantsSHOWANSWERSViewmodelTaskDetailsDataTaskAnswerJavaLangObjectNullViewmodelTaskDetailsDataTaskAnswerStudentNameConcatJavaLangStringConcatTvProfileTitleAndroidStringAnswerJavaLangStringTvProfileTitleAndroidStringAddAnswer);
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
                te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



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
                te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.answerTask();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



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
                te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.IMAGE);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.taskDetailsData
        flag 2 (0x3L): viewmodel.passingObject
        flag 3 (0x4L): viewmodel.taskMediaAdapter
        flag 4 (0x5L): viewmodel.addAnswerRequest
        flag 5 (0x6L): viewmodel.message
        flag 6 (0x7L): null
        flag 7 (0x8L): viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : ""
        flag 8 (0x9L): viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : ""
        flag 9 (0xaL): viewmodel.taskDetailsData.createdAt != null ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.taskDetailsData.createdAt != null ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.taskMediaAdapter.itemCount > 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.taskMediaAdapter.itemCount > 0 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 15 (0x10L): viewmodel.passingObject.object.equals(Constants.Add_ANSWER) ? @android:string/send_answer : @android:string/give_points
        flag 16 (0x11L): viewmodel.passingObject.object.equals(Constants.Add_ANSWER) ? @android:string/send_answer : @android:string/give_points
        flag 17 (0x12L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 18 (0x13L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? false : true
        flag 22 (0x17L): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? false : true
        flag 23 (0x18L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 24 (0x19L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 25 (0x1aL): viewmodel.selectedUri.size() > 0 ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewmodel.selectedUri.size() > 0 ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewmodel.selectedUri.size() == 0 ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewmodel.selectedUri.size() == 0 ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : "" : @android:string/add_answer
        flag 30 (0x1fL): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? viewmodel.taskDetailsData.taskAnswer != null ? viewmodel.taskDetailsData.taskAnswer.studentName.concat(" ").concat(@android:string/answer) : "" : @android:string/add_answer
        flag 31 (0x20L): viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
        flag 32 (0x21L): viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
        flag 33 (0x22L): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): viewmodel.passingObject.object.equals(Constants.SHOW_ANSWERS) ? View.GONE : View.VISIBLE
        flag 35 (0x24L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 36 (0x25L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}