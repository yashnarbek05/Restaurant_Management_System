package org.example.restaurant.order.services;

import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.order.objects.Order;

public interface OrderImp {
    void addMeal(Order order, Meal meal, Integer quantity);
    void removeMeal(Order order, Meal meal);
}
