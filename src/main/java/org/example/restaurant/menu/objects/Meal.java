package org.example.restaurant.menu.objects;

import java.util.List;
import java.util.Random;

import static org.example.utils.Input.random;

public class Meal {
    private int mealId = random.nextInt() ;
    private String name;

    public Meal(String name) {
        this.name = name;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId=" + mealId +
                ", name='" + name + '\'' +
                '}';
    }
}
