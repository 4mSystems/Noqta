package grand.app.aber_provider.pages.packages.models;

import com.google.gson.annotations.SerializedName;

public class RequestToSend {
    @SerializedName("package_id")
    private int packageId;

    public RequestToSend(int packageId) {
        this.packageId = packageId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }
}
