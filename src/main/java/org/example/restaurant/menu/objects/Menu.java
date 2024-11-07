package org.example.restaurant.menu.objects;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuID;
    private String title;
    private String description;
    private List<MenuSection> menuSections = new ArrayList<>();

    public Menu(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public List<MenuSection> getMenuSections() {
        return menuSections;
    }

    public void setMenuSections(List<MenuSection> menuSections) {
        this.menuSections = menuSections;
    }

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


    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

