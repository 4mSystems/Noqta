package grand.app.aber_provider.pages.appWallet.viewModels;

import androidx.databinding.Bindable;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.appWallet.models.WalletHistoryItem;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class ItemAppWalletHistoryViewModel extends BaseViewModel {
    public WalletHistoryItem walletHistoryItem;
    public String title;

    public ItemAppWalletHistoryViewModel(WalletHistoryItem walletHistoryItem) {
        this.walletHistoryItem = walletHistoryItem;
        title = ResourceManager.getString(R.string.wallet_history_1).concat(" ").concat(walletHistoryItem.getCancelFess()).concat(" ").concat(currency).concat(" ").concat(ResourceManager.getString(R.string.wallet_history_2));
    }

    @Bindable
    public WalletHistoryItem getWalletHistoryItem() {
        return walletHistoryItem;
    }
}
