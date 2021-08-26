package grand.app.aber_provider.pages.myOrders.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.PaginateMain;
import grand.app.aber_provider.pages.home.models.Orders;

public class MyOrdersMain extends PaginateMain {

	@SerializedName("data")
	private List<Orders> ordersList;

	public List<Orders> getOrdersList(){
		return ordersList;
	}

}