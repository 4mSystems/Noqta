package grand.app.aber_provider.pages.home.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import grand.app.aber_provider.model.PaginateMain;

public class MainData extends PaginateMain {

    @SerializedName("data")
    private List<PostData> postDataList;

    public List<PostData> getPostDataList() {
        return postDataList;
    }
}