package org.example.restaurant.order.services;

import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Table;

import java.util.Map;

public interface CheckBillImp {
    boolean createBill(Map.Entry<Table, Order> entry);

}
