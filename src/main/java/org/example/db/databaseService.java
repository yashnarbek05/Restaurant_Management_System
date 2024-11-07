package org.example.db;

import org.example.person.employee.Chef;
import org.example.person.employee.Manager;
import org.example.person.employee.Receptionist;
import org.example.person.employee.Waiter;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.MenuSection;

import java.time.LocalDate;
import java.util.List;

public class databaseService {
    static {
        MenuSection menuSection = new MenuSection("Birinchi ovqat", "",
                List.of(new Meal("Palov", 25000d), new Meal("Lag'mon", 20000d)));
        MenuSection menuSection2 = new MenuSection("Shirinlik", "",
                List.of(new Meal("musqaymoq", 5000d), new Meal("Pishiriq", 10000d)));

        database.MENU.getMenuSections().add(menuSection);
        database.MENU.getMenuSections().add(menuSection2);

        Receptionist receptionist = new Receptionist("Bush", "bush@gmail.com", "952220182", LocalDate.now());
        Chef chef = new Chef("Yashnarbek", "yashnarbek@gmail.com", "999999999", LocalDate.now());
        Waiter waiter = new Waiter("Zohida", "zohida@gmail.com", "333333333", LocalDate.now());
        Manager manager = new Manager("Jasur", "jasur@gmail.com", "777777777", LocalDate.now());

        //put the into default database
        database.USERS.add(receptionist);
        database.USERS.add(chef);
        database.USERS.add(waiter);
        database.USERS.add(manager);
        System.out.println("static");
    }
    {
        System.out.println("Insteance block");
    }

    public databaseService() {
        System.out.println("construktor");
    }
}
