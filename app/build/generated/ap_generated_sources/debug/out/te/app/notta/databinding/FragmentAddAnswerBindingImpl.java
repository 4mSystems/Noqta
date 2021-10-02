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
        sViewsWithIds.put(R.id.board_header, 11);
        sViewsWithIds.put(R.id.tv_profile_title, 12);
        sViewsWithIds.put(R.id.tv_tasks, 13);
        sViewsWithIds.put(R.id.MaterialCardView, 14);
        sViewsWithIds.put(R.id.br4, 15);
        sViewsWithIds.put(R.id.v_line4, 16);
        sViewsWithIds.put(R.id.tv_answer, 17);
        sViewsWithIds.put(R.id.input_answer, 18);
        sViewsWithIds.put(R.id.tv_images, 19);
        sViewsWithIds.put(R.id.images_container, 20);
        sViewsWithIds.put(R.id.tv_video, 21);
        sViewsWithIds.put(R.id.video_container, 22);
        sViewsWithIds.put(R.id.ic_cloud_upload_video, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final te.app.notta.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addAnswerRequest.answerText
            //         is viewmodel.addAnswerRequest.setAnswerText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentAddAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[19]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[21]
            , (android.view.View) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            );
        this.appCompatButtonNext.setTag(null);
        this.back.setTag(null);
        this.icCloudUpload.setTag(null);
        this.mainImage.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.progress.setTag(null);
        this.rcTaskMedia.setTag(null);
        this.tvDate.setTag(null);
        this.tvDetails.setTag(null);
        setRootTag(root);
        // listeners
        mCallback56 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback57 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback58 = new te.app.notta.generated.callback.OnClickListener(this, 3);
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
        else if (fieldId == BR.taskMediaAdapter) {
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
        te.app.notta.pages.addAnswer.models.TaskDetailsData viewmodelTaskDetailsData = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelTaskMediaAdapterFilesItemListGetInt0File = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        te.app.notta.pages.addAnswer.models.TaskFilesItem viewmodelTaskMediaAdapterFilesItemListGetInt0 = null;
        te.app.notta.pages.addAnswer.adapters.TaskMediaAdapter viewmodelTaskMediaAdapter = null;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.util.List<te.app.notta.pages.addAnswer.models.TaskFilesItem> viewmodelTaskMediaAdapterFilesItemList = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        int viewmodelTaskMediaAdapterItemCount = 0;
        java.lang.String viewmodelTaskDetailsDataDescription = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        int viewmodelTaskMediaAdapterItemCountInt0ViewINVISIBLEViewGONE = 0;
        java.lang.String stringValueOfViewmodelTaskDetailsDataId = null;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        java.lang.String viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelTaskDetailsDataCreatedAt = null;
        java.lang.String viewmodelAddAnswerRequestAnswerText = null;
        boolean viewmodelTaskMediaAdapterItemCountInt0 = false;
        te.app.notta.pages.addAnswer.models.AddAnswerRequest viewmodelAddAnswerRequest = null;
        int viewmodelTaskDetailsDataId = 0;
        te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.taskDetailsData
                        viewmodelTaskDetailsData = viewmodel.getTaskDetailsData();
                    }


                    if (viewmodelTaskDetailsData != null) {
                        // read viewmodel.taskDetailsData.description
                        viewmodelTaskDetailsDataDescription = viewmodelTaskDetailsData.getDescription();
                        // read viewmodel.taskDetailsData.createdAt
                        viewmodelTaskDetailsDataCreatedAt = viewmodelTaskDetailsData.getCreatedAt();
                        // read viewmodel.taskDetailsData.id
                        viewmodelTaskDetailsDataId = viewmodelTaskDetailsData.getId();
                    }


                    // read String.valueOf(viewmodel.taskDetailsData.id)
                    stringValueOfViewmodelTaskDetailsDataId = java.lang.String.valueOf(viewmodelTaskDetailsDataId);
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0x31L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x31L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
            if ((dirtyFlags & 0x25L) != 0) {

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
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelTaskMediaAdapterItemCountInt0) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewmodel.taskMediaAdapter.itemCount > 0 ? View.INVISIBLE : View.GONE
                    viewmodelTaskMediaAdapterItemCountInt0ViewINVISIBLEViewGONE = ((viewmodelTaskMediaAdapterItemCountInt0) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addAnswerRequest
                        viewmodelAddAnswerRequest = viewmodel.getAddAnswerRequest();
                    }


                    if (viewmodelAddAnswerRequest != null) {
                        // read viewmodel.addAnswerRequest.answerText
                        viewmodelAddAnswerRequestAnswerText = viewmodelAddAnswerRequest.getAnswerText();
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
        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.notta.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x31L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x31L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x31L) != 0) {
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
        if ((dirtyFlags & 0x25L) != 0) {

                // read viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
                viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString = ((viewmodelTaskMediaAdapterItemCountInt0) ? (viewmodelTaskMediaAdapterFilesItemListGetInt0File) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewGradientAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback58);
            this.back.setOnClickListener(mCallback56);
            this.icCloudUpload.setOnClickListener(mCallback57);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.mainImage.setVisibility(viewmodelTaskMediaAdapterItemCountInt0ViewINVISIBLEViewGONE);
            te.app.notta.base.ApplicationBinding.loadFullImage(this.mainImage, viewmodelTaskMediaAdapterItemCountInt0ViewmodelTaskMediaAdapterFilesItemListGetInt0FileJavaLangString);
            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.rcTaskMedia, viewmodelTaskMediaAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringValueOfViewmodelTaskDetailsDataId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewmodelTaskDetailsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetails, viewmodelTaskDetailsDataDescription);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewmodelAddAnswerRequestAnswerText);
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


                    viewmodel.answerTask();
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
        flag 2 (0x3L): viewmodel.taskMediaAdapter
        flag 3 (0x4L): viewmodel.addAnswerRequest
        flag 4 (0x5L): viewmodel.message
        flag 5 (0x6L): null
        flag 6 (0x7L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 7 (0x8L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 8 (0x9L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 9 (0xaL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 10 (0xbL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 11 (0xcL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 12 (0xdL): viewmodel.taskMediaAdapter.itemCount > 0 ? View.INVISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.taskMediaAdapter.itemCount > 0 ? View.INVISIBLE : View.GONE
        flag 14 (0xfL): viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
        flag 15 (0x10L): viewmodel.taskMediaAdapter.itemCount > 0 ? viewmodel.taskMediaAdapter.filesItemList.get(0).file : ""
        flag 16 (0x11L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 19 (0x14L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}