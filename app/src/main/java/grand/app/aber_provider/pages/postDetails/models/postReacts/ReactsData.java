package grand.app.aber_provider.pages.postDetails.models.postReacts;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.profile.models.MainFollowersData;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class ReactsData {

	@SerializedName("isDisLiked")
	private boolean isDisLiked;

	@SerializedName("all_reacts")
	private String allReacts;

	@SerializedName("isLiked")
	private boolean isLiked;

	@SerializedName("dislikes")
	private String dislikes;

	@SerializedName("id")
	private int id;

	@SerializedName("user")
	private MainFollowersData mainFollowersData;

	@SerializedName("likes")
	private String likes;

	public boolean isIsDisLiked(){
		return isDisLiked;
	}

	public String getAllReacts(){
		if (allReacts != null) {
			if (Math.abs(Double.parseDouble(allReacts) / 1000000000) >= 1) {
				return (Double.parseDouble(allReacts) / 1000000000) + " " + ResourceManager.getString(R.string.billion);
			} else if (Math.abs(Double.parseDouble(allReacts) / 1000000) >= 1) {
				return (Double.parseDouble(allReacts) / 1000000) + " " + ResourceManager.getString(R.string.million);
			} else if (Math.abs(Double.parseDouble(allReacts) / 1000) >= 1) {
				return (Double.parseDouble(allReacts) / 1000) + " " + ResourceManager.getString(R.string.mark);
			} else
				return allReacts;
		}
		return "";
	}

	public boolean isIsLiked(){
		return isLiked;
	}

	public String getDislikes(){
		if (dislikes != null) {
			if (Math.abs(Double.parseDouble(dislikes) / 1000000000) >= 1) {
				return (Double.parseDouble(dislikes) / 1000000000) + " " + ResourceManager.getString(R.string.billion);
			} else if (Math.abs(Double.parseDouble(dislikes) / 1000000) >= 1) {
				return (Double.parseDouble(dislikes) / 1000000) + " " + ResourceManager.getString(R.string.million);
			} else if (Math.abs(Double.parseDouble(dislikes) / 1000) >= 1) {
				return (Double.parseDouble(dislikes) / 1000) + " " + ResourceManager.getString(R.string.mark);
			} else
				return dislikes;
		}
		return "";
	}

	public int getId(){
		return id;
	}

	public MainFollowersData getMainFollowersData() {
		return mainFollowersData;
	}

	public String getLikes(){
		if (likes != null) {
			if (Math.abs(Double.parseDouble(likes) / 1000000000) >= 1) {
				return (Double.parseDouble(likes) / 1000000000) + " " + ResourceManager.getString(R.string.billion);
			} else if (Math.abs(Double.parseDouble(likes) / 1000000) >= 1) {
				return (Double.parseDouble(likes) / 1000000) + " " + ResourceManager.getString(R.string.million);
			} else if (Math.abs(Double.parseDouble(likes) / 1000) >= 1) {
				return (Double.parseDouble(likes) / 1000) + " " + ResourceManager.getString(R.string.mark);
			} else
				return likes;
		}
		return "";
	}
}