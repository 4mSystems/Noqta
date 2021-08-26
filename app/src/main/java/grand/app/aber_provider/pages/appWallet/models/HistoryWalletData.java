package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HistoryWalletData {

	@SerializedName("balance")
	private String balance;

	@SerializedName("orders")
	private List<WalletHistoryItem> userWalletRecharges;

	@SerializedName("cancel_fees")
	private String cancel_fees;

	public String getBalance() {
		return balance;
	}

	public List<WalletHistoryItem> getUserWalletRecharges() {
		return userWalletRecharges;
	}

	public String getCancel_fees() {
		return cancel_fees;
	}
}