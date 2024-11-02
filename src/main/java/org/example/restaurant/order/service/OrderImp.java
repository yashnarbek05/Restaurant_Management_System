package org.example.restaurant.order.service;

import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.order.objects.Order;

public interface OrderImp {
    void addMeal(Order order, Meal meal, Integer quantity);
    boolean removeMeal(Order order);
}
