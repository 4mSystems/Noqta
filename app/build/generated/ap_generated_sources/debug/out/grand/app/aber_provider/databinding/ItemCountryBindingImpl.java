package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCountryBindingImpl extends ItemCountryBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
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
        mCallback44 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels ItemViewModel) {
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
                return onChangeItemViewModel((grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.countriesData) {
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
        boolean itemViewModelLangEqualsJavaLangStringEn = false;
        grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels itemViewModel = mItemViewModel;
        grand.app.aber_provider.pages.auth.countries.models.CountriesData itemViewModelCountriesData = null;
        java.lang.String itemViewModelCountriesDataName = null;
        int itemViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR = 0;
        java.lang.String itemViewModelLang = null;
        boolean itemViewModelCountriesDataSelected = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.countriesData
                    itemViewModelCountriesData = itemViewModel.getCountriesData();
                }


                if (itemViewModelCountriesData != null) {
                    // read itemViewModel.countriesData.name
                    itemViewModelCountriesDataName = itemViewModelCountriesData.getName();
                    // read itemViewModel.countriesData.selected
                    itemViewModelCountriesDataSelected = itemViewModelCountriesData.isSelected();
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.lang
                        itemViewModelLang = itemViewModel.lang;
                    }


                    if (itemViewModelLang != null) {
                        // read itemViewModel.lang.equals("en")
                        itemViewModelLangEqualsJavaLangStringEn = itemViewModelLang.equals("en");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(itemViewModelLangEqualsJavaLangStringEn) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }


                    // read itemViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
                    itemViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR = ((itemViewModelLangEqualsJavaLangStringEn) ? (android.util.LayoutDirection.RTL) : (android.util.LayoutDirection.LTR));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, itemViewModelCountriesDataSelected);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemViewModelCountriesDataName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 17
            if(getBuildSdkInt() >= 17) {

                this.mboundView1.setLayoutDirection(itemViewModelLangEqualsJavaLangStringEnLayoutDirectionRTLLayoutDirectionLTR);
            }
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback44);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.countriesData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
        flag 4 (0x5L): itemViewModel.lang.equals("en") ? LayoutDirection.RTL : LayoutDirection.LTR
    flag mapping end*/
    //end
}