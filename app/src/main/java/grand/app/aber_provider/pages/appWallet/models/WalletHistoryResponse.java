package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class WalletHistoryResponse extends StatusMessage {

    @SerializedName("data")
    private HistoryWalletData data;

    public HistoryWalletData getData() {
        return data;
    }
}