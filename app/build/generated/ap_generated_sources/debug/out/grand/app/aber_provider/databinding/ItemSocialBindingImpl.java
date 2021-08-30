package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSocialBindingImpl extends ItemSocialBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

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
    private final grand.app.aber_provider.customViews.views.CustomTextViewRegular mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSocialBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemSocialBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.appCompatButtonNext.setTag(null);
        this.icSocial.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback85 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback84 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.socialMediaData) {
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
        java.lang.String itemViewModelSocialMediaDataValue = null;
        grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelSocialMediaDataImage = null;
        grand.app.aber_provider.pages.settings.models.SocialMediaData itemViewModelSocialMediaData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.socialMediaData
                    itemViewModelSocialMediaData = itemViewModel.getSocialMediaData();
                }


                if (itemViewModelSocialMediaData != null) {
                    // read itemViewModel.socialMediaData.value
                    itemViewModelSocialMediaDataValue = itemViewModelSocialMediaData.getValue();
                    // read itemViewModel.socialMediaData.image
                    itemViewModelSocialMediaDataImage = itemViewModelSocialMediaData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback85);
            this.mboundView0.setOnClickListener(mCallback84);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.icSocial, itemViewModelSocialMediaDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelSocialMediaDataValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.socialMediaData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}