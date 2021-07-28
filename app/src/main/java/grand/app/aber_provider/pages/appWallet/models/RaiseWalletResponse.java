package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;


public class RaiseWalletResponse extends StatusMessage {

    @SerializedName("data")
    private WalletHistoryItem data;

    public WalletHistoryItem getData() {
        return data;
    }

}