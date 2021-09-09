package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemWalletHistoryBindingImpl extends ItemWalletHistoryBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemWalletHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemWalletHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.itemBalanceMoney.setTag(null);
        this.itemWalletCode.setTag(null);
        this.itemWalletDate.setTag(null);
        this.itemWalletType.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.itemWalletViewModel == variableId) {
            setItemWalletViewModel((grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemWalletViewModel(@Nullable grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel ItemWalletViewModel) {
        updateRegistration(0, ItemWalletViewModel);
        this.mItemWalletViewModel = ItemWalletViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemWalletViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemWalletViewModel((grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemWalletViewModel(grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel ItemWalletViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.walletHistoryItem) {
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
        grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel itemWalletViewModel = mItemWalletViewModel;
        java.lang.String itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangString = null;
        java.lang.String textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalanceItemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrencyJavaLangString = null;
        java.lang.String itemWalletViewModelCurrency = null;
        java.lang.String itemWalletViewModelTitle = null;
        boolean textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance = false;
        grand.app.aber_provider.pages.appWallet.models.WalletHistoryItem itemWalletViewModelWalletHistoryItem = null;
        java.lang.String stringValueOfItemWalletViewModelWalletHistoryItemId = null;
        boolean TextUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance1 = false;
        java.lang.String itemWalletViewModelWalletHistoryItemUpdatedAt = null;
        int itemWalletViewModelWalletHistoryItemId = 0;
        java.lang.String itemWalletViewModelWalletHistoryItemBalance = null;
        java.lang.String itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrency = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (itemWalletViewModel != null) {
                        // read itemWalletViewModel.title
                        itemWalletViewModelTitle = itemWalletViewModel.title;
                    }
            }

                if (itemWalletViewModel != null) {
                    // read itemWalletViewModel.walletHistoryItem
                    itemWalletViewModelWalletHistoryItem = itemWalletViewModel.getWalletHistoryItem();
                }


                if (itemWalletViewModelWalletHistoryItem != null) {
                    // read itemWalletViewModel.walletHistoryItem.updatedAt
                    itemWalletViewModelWalletHistoryItemUpdatedAt = itemWalletViewModelWalletHistoryItem.getUpdatedAt();
                    // read itemWalletViewModel.walletHistoryItem.id
                    itemWalletViewModelWalletHistoryItemId = itemWalletViewModelWalletHistoryItem.getId();
                    // read itemWalletViewModel.walletHistoryItem.balance
                    itemWalletViewModelWalletHistoryItemBalance = itemWalletViewModelWalletHistoryItem.getBalance();
                }


                // read String.valueOf(itemWalletViewModel.walletHistoryItem.id)
                stringValueOfItemWalletViewModelWalletHistoryItemId = java.lang.String.valueOf(itemWalletViewModelWalletHistoryItemId);
                // read TextUtils.isEmpty(itemWalletViewModel.walletHistoryItem.balance)
                textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance = android.text.TextUtils.isEmpty(itemWalletViewModelWalletHistoryItemBalance);


                // read !TextUtils.isEmpty(itemWalletViewModel.walletHistoryItem.balance)
                TextUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance1 = !textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance;
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (itemWalletViewModelWalletHistoryItemBalance != null) {
                    // read itemWalletViewModel.walletHistoryItem.balance.concat(" ")
                    itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangString = itemWalletViewModelWalletHistoryItemBalance.concat(" ");
                }
                if (itemWalletViewModel != null) {
                    // read itemWalletViewModel.currency
                    itemWalletViewModelCurrency = itemWalletViewModel.currency;
                }


                if (itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangString != null) {
                    // read itemWalletViewModel.walletHistoryItem.balance.concat(" ").concat(itemWalletViewModel.currency)
                    itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrency = itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangString.concat(itemWalletViewModelCurrency);
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read !TextUtils.isEmpty(itemWalletViewModel.walletHistoryItem.balance) ? itemWalletViewModel.walletHistoryItem.balance.concat(" ").concat(itemWalletViewModel.currency) : ""
                textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalanceItemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrencyJavaLangString = ((TextUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalance1) ? (itemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrency) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemBalanceMoney, textUtilsIsEmptyItemWalletViewModelWalletHistoryItemBalanceItemWalletViewModelWalletHistoryItemBalanceConcatJavaLangStringConcatItemWalletViewModelCurrencyJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemWalletCode, stringValueOfItemWalletViewModelWalletHistoryItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemWalletDate, itemWalletViewModelWalletHistoryItemUpdatedAt);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemWalletType, itemWalletViewModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemWalletViewModel
        flag 1 (0x2L): itemWalletViewModel.walletHistoryItem
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(itemWalletViewModel.walletHistoryItem.balance) ? itemWalletViewModel.walletHistoryItem.balance.concat(" ").concat(itemWalletViewModel.currency) : ""
        flag 4 (0x5L): !TextUtils.isEmpty(itemWalletViewModel.walletHistoryItem.balance) ? itemWalletViewModel.walletHistoryItem.balance.concat(" ").concat(itemWalletViewModel.currency) : ""
    flag mapping end*/
    //end
}