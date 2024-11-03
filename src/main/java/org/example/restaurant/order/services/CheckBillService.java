package org.example.restaurant.order.services;

import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Table;

import java.util.Map;

public class CheckBillService implements CheckBillImp{
    @Override
    public boolean createBill(Map.Entry<Table, Order> entry) {
        return false;
    }
}
