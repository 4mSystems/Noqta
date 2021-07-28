package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailsBindingImpl extends FragmentProductDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_scroll, 1);
        sViewsWithIds.put(R.id.imageSlider, 2);
        sViewsWithIds.put(R.id.ic_favorite, 3);
        sViewsWithIds.put(R.id.ic_share, 4);
        sViewsWithIds.put(R.id.v1, 5);
        sViewsWithIds.put(R.id.tv_part_desc, 6);
        sViewsWithIds.put(R.id.rate, 7);
        sViewsWithIds.put(R.id.tv_rate, 8);
        sViewsWithIds.put(R.id.tv_parts_price, 9);
        sViewsWithIds.put(R.id.v2, 10);
        sViewsWithIds.put(R.id.tv_colors, 11);
        sViewsWithIds.put(R.id.rc_colors, 12);
        sViewsWithIds.put(R.id.v3, 13);
        sViewsWithIds.put(R.id.tv_sizes, 14);
        sViewsWithIds.put(R.id.rc_sizes, 15);
        sViewsWithIds.put(R.id.v4, 16);
        sViewsWithIds.put(R.id.tv_saler_desc, 17);
        sViewsWithIds.put(R.id.rc_sale_desc, 18);
        sViewsWithIds.put(R.id.send_container, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.smarteist.autoimageslider.SliderView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[14]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        this.mViewModel = ViewModel;
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}