package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReactionsBindingImpl extends FragmentReactionsBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_reacts_people, 6);
        sViewsWithIds.put(R.id.v_reacts, 7);
        sViewsWithIds.put(R.id.br_reacts, 8);
        sViewsWithIds.put(R.id.v1, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReactionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentReactionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[1]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[7]
            );
        this.all.setTag(null);
        this.likes.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recPeople.setTag(null);
        this.tvPostDislike.setTag(null);
        this.tvReactsPeopleValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback40 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        mCallback38 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setViewModel((grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.reactType) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.followersResponse) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.followersAdapter) {
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
        android.graphics.drawable.Drawable viewModelFollowersResponseIsLikedLikesAndroidDrawableIcLikeActiveLikesAndroidDrawableIcLike = null;
        boolean viewModelReactTypeEqualsConstantsLIKESREACTION = false;
        java.lang.String viewModelPassingObjectObject = null;
        boolean textUtilsIsEmptyViewModelFollowersResponseLikes = false;
        grand.app.aber_provider.pages.profile.adapters.FollowersAdapter viewModelFollowersAdapter = null;
        boolean viewModelFollowersResponseIsLiked = false;
        android.graphics.drawable.Drawable viewModelFollowersResponseIsDisLikedTvPostDislikeAndroidDrawableIcDislikeActiveTvPostDislikeAndroidDrawableIcDislike = null;
        java.lang.String textUtilsIsEmptyViewModelFollowersResponseDislikesViewModelFollowersResponseDislikesJavaLangString = null;
        java.lang.String viewModelFollowersResponseDislikes = null;
        boolean textUtilsIsEmptyViewModelFollowersResponseDislikes = false;
        int viewModelReactTypeEqualsConstantsALLREACTIONSAllAndroidColorChatOptionsAllAndroidColorWhite = 0;
        java.lang.String viewModelFollowersResponseLikes = null;
        java.lang.String textUtilsIsEmptyViewModelFollowersResponseLikesViewModelFollowersResponseLikesJavaLangString = null;
        boolean viewModelReactTypeEqualsConstantsDISLIKESREACTIONS = false;
        java.lang.String viewModelReactType = null;
        grand.app.aber_provider.PassingObject viewModelPassingObject = null;
        java.lang.String viewModelFollowersResponseAllReacts = null;
        boolean viewModelFollowersResponseIsDisLiked = false;
        int viewModelReactTypeEqualsConstantsDISLIKESREACTIONSTvPostDislikeAndroidColorChatOptionsTvPostDislikeAndroidColorWhite = 0;
        boolean viewModelReactTypeEqualsConstantsALLREACTIONS = false;
        boolean textUtilsIsEmptyViewModelFollowersResponseAllReacts = false;
        grand.app.aber_provider.pages.postDetails.models.postReacts.ReactsData viewModelFollowersResponse = null;
        boolean TextUtilsIsEmptyViewModelFollowersResponseLikes1 = false;
        java.lang.String allAndroidStringFloorConcatJavaLangStringConcatTextUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString = null;
        int viewModelReactTypeEqualsConstantsLIKESREACTIONLikesAndroidColorChatOptionsLikesAndroidColorWhite = 0;
        java.lang.String textUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString = null;
        boolean TextUtilsIsEmptyViewModelFollowersResponseAllReacts1 = false;
        boolean TextUtilsIsEmptyViewModelFollowersResponseDislikes1 = false;
        grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.followersAdapter
                        viewModelFollowersAdapter = viewModel.getFollowersAdapter();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.reactType
                        viewModelReactType = viewModel.getReactType();
                    }


                    if (viewModelReactType != null) {
                        // read viewModel.reactType.equals(Constants.LIKES_REACTION)
                        viewModelReactTypeEqualsConstantsLIKESREACTION = viewModelReactType.equals(grand.app.aber_provider.utils.Constants.LIKES_REACTION);
                        // read viewModel.reactType.equals(Constants.DISLIKES_REACTIONS)
                        viewModelReactTypeEqualsConstantsDISLIKESREACTIONS = viewModelReactType.equals(grand.app.aber_provider.utils.Constants.DISLIKES_REACTIONS);
                        // read viewModel.reactType.equals(Constants.ALL_REACTIONS)
                        viewModelReactTypeEqualsConstantsALLREACTIONS = viewModelReactType.equals(grand.app.aber_provider.utils.Constants.ALL_REACTIONS);
                    }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewModelReactTypeEqualsConstantsLIKESREACTION) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewModelReactTypeEqualsConstantsDISLIKESREACTIONS) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewModelReactTypeEqualsConstantsALLREACTIONS) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.reactType.equals(Constants.LIKES_REACTION) ? @android:color/chat_options : @android:color/white
                    viewModelReactTypeEqualsConstantsLIKESREACTIONLikesAndroidColorChatOptionsLikesAndroidColorWhite = ((viewModelReactTypeEqualsConstantsLIKESREACTION) ? (getColorFromResource(likes, R.color.chat_options)) : (getColorFromResource(likes, R.color.white)));
                    // read viewModel.reactType.equals(Constants.DISLIKES_REACTIONS) ? @android:color/chat_options : @android:color/white
                    viewModelReactTypeEqualsConstantsDISLIKESREACTIONSTvPostDislikeAndroidColorChatOptionsTvPostDislikeAndroidColorWhite = ((viewModelReactTypeEqualsConstantsDISLIKESREACTIONS) ? (getColorFromResource(tvPostDislike, R.color.chat_options)) : (getColorFromResource(tvPostDislike, R.color.white)));
                    // read viewModel.reactType.equals(Constants.ALL_REACTIONS) ? @android:color/chat_options : @android:color/white
                    viewModelReactTypeEqualsConstantsALLREACTIONSAllAndroidColorChatOptionsAllAndroidColorWhite = ((viewModelReactTypeEqualsConstantsALLREACTIONS) ? (getColorFromResource(all, R.color.chat_options)) : (getColorFromResource(all, R.color.white)));
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passingObject
                        viewModelPassingObject = viewModel.getPassingObject();
                    }


                    if (viewModelPassingObject != null) {
                        // read viewModel.passingObject.object
                        viewModelPassingObjectObject = viewModelPassingObject.getObject();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.followersResponse
                        viewModelFollowersResponse = viewModel.getFollowersResponse();
                    }


                    if (viewModelFollowersResponse != null) {
                        // read viewModel.followersResponse.isLiked
                        viewModelFollowersResponseIsLiked = viewModelFollowersResponse.isIsLiked();
                        // read viewModel.followersResponse.dislikes
                        viewModelFollowersResponseDislikes = viewModelFollowersResponse.getDislikes();
                        // read viewModel.followersResponse.likes
                        viewModelFollowersResponseLikes = viewModelFollowersResponse.getLikes();
                        // read viewModel.followersResponse.allReacts
                        viewModelFollowersResponseAllReacts = viewModelFollowersResponse.getAllReacts();
                        // read viewModel.followersResponse.isDisLiked
                        viewModelFollowersResponseIsDisLiked = viewModelFollowersResponse.isIsDisLiked();
                    }
                if((dirtyFlags & 0x29L) != 0) {
                    if(viewModelFollowersResponseIsLiked) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0x29L) != 0) {
                    if(viewModelFollowersResponseIsDisLiked) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewModel.followersResponse.isLiked ? @android:drawable/ic_like_active : @android:drawable/ic_like
                    viewModelFollowersResponseIsLikedLikesAndroidDrawableIcLikeActiveLikesAndroidDrawableIcLike = ((viewModelFollowersResponseIsLiked) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(likes.getContext(), R.drawable.ic_like_active)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(likes.getContext(), R.drawable.ic_like)));
                    // read TextUtils.isEmpty(viewModel.followersResponse.dislikes)
                    TextUtilsIsEmptyViewModelFollowersResponseDislikes1 = android.text.TextUtils.isEmpty(viewModelFollowersResponseDislikes);
                    // read TextUtils.isEmpty(viewModel.followersResponse.likes)
                    TextUtilsIsEmptyViewModelFollowersResponseLikes1 = android.text.TextUtils.isEmpty(viewModelFollowersResponseLikes);
                    // read TextUtils.isEmpty(viewModel.followersResponse.allReacts)
                    TextUtilsIsEmptyViewModelFollowersResponseAllReacts1 = android.text.TextUtils.isEmpty(viewModelFollowersResponseAllReacts);
                    // read viewModel.followersResponse.isDisLiked ? @android:drawable/ic_dislike_active : @android:drawable/ic_dislike
                    viewModelFollowersResponseIsDisLikedTvPostDislikeAndroidDrawableIcDislikeActiveTvPostDislikeAndroidDrawableIcDislike = ((viewModelFollowersResponseIsDisLiked) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvPostDislike.getContext(), R.drawable.ic_dislike_active)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvPostDislike.getContext(), R.drawable.ic_dislike)));


                    // read !TextUtils.isEmpty(viewModel.followersResponse.dislikes)
                    textUtilsIsEmptyViewModelFollowersResponseDislikes = !TextUtilsIsEmptyViewModelFollowersResponseDislikes1;
                    // read !TextUtils.isEmpty(viewModel.followersResponse.likes)
                    textUtilsIsEmptyViewModelFollowersResponseLikes = !TextUtilsIsEmptyViewModelFollowersResponseLikes1;
                    // read !TextUtils.isEmpty(viewModel.followersResponse.allReacts)
                    textUtilsIsEmptyViewModelFollowersResponseAllReacts = !TextUtilsIsEmptyViewModelFollowersResponseAllReacts1;
                if((dirtyFlags & 0x29L) != 0) {
                    if(textUtilsIsEmptyViewModelFollowersResponseDislikes) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x29L) != 0) {
                    if(textUtilsIsEmptyViewModelFollowersResponseLikes) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x29L) != 0) {
                    if(textUtilsIsEmptyViewModelFollowersResponseAllReacts) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x29L) != 0) {

                // read !TextUtils.isEmpty(viewModel.followersResponse.dislikes) ? viewModel.followersResponse.dislikes : ""
                textUtilsIsEmptyViewModelFollowersResponseDislikesViewModelFollowersResponseDislikesJavaLangString = ((textUtilsIsEmptyViewModelFollowersResponseDislikes) ? (viewModelFollowersResponseDislikes) : (""));
                // read !TextUtils.isEmpty(viewModel.followersResponse.likes) ? viewModel.followersResponse.likes : ""
                textUtilsIsEmptyViewModelFollowersResponseLikesViewModelFollowersResponseLikesJavaLangString = ((textUtilsIsEmptyViewModelFollowersResponseLikes) ? (viewModelFollowersResponseLikes) : (""));
                // read !TextUtils.isEmpty(viewModel.followersResponse.allReacts) ? viewModel.followersResponse.allReacts : ""
                textUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString = ((textUtilsIsEmptyViewModelFollowersResponseAllReacts) ? (viewModelFollowersResponseAllReacts) : (""));


                // read @android:string/floor.concat(" ").concat(!TextUtils.isEmpty(viewModel.followersResponse.allReacts) ? viewModel.followersResponse.allReacts : "")
                allAndroidStringFloorConcatJavaLangStringConcatTextUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString = all.getResources().getString(R.string.floor).concat(" ").concat(textUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.all, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelReactTypeEqualsConstantsALLREACTIONSAllAndroidColorChatOptionsAllAndroidColorWhite));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.likes, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelReactTypeEqualsConstantsLIKESREACTIONLikesAndroidColorChatOptionsLikesAndroidColorWhite));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvPostDislike, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelReactTypeEqualsConstantsDISLIKESREACTIONSTvPostDislikeAndroidColorChatOptionsTvPostDislikeAndroidColorWhite));
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.all.setOnClickListener(mCallback38);
            this.likes.setOnClickListener(mCallback39);
            this.tvPostDislike.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.all, allAndroidStringFloorConcatJavaLangStringConcatTextUtilsIsEmptyViewModelFollowersResponseAllReactsViewModelFollowersResponseAllReactsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.likes, viewModelFollowersResponseIsLikedLikesAndroidDrawableIcLikeActiveLikesAndroidDrawableIcLike);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.likes, textUtilsIsEmptyViewModelFollowersResponseLikesViewModelFollowersResponseLikesJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableEnd(this.tvPostDislike, viewModelFollowersResponseIsDisLikedTvPostDislikeAndroidDrawableIcDislikeActiveTvPostDislikeAndroidDrawableIcDislike);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPostDislike, textUtilsIsEmptyViewModelFollowersResponseDislikesViewModelFollowersResponseDislikesJavaLangString);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.recPeople, viewModelFollowersAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvReactsPeopleValue, viewModelPassingObjectObject);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonActions(grand.app.aber_provider.utils.Constants.LIKES_REACTION);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonActions(grand.app.aber_provider.utils.Constants.DISLIKES_REACTIONS);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.buttonActions(grand.app.aber_provider.utils.Constants.ALL_REACTIONS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.passingObject
        flag 2 (0x3L): viewModel.reactType
        flag 3 (0x4L): viewModel.followersResponse
        flag 4 (0x5L): viewModel.followersAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.followersResponse.isLiked ? @android:drawable/ic_like_active : @android:drawable/ic_like
        flag 7 (0x8L): viewModel.followersResponse.isLiked ? @android:drawable/ic_like_active : @android:drawable/ic_like
        flag 8 (0x9L): viewModel.followersResponse.isDisLiked ? @android:drawable/ic_dislike_active : @android:drawable/ic_dislike
        flag 9 (0xaL): viewModel.followersResponse.isDisLiked ? @android:drawable/ic_dislike_active : @android:drawable/ic_dislike
        flag 10 (0xbL): !TextUtils.isEmpty(viewModel.followersResponse.dislikes) ? viewModel.followersResponse.dislikes : ""
        flag 11 (0xcL): !TextUtils.isEmpty(viewModel.followersResponse.dislikes) ? viewModel.followersResponse.dislikes : ""
        flag 12 (0xdL): viewModel.reactType.equals(Constants.ALL_REACTIONS) ? @android:color/chat_options : @android:color/white
        flag 13 (0xeL): viewModel.reactType.equals(Constants.ALL_REACTIONS) ? @android:color/chat_options : @android:color/white
        flag 14 (0xfL): !TextUtils.isEmpty(viewModel.followersResponse.likes) ? viewModel.followersResponse.likes : ""
        flag 15 (0x10L): !TextUtils.isEmpty(viewModel.followersResponse.likes) ? viewModel.followersResponse.likes : ""
        flag 16 (0x11L): viewModel.reactType.equals(Constants.DISLIKES_REACTIONS) ? @android:color/chat_options : @android:color/white
        flag 17 (0x12L): viewModel.reactType.equals(Constants.DISLIKES_REACTIONS) ? @android:color/chat_options : @android:color/white
        flag 18 (0x13L): viewModel.reactType.equals(Constants.LIKES_REACTION) ? @android:color/chat_options : @android:color/white
        flag 19 (0x14L): viewModel.reactType.equals(Constants.LIKES_REACTION) ? @android:color/chat_options : @android:color/white
        flag 20 (0x15L): !TextUtils.isEmpty(viewModel.followersResponse.allReacts) ? viewModel.followersResponse.allReacts : ""
        flag 21 (0x16L): !TextUtils.isEmpty(viewModel.followersResponse.allReacts) ? viewModel.followersResponse.allReacts : ""
    flag mapping end*/
    //end
}