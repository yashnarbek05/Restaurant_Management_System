package org.example.restaurant.order.objects;

import org.example.enums.OrderStatus;

public class Order {
    private int orderID;
    private OrderStatus status;

    Order(){}

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
