package org.example.restaurant.menu.objects;

import java.util.List;

import static org.example.utils.Input.random;

public class MenuSection {
    private final int menuSectionId = random.nextInt();

    private final List<Meal> meals;
    private String title;
    private String description;

    public MenuSection(String title, String description, List<Meal> meals) {
        this.title = title;
        this.description = description;
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public int getMenuSectionId() {
        return menuSectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MenuSection{" +
                "menuSectionId=" + menuSectionId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
