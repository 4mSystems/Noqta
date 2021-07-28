package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HistoryWalletData {

	@SerializedName("wallet")
	private String wallet;

	@SerializedName("user_wallet_recharges")
	private List<WalletHistoryItem> userWalletRecharges;

	@SerializedName("id")
	private int id;

	public String getWallet(){
		return wallet;
	}

	public List<WalletHistoryItem> getUserWalletRecharges(){
		return userWalletRecharges;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public int getId(){
		return id;
	}
}