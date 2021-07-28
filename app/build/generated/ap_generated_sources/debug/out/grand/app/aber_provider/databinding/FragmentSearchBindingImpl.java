package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.curve, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.recPosts.setTag(null);
        this.searchInput.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.aber_provider.pages.home.viewModels.SearchViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.home.viewModels.SearchViewModels Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((grand.app.aber_provider.pages.home.viewModels.SearchViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewmodelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.home.viewModels.SearchViewModels Viewmodel, int fieldId) {
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
        grand.app.aber_provider.pages.home.adapters.SearchPostsAdapter viewmodelPostsAdapter = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String viewmodelSearch = null;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        grand.app.aber_provider.pages.home.viewModels.SearchViewModels viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.postsAdapter
                        viewmodelPostsAdapter = viewmodel.getPostsAdapter();
                    }
            }
            if ((dirtyFlags & 0xaL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.search
                        viewmodelSearch = viewmodel.search;
                        // read viewmodel::onTextChanged
                        viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.recPosts, viewmodelPostsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchInput, viewmodelSearch);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnTextChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private grand.app.aber_provider.pages.home.viewModels.SearchViewModels value;
        public OnTextChangedImpl setValue(grand.app.aber_provider.pages.home.viewModels.SearchViewModels value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onTextChanged(arg0, arg1, arg2, arg3); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.postsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}