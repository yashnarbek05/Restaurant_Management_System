package org.example.restaurant.order.service;

import org.example.enums.OrderStatus;

public class Order implements OrderImp{
    @Override
    public boolean addMeal() {
        return false;
    }

    @Override
    public boolean removeMeal() {
        return false;
    }

    @Override
    public OrderStatus setStatus() {
        return null;
    }
}
