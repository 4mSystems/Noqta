package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPackageBindingImpl extends ItemPackageBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_free, 6);
        sViewsWithIds.put(R.id.ic_resource, 7);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final grand.app.aber_provider.customViews.views.CustomTextViewMedium mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPackageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemPackageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.btnSubscribe.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.partImage.setTag(null);
        this.tvPackage.setTag(null);
        this.tvPackageDesc.setTag(null);
        setRootTag(root);
        // listeners
        mCallback73 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemPostViewModel == variableId) {
            setItemPostViewModel((grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPostViewModel(@Nullable grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels ItemPostViewModel) {
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
                return onChangeItemPostViewModel((grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemPostViewModel(grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels ItemPostViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.packagesData) {
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
        grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels itemPostViewModel = mItemPostViewModel;
        grand.app.aber_provider.pages.packages.models.PackagesData itemPostViewModelPackagesData = null;
        java.lang.String itemPostViewModelPackagesDataPrice = null;
        java.lang.String itemPostViewModelPackagesDataPriceConcatJavaLangStringConcatItemPostViewModelCurrency = null;
        java.lang.String itemPostViewModelPackagesDataDescription = null;
        java.lang.String itemPostViewModelPackagesDataName = null;
        java.lang.String itemPostViewModelPackagesDataImage = null;
        java.lang.String itemPostViewModelCurrency = null;
        java.lang.String itemPostViewModelPackagesDataPriceConcatJavaLangString = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemPostViewModel != null) {
                    // read itemPostViewModel.packagesData
                    itemPostViewModelPackagesData = itemPostViewModel.getPackagesData();
                    // read itemPostViewModel.currency
                    itemPostViewModelCurrency = itemPostViewModel.currency;
                }


                if (itemPostViewModelPackagesData != null) {
                    // read itemPostViewModel.packagesData.price
                    itemPostViewModelPackagesDataPrice = itemPostViewModelPackagesData.getPrice();
                    // read itemPostViewModel.packagesData.description
                    itemPostViewModelPackagesDataDescription = itemPostViewModelPackagesData.getDescription();
                    // read itemPostViewModel.packagesData.name
                    itemPostViewModelPackagesDataName = itemPostViewModelPackagesData.getName();
                    // read itemPostViewModel.packagesData.image
                    itemPostViewModelPackagesDataImage = itemPostViewModelPackagesData.getImage();
                }


                if (itemPostViewModelPackagesDataPrice != null) {
                    // read itemPostViewModel.packagesData.price.concat(" ")
                    itemPostViewModelPackagesDataPriceConcatJavaLangString = itemPostViewModelPackagesDataPrice.concat(" ");
                }


                if (itemPostViewModelPackagesDataPriceConcatJavaLangString != null) {
                    // read itemPostViewModel.packagesData.price.concat(" ").concat(itemPostViewModel.currency)
                    itemPostViewModelPackagesDataPriceConcatJavaLangStringConcatItemPostViewModelCurrency = itemPostViewModelPackagesDataPriceConcatJavaLangString.concat(itemPostViewModelCurrency);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnSubscribe.setOnClickListener(mCallback73);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemPostViewModelPackagesDataPriceConcatJavaLangStringConcatItemPostViewModelCurrency);
            grand.app.aber_provider.base.ApplicationBinding.loadImage(this.partImage, itemPostViewModelPackagesDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPackage, itemPostViewModelPackagesDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPackageDesc, itemPostViewModelPackagesDataDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemPostViewModel
        grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels itemPostViewModel = mItemPostViewModel;
        // itemPostViewModel != null
        boolean itemPostViewModelJavaLangObjectNull = false;



        itemPostViewModelJavaLangObjectNull = (itemPostViewModel) != (null);
        if (itemPostViewModelJavaLangObjectNull) {


            itemPostViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemPostViewModel
        flag 1 (0x2L): itemPostViewModel.packagesData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}