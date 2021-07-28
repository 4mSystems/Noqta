package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 3);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.rcPosts.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((grand.app.aber_provider.pages.home.viewModels.HomeViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.home.viewModels.HomeViewModels ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.home.viewModels.HomeViewModels) object, fieldId);
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
    private boolean onChangeViewModel(grand.app.aber_provider.pages.home.viewModels.HomeViewModels ViewModel, int fieldId) {
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelSearchProgressVisibleGet = false;
        androidx.databinding.ObservableBoolean viewModelSearchProgressVisible = null;
        int viewModelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.home.adapters.PostsAdapter viewModelPostsAdapter = null;
        grand.app.aber_provider.pages.home.viewModels.HomeViewModels viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchProgressVisible
                        viewModelSearchProgressVisible = viewModel.searchProgressVisible;
                    }
                    updateRegistration(0, viewModelSearchProgressVisible);


                    if (viewModelSearchProgressVisible != null) {
                        // read viewModel.searchProgressVisible.get()
                        viewModelSearchProgressVisibleGet = viewModelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewModelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewModelSearchProgressVisibleViewVISIBLEViewGONE = ((viewModelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.postsAdapter
                        viewModelPostsAdapter = viewModel.getPostsAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewModelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcPosts, viewModelPostsAdapter, "1", "1");
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
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}