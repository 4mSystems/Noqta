package grand.app.aber_provider.pages.myOrders.models;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.base.StatusMessage;

public class MyOrdersResponse extends StatusMessage {

	@SerializedName("data")
	private MyOrdersMain myOrdersMain;

	public MyOrdersMain getMyOrdersMain(){
		return myOrdersMain;
	}

}