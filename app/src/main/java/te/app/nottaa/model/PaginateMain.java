package te.app.nottaa.model;

import com.google.gson.annotations.SerializedName;

public class PaginateMain {
    @SerializedName("per_page")
    private int perPage;

    @SerializedName("last_page")
    private int lastPage;

    @SerializedName("next_page_url")
    private String nextPageUrl;

    @SerializedName("prev_page_url")
    private String prevPageUrl;

    @SerializedName("first_page_url")
    private String firstPageUrl;

    @SerializedName("path")
    private String path;

    @SerializedName("total")
    private int total;

    @SerializedName("last_page_url")
    private String lastPageUrl;

    @SerializedName("from")
    private int from;

    @SerializedName("to")
    private int to;

    @SerializedName("current_page")
    private int currentPage;

    public int getPerPage(){
        return perPage;
    }

    public int getLastPage(){
        return lastPage;
    }

    public String getNextPageUrl(){
        return nextPageUrl;
    }

    public Object getPrevPageUrl(){
        return prevPageUrl;
    }

    public String getFirstPageUrl(){
        return firstPageUrl;
    }

    public String getPath(){
        return path;
    }

    public int getTotal(){
        return total;
    }

    public String getLastPageUrl(){
        return lastPageUrl;
    }

    public int getFrom(){
        return from;
    }

    public int getTo(){
        return to;
    }

    public int getCurrentPage(){
        return currentPage;
    }
}
