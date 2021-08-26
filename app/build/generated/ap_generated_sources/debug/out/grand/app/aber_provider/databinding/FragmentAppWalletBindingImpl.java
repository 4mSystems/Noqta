package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAppWalletBindingImpl extends FragmentAppWalletBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header_layout, 3);
        sViewsWithIds.put(R.id.curve, 4);
        sViewsWithIds.put(R.id.card_my_wallet, 5);
        sViewsWithIds.put(R.id.tv_wallet_balance, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAppWalletBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentAppWalletBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rcWalletHistory.setTag(null);
        this.tvWallet.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.historyWalletData) {
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
        grand.app.aber_provider.pages.appWallet.models.HistoryWalletData viewmodelHistoryWalletData = null;
        grand.app.aber_provider.pages.appWallet.adapters.AppWalletAdapter viewmodelAppWalletAdapter = null;
        java.lang.String viewmodelHistoryWalletDataBalance = null;
        java.lang.String viewmodelHistoryWalletDataBalanceConcatJavaLangStringConcatViewmodelCurrency = null;
        java.lang.String viewmodelCurrency = null;
        java.lang.String viewmodelHistoryWalletDataBalanceConcatJavaLangString = null;
        grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.historyWalletData
                    viewmodelHistoryWalletData = viewmodel.getHistoryWalletData();
                    // read viewmodel.currency
                    viewmodelCurrency = viewmodel.currency;
                }


                if (viewmodelHistoryWalletData != null) {
                    // read viewmodel.historyWalletData.balance
                    viewmodelHistoryWalletDataBalance = viewmodelHistoryWalletData.getBalance();
                }


                if (viewmodelHistoryWalletDataBalance != null) {
                    // read viewmodel.historyWalletData.balance.concat(" ")
                    viewmodelHistoryWalletDataBalanceConcatJavaLangString = viewmodelHistoryWalletDataBalance.concat(" ");
                }


                if (viewmodelHistoryWalletDataBalanceConcatJavaLangString != null) {
                    // read viewmodel.historyWalletData.balance.concat(" ").concat(viewmodel.currency)
                    viewmodelHistoryWalletDataBalanceConcatJavaLangStringConcatViewmodelCurrency = viewmodelHistoryWalletDataBalanceConcatJavaLangString.concat(viewmodelCurrency);
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.appWalletAdapter
                        viewmodelAppWalletAdapter = viewmodel.getAppWalletAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcWalletHistory, viewmodelAppWalletAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWallet, viewmodelHistoryWalletDataBalanceConcatJavaLangStringConcatViewmodelCurrency);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.historyWalletData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}