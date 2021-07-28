package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

public class RaiseWalletRequest {
    @SerializedName("amount")
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
