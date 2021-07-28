package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfilePostsBindingImpl extends FragmentProfilePostsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfilePostsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentProfilePostsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.animationView.setTag(null);
        this.progress.setTag(null);
        this.rcPosts.setTag(null);
        this.rcQPosts.setTag(null);
        this.searchContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels ViewModel) {
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
                return onChangeViewModelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModel((grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewModelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.postsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.questionedPostsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        int viewModelQuestionedPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE = 0;
        boolean viewModelSearchProgressVisibleGet = false;
        java.util.List<grand.app.aber_provider.pages.home.models.PostData> viewModelQuestionedPostsAdapterPostDataList = null;
        int viewModelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0 = false;
        int viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0ViewGONEViewVISIBLE = 0;
        boolean viewModelQuestionedPostsAdapterPostDataListSizeInt0 = false;
        boolean viewModelPostsAdapterPostDataListSizeInt0 = false;
        grand.app.aber_provider.pages.home.adapters.PostsAdapter viewModelPostsAdapter = null;
        grand.app.aber_provider.pages.profile.adapters.QuestionedPostsAdapter viewModelQuestionedPostsAdapter = null;
        androidx.databinding.ObservableBoolean viewModelSearchProgressVisible = null;
        int viewModelPostsAdapterPostDataListSize = 0;
        int viewModelQuestionedPostsAdapterPostDataListSize = 0;
        java.util.List<grand.app.aber_provider.pages.home.models.PostData> viewModelPostsAdapterPostDataList = null;
        int viewModelPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x1eL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.postsAdapter
                        viewModelPostsAdapter = viewModel.getPostsAdapter();
                    }

                if ((dirtyFlags & 0x16L) != 0) {
                }

                    if (viewModelPostsAdapter != null) {
                        // read viewModel.postsAdapter.postDataList
                        viewModelPostsAdapterPostDataList = viewModelPostsAdapter.getPostDataList();
                    }


                    if (viewModelPostsAdapterPostDataList != null) {
                        // read viewModel.postsAdapter.postDataList.size()
                        viewModelPostsAdapterPostDataListSize = viewModelPostsAdapterPostDataList.size();
                    }


                    // read viewModel.postsAdapter.postDataList.size() > 0
                    viewModelPostsAdapterPostDataListSizeInt0 = (viewModelPostsAdapterPostDataListSize) > (0);
                if((dirtyFlags & 0x1eL) != 0) {
                    if(viewModelPostsAdapterPostDataListSizeInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x16L) != 0) {
                    if(viewModelPostsAdapterPostDataListSizeInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }

                if ((dirtyFlags & 0x16L) != 0) {

                        // read viewModel.postsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
                        viewModelPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE = ((viewModelPostsAdapterPostDataListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.questionedPostsAdapter
                        viewModelQuestionedPostsAdapter = viewModel.getQuestionedPostsAdapter();
                    }


                    if (viewModelQuestionedPostsAdapter != null) {
                        // read viewModel.questionedPostsAdapter.postDataList
                        viewModelQuestionedPostsAdapterPostDataList = viewModelQuestionedPostsAdapter.getPostDataList();
                    }


                    if (viewModelQuestionedPostsAdapterPostDataList != null) {
                        // read viewModel.questionedPostsAdapter.postDataList.size()
                        viewModelQuestionedPostsAdapterPostDataListSize = viewModelQuestionedPostsAdapterPostDataList.size();
                    }


                    // read viewModel.questionedPostsAdapter.postDataList.size() > 0
                    viewModelQuestionedPostsAdapterPostDataListSizeInt0 = (viewModelQuestionedPostsAdapterPostDataListSize) > (0);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(viewModelQuestionedPostsAdapterPostDataListSizeInt0) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
                    viewModelQuestionedPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE = ((viewModelQuestionedPostsAdapterPostDataListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchProgressVisible
                        viewModelSearchProgressVisible = viewModel.searchProgressVisible;
                    }
                    updateRegistration(0, viewModelSearchProgressVisible);


                    if (viewModelSearchProgressVisible != null) {
                        // read viewModel.searchProgressVisible.get()
                        viewModelSearchProgressVisibleGet = viewModelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0x13L) != 0) {
                    if(viewModelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewModelSearchProgressVisibleViewVISIBLEViewGONE = ((viewModelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                if (viewModel != null) {
                    // read viewModel.questionedPostsAdapter
                    viewModelQuestionedPostsAdapter = viewModel.getQuestionedPostsAdapter();
                }


                if (viewModelQuestionedPostsAdapter != null) {
                    // read viewModel.questionedPostsAdapter.postDataList
                    viewModelQuestionedPostsAdapterPostDataList = viewModelQuestionedPostsAdapter.getPostDataList();
                }


                if (viewModelQuestionedPostsAdapterPostDataList != null) {
                    // read viewModel.questionedPostsAdapter.postDataList.size()
                    viewModelQuestionedPostsAdapterPostDataListSize = viewModelQuestionedPostsAdapterPostDataList.size();
                }


                // read viewModel.questionedPostsAdapter.postDataList.size() > 0
                viewModelQuestionedPostsAdapterPostDataListSizeInt0 = (viewModelQuestionedPostsAdapterPostDataListSize) > (0);
            if((dirtyFlags & 0x1aL) != 0) {
                if(viewModelQuestionedPostsAdapterPostDataListSizeInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }

        if ((dirtyFlags & 0x1eL) != 0) {

                // read viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0
                viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0 = ((viewModelPostsAdapterPostDataListSizeInt0) ? (true) : (viewModelQuestionedPostsAdapterPostDataListSizeInt0));
            if((dirtyFlags & 0x1eL) != 0) {
                if(viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.GONE : View.VISIBLE
                viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0ViewGONEViewVISIBLE = ((viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1eL) != 0) {
            // api target 1

            this.animationView.setVisibility(viewModelPostsAdapterPostDataListSizeInt0BooleanTrueViewModelQuestionedPostsAdapterPostDataListSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.progress.setVisibility(viewModelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.rcPosts.setVisibility(viewModelPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcPosts, viewModelPostsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.rcQPosts.setVisibility(viewModelQuestionedPostsAdapterPostDataListSizeInt0ViewVISIBLEViewGONE);
            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcQPosts, viewModelQuestionedPostsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.searchProgressVisible
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): viewModel.postsAdapter
        flag 3 (0x4L): viewModel.questionedPostsAdapter
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0
        flag 10 (0xbL): viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0
        flag 11 (0xcL): viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.postsAdapter.postDataList.size() > 0 ? true : viewModel.questionedPostsAdapter.postDataList.size() > 0 ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.postsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.postsAdapter.postDataList.size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}