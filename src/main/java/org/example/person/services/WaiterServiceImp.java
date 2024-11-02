package org.example.person.services;

import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.order.objects.Order;

public interface WaiterServiceImp {
    Order createOrder(Menu menu);
}
