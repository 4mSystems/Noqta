package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProfileBindingImpl extends ItemProfileBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.icUser.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvGroupName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
            setViewModel((te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel ViewModel) {
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
                return onChangeViewModel((te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.profileItem) {
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
        java.lang.String viewModelProfileItemName = null;
        int viewModelProfileItemIcon = 0;
        te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel viewModel = mViewModel;
        te.app.nottaa.pages.settings.models.ProfileItem viewModelProfileItem = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.profileItem
                    viewModelProfileItem = viewModel.getProfileItem();
                }


                if (viewModelProfileItem != null) {
                    // read viewModel.profileItem.name
                    viewModelProfileItemName = viewModelProfileItem.getName();
                    // read viewModel.profileItem.icon
                    viewModelProfileItemIcon = viewModelProfileItem.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.nottaa.base.ApplicationBinding.loadImage(this.icUser, viewModelProfileItemIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupName, viewModelProfileItemName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback35);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.profileItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}