package org.example.restaurant.order.service;

import org.example.enums.OrderStatus;

public interface OrderImp {
    boolean addMeal();
    boolean removeMeal();
    OrderStatus setStatus();
}
