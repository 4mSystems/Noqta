package grand.app.aber_provider.pages.settings.models;

import com.google.gson.annotations.SerializedName;

public class UserDocuments {

	@SerializedName("civil_image")
	private String civilImage;

	@SerializedName("license_image")
	private String licenseImage;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("back_car_image")
	private String backCarImage;

	@SerializedName("front_car_image")
	private String frontCarImage;

	@SerializedName("insurance_flag")
	private int insuranceFlag;

	@SerializedName("id")
	private int id;

	@SerializedName("back_car_flag")
	private int backCarFlag;

	@SerializedName("insurance_image")
	private String insuranceImage;

	@SerializedName("license_flag")
	private int licenseFlag;

	@SerializedName("front_car_flag")
	private int frontCarFlag;

	@SerializedName("civil_flag")
	private int civilFlag;

	public String getCivilImage(){
		return civilImage;
	}

	public String getLicenseImage(){
		return licenseImage;
	}

	public int getUserId(){
		return userId;
	}

	public String getBackCarImage(){
		return backCarImage;
	}

	public String getFrontCarImage(){
		return frontCarImage;
	}

	public int getInsuranceFlag(){
		return insuranceFlag;
	}

	public int getId(){
		return id;
	}

	public int getBackCarFlag(){
		return backCarFlag;
	}

	public String getInsuranceImage(){
		return insuranceImage;
	}

	public int getLicenseFlag(){
		return licenseFlag;
	}

	public int getFrontCarFlag(){
		return frontCarFlag;
	}

	public int getCivilFlag(){
		return civilFlag;
	}
}