package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

public class WalletHistoryItem {

    @SerializedName("updated_at")
    private String updatedAt;
    private String balance;
    @SerializedName("cancel_fees")
    private String cancelFess;

    @SerializedName("id")
    private int id;

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCancelFess() {
        return cancelFess;
    }

    public void setCancelFess(String cancelFess) {
        this.cancelFess = cancelFess;
    }
}