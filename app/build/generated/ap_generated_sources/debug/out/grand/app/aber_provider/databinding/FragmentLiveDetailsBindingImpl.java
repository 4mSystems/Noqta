package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLiveDetailsBindingImpl extends FragmentLiveDetailsBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.post_item, 13);
        sViewsWithIds.put(R.id.flow, 14);
        sViewsWithIds.put(R.id.br2, 15);
        sViewsWithIds.put(R.id.v_div, 16);
        sViewsWithIds.put(R.id.tv_live_details, 17);
        sViewsWithIds.put(R.id.tv_live_date_text, 18);
        sViewsWithIds.put(R.id.tv_instructor_name_text, 19);
        sViewsWithIds.put(R.id.tv_live_title_text, 20);
        sViewsWithIds.put(R.id.tv_live_cost_text, 21);
        sViewsWithIds.put(R.id.btn_phone, 22);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView12;
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

    public FragmentLiveDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentLiveDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[22]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[21]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[18]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[20]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            , (android.view.View) bindings[16]
            );
        this.icClosePage.setTag(null);
        this.imgHomeItem.setTag(null);
        this.imgLive.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (androidx.appcompat.widget.AppCompatImageView) bindings[12];
        this.mboundView12.setTag(null);
        this.tvDesc.setTag(null);
        this.tvDescPost.setTag(null);
        this.tvHomeItem.setTag(null);
        this.tvInstructorName.setTag(null);
        this.tvLiveCost.setTag(null);
        this.tvLiveDate.setTag(null);
        this.tvLiveTitle.setTag(null);
        this.tvTitlePost.setTag(null);
        setRootTag(root);
        // listeners
        mCallback56 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback57 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback58 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.postData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String viewModelPostDataFile = null;
        int viewModelUserDataId = 0;
        java.lang.String viewModelPostDataUserName = null;
        boolean viewModelUserDataIdViewModelPostDataUserId = false;
        java.lang.String viewModelPostDataLiveTime = null;
        int viewModelPostDataUserJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPostDataLecturerName = null;
        java.lang.String viewModelPostDataUserImage = null;
        java.lang.String viewModelPostDataTitle = null;
        java.lang.String viewModelPostDataContent = null;
        grand.app.aber_provider.pages.home.models.PostData viewModelPostData = null;
        boolean viewModelPostDataUserJavaLangObjectNull = false;
        java.lang.String viewModelPostDataCost = null;
        int viewModelUserDataIdViewModelPostDataUserIdViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewModelUserData = null;
        int viewModelPostDataUserId = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewModelPostDataUser = null;
        grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel viewModel = mViewModel;
        java.lang.String viewModelPostDataUserJob = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.postData
                    viewModelPostData = viewModel.getPostData();
                    // read viewModel.userData
                    viewModelUserData = viewModel.userData;
                }


                if (viewModelPostData != null) {
                    // read viewModel.postData.file
                    viewModelPostDataFile = viewModelPostData.getFile();
                    // read viewModel.postData.liveTime
                    viewModelPostDataLiveTime = viewModelPostData.getLiveTime();
                    // read viewModel.postData.lecturerName
                    viewModelPostDataLecturerName = viewModelPostData.getLecturerName();
                    // read viewModel.postData.title
                    viewModelPostDataTitle = viewModelPostData.getTitle();
                    // read viewModel.postData.content
                    viewModelPostDataContent = viewModelPostData.getContent();
                    // read viewModel.postData.cost
                    viewModelPostDataCost = viewModelPostData.getCost();
                    // read viewModel.postData.user
                    viewModelPostDataUser = viewModelPostData.getUser();
                }
                if (viewModelUserData != null) {
                    // read viewModel.userData.id
                    viewModelUserDataId = viewModelUserData.getId();
                }


                if (viewModelPostDataUser != null) {
                    // read viewModel.postData.user.name
                    viewModelPostDataUserName = viewModelPostDataUser.getName();
                    // read viewModel.postData.user.image
                    viewModelPostDataUserImage = viewModelPostDataUser.getImage();
                    // read viewModel.postData.user.id
                    viewModelPostDataUserId = viewModelPostDataUser.getId();
                    // read viewModel.postData.user.job
                    viewModelPostDataUserJob = viewModelPostDataUser.getJob();
                }
                // read viewModel.postData.user != null
                viewModelPostDataUserJavaLangObjectNull = (viewModelPostDataUser) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelPostDataUserJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.userData.id == viewModel.postData.user.id
                viewModelUserDataIdViewModelPostDataUserId = (viewModelUserDataId) == (viewModelPostDataUserId);
                // read viewModel.postData.user != null ? View.VISIBLE : View.GONE
                viewModelPostDataUserJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelPostDataUserJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelUserDataIdViewModelPostDataUserId) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewModel.userData.id == viewModel.postData.user.id ? View.VISIBLE : View.GONE
                viewModelUserDataIdViewModelPostDataUserIdViewVISIBLEViewGONE = ((viewModelUserDataIdViewModelPostDataUserId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icClosePage.setOnClickListener(mCallback57);
            this.imgHomeItem.setOnClickListener(mCallback56);
            this.mboundView12.setOnClickListener(mCallback58);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.icClosePage.setVisibility(viewModelUserDataIdViewModelPostDataUserIdViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.loadMarketImage(this.imgHomeItem, viewModelPostDataUserImage);
            grand.app.aber_provider.base.ApplicationBinding.loadCommentImage(this.imgLive, viewModelPostDataFile);
            this.mboundView0.setVisibility(viewModelPostDataUserJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, viewModelPostDataUserJob);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescPost, viewModelPostDataContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeItem, viewModelPostDataUserName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstructorName, viewModelPostDataLecturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLiveCost, viewModelPostDataCost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLiveDate, viewModelPostDataLiveTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLiveTitle, viewModelPostDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitlePost, viewModelPostDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.PROFILE);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.OPTIONS);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonAction(grand.app.aber_provider.utils.Constants.PLAY_VIDEO);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.postData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.postData.user != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.postData.user != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.userData.id == viewModel.postData.user.id ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.userData.id == viewModel.postData.user.id ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}