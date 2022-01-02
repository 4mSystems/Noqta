package te.app.nottaa.pages.settings.models;

public class ProfileItem {
    private int id;
    private String name;
    private int icon;
    private String fragment;

    public ProfileItem(int id, String name, int icon, String fragment) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.fragment = fragment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }
}
