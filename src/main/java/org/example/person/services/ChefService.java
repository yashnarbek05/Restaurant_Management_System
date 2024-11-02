package org.example.person.services;


import org.example.db.database;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.menu.objects.MenuSection;
import org.example.restaurant.order.objects.Order;

import java.util.List;

import static org.example.utils.Input.scannerInt;
import static org.example.utils.Input.scannerString;

public class ChefService implements ChefServiceImp {

    public boolean takeOrder(Menu menu) {
        return false;
    }

}
