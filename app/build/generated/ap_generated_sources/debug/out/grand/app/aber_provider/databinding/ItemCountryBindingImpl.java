package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCountryBindingImpl extends ItemCountryBinding  {

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
    @NonNull
    private final com.google.android.material.radiobutton.MaterialRadioButton mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCountryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCountryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.radiobutton.MaterialRadioButton) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.itemPostViewModel == variableId) {
            setItemPostViewModel((grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPostViewModel(@Nullable grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel ItemPostViewModel) {
        updateRegistration(0, ItemPostViewModel);
        this.mItemPostViewModel = ItemPostViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemPostViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemPostViewModel((grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemPostViewModel(grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel ItemPostViewModel, int fieldId) {
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
        boolean itemPostViewModelLangEqualsJavaLangStringEn = false;
        grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel itemPostViewModel = mItemPostViewModel;
        java.lang.String itemPostViewModelLang = null;
        int itemPostViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (itemPostViewModel != null) {
                    // read itemPostViewModel.lang
                    itemPostViewModelLang = itemPostViewModel.lang;
                }


                if (itemPostViewModelLang != null) {
                    // read itemPostViewModel.lang.equals("en")
                    itemPostViewModelLangEqualsJavaLangStringEn = itemPostViewModelLang.equals("en");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(itemPostViewModelLangEqualsJavaLangStringEn) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read itemPostViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
                itemPostViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR = ((itemPostViewModelLangEqualsJavaLangStringEn) ? (android.util.LayoutDirection.RTL) : (android.util.LayoutDirection.LTR));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 17
            if(getBuildSdkInt() >= 17) {

                this.mboundView1.setLayoutDirection(itemPostViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemPostViewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): itemPostViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
        flag 3 (0x4L): itemPostViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
    flag mapping end*/
    //end
}