package org.example.restaurant.order.objects;

import org.example.enums.OrderStatus;
import org.example.restaurant.menu.objects.Meal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.utils.Input.random;

public class Order {
    private int orderID = random.nextInt();
    private OrderStatus status;
    private Map<Meal, Integer> mealsWithQuantity;

    public Order(OrderStatus status) {
        this.status = status;
        this.mealsWithQuantity = new HashMap<>();
    }

    public Map<Meal, Integer> getMealsWithQuantity() {
        return mealsWithQuantity;
    }

    public void setMealsWithQuantity(Map<Meal, Integer> mealsWithQuantity) {
        this.mealsWithQuantity = mealsWithQuantity;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
