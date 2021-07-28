package grand.app.aber_provider.pages.appWallet.models;

import com.google.gson.annotations.SerializedName;

public class WalletHistoryItem {

	@SerializedName("amount")
	private String amount;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("payment_id")
	private String paymentId;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	public String getAmount(){
		return amount;
	}

	public int getUserId(){
		return userId;
	}

	public String getPaymentId(){
		return paymentId;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}
}