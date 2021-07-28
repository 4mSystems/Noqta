package grand.app.aber_provider.pages.appWallet.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.appWallet.models.WalletHistoryItem;

public class ItemAppWalletHistoryViewModel extends BaseViewModel {
    public WalletHistoryItem walletHistoryItem;

    public ItemAppWalletHistoryViewModel(WalletHistoryItem walletHistoryItem) {
        this.walletHistoryItem = walletHistoryItem;
    }

    @Bindable
    public WalletHistoryItem getWalletHistoryItem() {
        return walletHistoryItem;
    }
}
