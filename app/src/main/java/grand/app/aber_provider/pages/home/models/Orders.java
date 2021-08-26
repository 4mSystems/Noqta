package grand.app.aber_provider.pages.home.models;

import com.google.gson.annotations.SerializedName;


public class Orders {
    @SerializedName("id")
    private int id;
    @SerializedName("service_name")
    private String serviceName;
    @SerializedName("client_name")
    private String clientName;
    @SerializedName("is_emergency")
    private int is_emergency;
    @SerializedName("scheduled_at")
    private String scheduledAt;
    @SerializedName("address")
    private String address;
    @SerializedName("total")
    private String total;
    @SerializedName("acceptance_period")
    private String acceptancePeriod;

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getClientName() {
        return clientName;
    }

    public int getIs_emergency() {
        return is_emergency;
    }

    public String getScheduledAt() {
        return scheduledAt;
    }

    public String getAddress() {
        return address;
    }

    public String getTotal() {
        return total;
    }

    public String getAcceptancePeriod() {
        return acceptancePeriod;
    }
}
