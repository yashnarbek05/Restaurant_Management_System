package org.example.restaurant.menu.objects;

public class Menu {
    private int menuID;
    private String title;
    private String description;

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMenuID() {
        return menuID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}

