package org.example;

import org.example.person.employee.Customer;
import org.example.person.services.CustomerService;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        List<Meal> meals = new ArrayList<>();
//
//        meals.add(new Meal("Palov"));
//        meals.add(new Meal("Manti"));
//        meals.add(new Meal("chuchvara"));
//        meals.add(new Meal("Somsa"));
//        MenuSection menuSection =
//                new MenuSection("First Meal","only soups", meals);
//
//        ArrayList<MenuSection> menuSections = new ArrayList<>();
//        menuSections.add(menuSection);
//        menu.setMenuSections(menuSections);
//
//        WaiterService waiterService = new WaiterService();
//        Order order  = waiterService.createOrder(menu);
//
//        OrderService orderService = new OrderService();
//        orderService.sout(order);

        CustomerService customerService = new CustomerService();
        customerService
                .createReservation(new Customer("john", "adasd@asdma.com", "+929112", LocalDate.now()));

    }
}