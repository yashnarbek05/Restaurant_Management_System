package org.example.person.services;

import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Table;

public interface WaiterServiceImp {
    void createOrder(Menu menu, Table table);
}
