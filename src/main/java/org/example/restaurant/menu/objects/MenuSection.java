package org.example.restaurant.menu.objects;

public class MenuSection {
    private int menuSectionId;
    private String title;
    private String description;

    MenuSection(){}

    public void setMenuSectionId(int menuSectionId) {
        this.menuSectionId = menuSectionId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMenuSectionId() {
        return menuSectionId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    
}
