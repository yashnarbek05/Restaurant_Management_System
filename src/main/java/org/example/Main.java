package org.example;

import org.example.db.database;
import org.example.person.employee.Chef;
import org.example.person.employee.Person;
import org.example.person.services.WaiterService;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.menu.objects.MenuSection;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.service.OrderService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        List<Meal> meals = new ArrayList<>();

        meals.add(new Meal("Palov"));
        meals.add(new Meal("Manti"));
        meals.add(new Meal("chuchvara"));
        meals.add(new Meal("Somsa"));
        MenuSection menuSection =
                new MenuSection("First Meal","only soups", meals);

        ArrayList<MenuSection> menuSections = new ArrayList<>();
        menuSections.add(menuSection);
        menu.setMenuSections(menuSections);

        WaiterService waiterService = new WaiterService();
        Order order  = waiterService.createOrder(menu);

        OrderService orderService = new OrderService();
        orderService.sout(order);
    }
}