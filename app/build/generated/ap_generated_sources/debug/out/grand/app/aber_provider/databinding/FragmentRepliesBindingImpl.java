package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepliesBindingImpl extends FragmentRepliesBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_scroll, 16);
        sViewsWithIds.put(R.id.post_item, 17);
        sViewsWithIds.put(R.id.item_comment, 18);
        sViewsWithIds.put(R.id.flow1, 19);
        sViewsWithIds.put(R.id.flow, 20);
        sViewsWithIds.put(R.id.send_container, 21);
        sViewsWithIds.put(R.id.br, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView11;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener inputTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.createCommentRequest.text
            //         is viewModel.createCommentRequest.setText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(inputText);
            // localize variables for thread safety
            // viewModel.createCommentRequest
            grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest viewModelCreateCommentRequest = null;
            // viewModel.createCommentRequest != null
            boolean viewModelCreateCommentRequestJavaLangObjectNull = false;
            // viewModel.createCommentRequest.text
            java.lang.String viewModelCreateCommentRequestText = null;
            // viewModel
            grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCreateCommentRequest = viewModel.getCreateCommentRequest();

                viewModelCreateCommentRequestJavaLangObjectNull = (viewModelCreateCommentRequest) != (null);
                if (viewModelCreateCommentRequestJavaLangObjectNull) {




                    viewModelCreateCommentRequest.setText(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRepliesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentRepliesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.Barrier) bindings[22]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[10]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[20]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[9]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (android.widget.ProgressBar) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            );
        this.commentImg.setTag(null);
        this.icClosePage.setTag(null);
        this.icPostPickImg.setTag(null);
        this.icSend.setTag(null);
        this.imgHomeItem.setTag(null);
        this.inputText.setTag(null);
        this.loadMore.setTag(null);
        this.mainCommentImg.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (androidx.appcompat.widget.AppCompatImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.progress.setTag(null);
        this.rcComments.setTag(null);
        this.tvDescPost.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvPostComment.setTag(null);
        this.tvPostLike.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback36 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback32 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback37 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 6);
        mCallback33 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback34 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel ViewModel) {
        updateRegistration(2, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLike((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModel((grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLike(androidx.databinding.ObservableBoolean ViewModelLike, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewModelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.mainComment) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.commentsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.fileObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.createCommentRequest) {
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
        boolean textUtilsIsEmptyViewModelMainCommentImage = false;
        java.util.List<grand.app.aber_provider.connection.FileObject> viewModelFileObject = null;
        boolean textUtilsIsEmptyViewModelMessage = false;
        java.lang.String viewModelMessage = null;
        boolean viewModelMainCommentUserJavaLangObjectNull = false;
        boolean TextUtilsIsEmptyViewModelMessage1 = false;
        int viewModelMainCommentUserJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int viewModelFileObjectSize = 0;
        boolean viewModelFileObjectSizeInt0 = false;
        boolean textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;
        int textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        boolean TextUtilsIsEmptyViewModelMainCommentImage1 = false;
        java.lang.String viewModelMainCommentImage = null;
        int textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewGONEViewVISIBLE = 0;
        grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest viewModelCreateCommentRequest = null;
        int viewModelLikeTvPostLikeAndroidColorColorPrimaryTvPostLikeAndroidColorColordark = 0;
        int textUtilsIsEmptyViewModelMainCommentImageViewVISIBLEViewGONE = 0;
        int viewModelFileObjectSizeInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewModelMainCommentUser = null;
        boolean viewModelSearchProgressVisibleGet = false;
        androidx.databinding.ObservableBoolean viewModelLike = null;
        int viewModelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        java.lang.String viewModelMainCommentCreatedAt = null;
        java.lang.String viewModelCreateCommentRequestText = null;
        java.lang.String viewModelMainCommentText = null;
        grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments viewModelMainComment = null;
        java.lang.String viewModelMainCommentUserImage = null;
        android.graphics.drawable.Drawable viewModelLikeTvPostLikeAndroidDrawableIcLikeActiveTvPostLikeAndroidDrawableIcLike = null;
        androidx.databinding.ObservableBoolean viewModelSearchProgressVisible = null;
        java.lang.String viewModelMainCommentUserName = null;
        boolean viewModelMessageEqualsConstantsSHOWPROGRESS = false;
        boolean viewModelLikeGet = false;
        grand.app.aber_provider.pages.postDetails.adapters.CommentsAdapter viewModelCommentsAdapter = null;
        grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x124L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fileObject
                        viewModelFileObject = viewModel.getFileObject();
                    }


                    if (viewModelFileObject != null) {
                        // read viewModel.fileObject.size()
                        viewModelFileObjectSize = viewModelFileObject.size();
                    }


                    // read viewModel.fileObject.size() > 0
                    viewModelFileObjectSizeInt0 = (viewModelFileObjectSize) > (0);
                if((dirtyFlags & 0x124L) != 0) {
                    if(viewModelFileObjectSizeInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read viewModel.fileObject.size() > 0 ? View.VISIBLE : View.GONE
                    viewModelFileObjectSizeInt0ViewVISIBLEViewGONE = ((viewModelFileObjectSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.message
                        viewModelMessage = viewModel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewModel.message)
                    TextUtilsIsEmptyViewModelMessage1 = android.text.TextUtils.isEmpty(viewModelMessage);


                    // read !TextUtils.isEmpty(viewModel.message)
                    textUtilsIsEmptyViewModelMessage = !TextUtilsIsEmptyViewModelMessage1;
                if((dirtyFlags & 0x184L) != 0) {
                    if(textUtilsIsEmptyViewModelMessage) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.createCommentRequest
                        viewModelCreateCommentRequest = viewModel.getCreateCommentRequest();
                    }


                    if (viewModelCreateCommentRequest != null) {
                        // read viewModel.createCommentRequest.text
                        viewModelCreateCommentRequestText = viewModelCreateCommentRequest.getText();
                    }
            }
            if ((dirtyFlags & 0x105L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.like
                        viewModelLike = viewModel.like;
                    }
                    updateRegistration(0, viewModelLike);


                    if (viewModelLike != null) {
                        // read viewModel.like.get()
                        viewModelLikeGet = viewModelLike.get();
                    }
                if((dirtyFlags & 0x105L) != 0) {
                    if(viewModelLikeGet) {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.like.get() ? @android:color/colorPrimary : @android:color/colordark
                    viewModelLikeTvPostLikeAndroidColorColorPrimaryTvPostLikeAndroidColorColordark = ((viewModelLikeGet) ? (getColorFromResource(tvPostLike, R.color.colorPrimary)) : (getColorFromResource(tvPostLike, R.color.colordark)));
                    // read viewModel.like.get() ? @android:drawable/ic_like_active : @android:drawable/ic_like
                    viewModelLikeTvPostLikeAndroidDrawableIcLikeActiveTvPostLikeAndroidDrawableIcLike = ((viewModelLikeGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvPostLike.getContext(), R.drawable.ic_like_active)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvPostLike.getContext(), R.drawable.ic_like)));
            }
            if ((dirtyFlags & 0x10cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mainComment
                        viewModelMainComment = viewModel.getMainComment();
                    }


                    if (viewModelMainComment != null) {
                        // read viewModel.mainComment.image
                        viewModelMainCommentImage = viewModelMainComment.getImage();
                        // read viewModel.mainComment.user
                        viewModelMainCommentUser = viewModelMainComment.getUser();
                        // read viewModel.mainComment.createdAt
                        viewModelMainCommentCreatedAt = viewModelMainComment.getCreatedAt();
                        // read viewModel.mainComment.text
                        viewModelMainCommentText = viewModelMainComment.getText();
                    }


                    // read TextUtils.isEmpty(viewModel.mainComment.image)
                    textUtilsIsEmptyViewModelMainCommentImage = android.text.TextUtils.isEmpty(viewModelMainCommentImage);
                    // read viewModel.mainComment.user != null
                    viewModelMainCommentUserJavaLangObjectNull = (viewModelMainCommentUser) != (null);
                if((dirtyFlags & 0x10cL) != 0) {
                    if(viewModelMainCommentUserJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                    if (viewModelMainCommentUser != null) {
                        // read viewModel.mainComment.user.image
                        viewModelMainCommentUserImage = viewModelMainCommentUser.getImage();
                        // read viewModel.mainComment.user.name
                        viewModelMainCommentUserName = viewModelMainCommentUser.getName();
                    }


                    // read !TextUtils.isEmpty(viewModel.mainComment.image)
                    TextUtilsIsEmptyViewModelMainCommentImage1 = !textUtilsIsEmptyViewModelMainCommentImage;
                    // read viewModel.mainComment.user != null ? View.VISIBLE : View.GONE
                    viewModelMainCommentUserJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelMainCommentUserJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x10cL) != 0) {
                    if(TextUtilsIsEmptyViewModelMainCommentImage1) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewModel.mainComment.image) ? View.VISIBLE : View.GONE
                    textUtilsIsEmptyViewModelMainCommentImageViewVISIBLEViewGONE = ((TextUtilsIsEmptyViewModelMainCommentImage1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x106L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchProgressVisible
                        viewModelSearchProgressVisible = viewModel.searchProgressVisible;
                    }
                    updateRegistration(1, viewModelSearchProgressVisible);


                    if (viewModelSearchProgressVisible != null) {
                        // read viewModel.searchProgressVisible.get()
                        viewModelSearchProgressVisibleGet = viewModelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x106L) != 0) {
                    if(viewModelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewModelSearchProgressVisibleViewVISIBLEViewGONE = ((viewModelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x114L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.commentsAdapter
                        viewModelCommentsAdapter = viewModel.getCommentsAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.SHOW_PROGRESS)
                    viewModelMessageEqualsConstantsSHOWPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0x184L) != 0) {

                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((textUtilsIsEmptyViewModelMessage) ? (viewModelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x184L) != 0) {
                if(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }


                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.GONE : View.VISIBLE
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewGONEViewVISIBLE = ((textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            this.commentImg.setVisibility(viewModelFileObjectSizeInt0ViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(viewModelFileObjectSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.icClosePage, viewModelMainCommentCreatedAt);
            grand.app.aber_provider.base.ApplicationBinding.loadMarketImage(this.imgHomeItem, viewModelMainCommentUserImage);
            this.mainCommentImg.setVisibility(textUtilsIsEmptyViewModelMainCommentImageViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.loadCommentImage(this.mainCommentImg, viewModelMainCommentImage);
            this.mboundView0.setVisibility(viewModelMainCommentUserJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescPost, viewModelMainCommentText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelMainCommentUserName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.icPostPickImg.setOnClickListener(mCallback36);
            this.icSend.setOnClickListener(mCallback37);
            this.imgHomeItem.setOnClickListener(mCallback32);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputTextandroidTextAttrChanged);
            this.mboundView11.setOnClickListener(mCallback35);
            this.tvPostComment.setOnClickListener(mCallback34);
            this.tvPostLike.setOnClickListener(mCallback33);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.icSend.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewGONEViewVISIBLE);
            this.progress.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputText, viewModelCreateCommentRequestText);
        }
        if ((dirtyFlags & 0x106L) != 0) {
            // api target 1

            this.loadMore.setVisibility(viewModelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x114L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcComments, viewModelCommentsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableStart(this.tvPostLike, viewModelLikeTvPostLikeAndroidDrawableIcLikeActiveTvPostLikeAndroidDrawableIcLike);
            this.tvPostLike.setTextColor(viewModelLikeTvPostLikeAndroidColorColorPrimaryTvPostLikeAndroidColorColordark);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.REMOVE_IMAGE);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.IMAGE);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.PROFILE);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.createComment();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.LIKE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.MAKE_COMMENT);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.like
        flag 1 (0x2L): viewModel.searchProgressVisible
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): viewModel.mainComment
        flag 4 (0x5L): viewModel.commentsAdapter
        flag 5 (0x6L): viewModel.fileObject
        flag 6 (0x7L): viewModel.createCommentRequest
        flag 7 (0x8L): viewModel.message
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.mainComment.user != null ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.mainComment.user != null ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 12 (0xdL): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 13 (0xeL): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.GONE : View.VISIBLE
        flag 16 (0x11L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.GONE : View.VISIBLE
        flag 17 (0x12L): viewModel.like.get() ? @android:color/colorPrimary : @android:color/colordark
        flag 18 (0x13L): viewModel.like.get() ? @android:color/colorPrimary : @android:color/colordark
        flag 19 (0x14L): !TextUtils.isEmpty(viewModel.mainComment.image) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): !TextUtils.isEmpty(viewModel.mainComment.image) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.fileObject.size() > 0 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.fileObject.size() > 0 ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.like.get() ? @android:drawable/ic_like_active : @android:drawable/ic_like
        flag 26 (0x1bL): viewModel.like.get() ? @android:drawable/ic_like_active : @android:drawable/ic_like
    flag mapping end*/
    //end
}