package org.example.person.services;


import org.example.db.database;
import org.example.restaurant.order.objects.Order;

import java.util.List;

public class ChefService implements ChefServiceImp{

    public boolean takeOrder(List<Order> orders) {
        return false;
    }

    @Override
    public boolean takeOrder() {
        return false;
    }
}
