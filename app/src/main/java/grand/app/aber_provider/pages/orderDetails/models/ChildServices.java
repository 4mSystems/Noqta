package grand.app.aber_provider.pages.orderDetails.models;

public class ChildServices extends Vehicle {
    private String parentText;
    private String childText;
    private String subChildText;

    public String getParentText() {
        return parentText;
    }

    public void setParentText(String parentText) {
        this.parentText = parentText;
    }

    public String getChildText() {
        return childText;
    }

    public void setChildText(String childText) {
        this.childText = childText;
    }

    public String getSubChildText() {
        return subChildText;
    }

    public void setSubChildText(String subChildText) {
        this.subChildText = subChildText;
    }
}
