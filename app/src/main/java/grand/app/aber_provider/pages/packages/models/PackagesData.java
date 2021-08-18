package grand.app.aber_provider.pages.packages.models;

import com.google.gson.annotations.SerializedName;

public class PackagesData {

	@SerializedName("image")
	private String image;

	@SerializedName("price")
	private String price;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	public String getImage(){
		return image;
	}

	public String getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}
}