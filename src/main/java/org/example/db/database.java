package org.example.db;


import org.example.person.employee.Person;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Reservation;
import org.example.restaurant.order.objects.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface database {
    List<Person> USERS = new ArrayList<>();    // meneger can add user and users can log in and register
    Map<Table, Order> TABLE_WITH_ORDER = new HashMap<>();  // waiter  put()   and  chef change order status
    ArrayList<Reservation> RESERVATIONS = new ArrayList<>(); // customer add()
    List<Table> TABLES = new ArrayList<>(); // receptionist add()
    Menu MENU = new Menu("Zohida milliy taomlar", "O'zbek taomlaridan lazzatlaning!");

}
