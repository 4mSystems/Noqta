package grand.app.aber_provider.pages.profile.models.profile;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import grand.app.aber_provider.model.PaginateMain;
import grand.app.aber_provider.pages.home.models.PostData;

public class Posts extends PaginateMain {

    @SerializedName("data")
    private List<PostData> postDataList;

    public List<PostData> getPostDataList() {
        return postDataList;
    }
}