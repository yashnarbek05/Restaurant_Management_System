package org.example.person.services;

import org.example.db.database;
import org.example.enums.OrderStatus;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.menu.objects.MenuSection;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Reservation;
import org.example.restaurant.order.objects.Table;
import org.example.restaurant.order.services.OrderService;
import org.example.utils.Input;

import static org.example.utils.Input.scannerInt;
import static org.example.utils.Input.scannerString;

public class WaiterService implements WaiterServiceImp {
    public void createOrder(){
        OrderService orderService = new OrderService();
        Order order = new Order(OrderStatus.PREPARING);

        while (true) {
            MenuSection menuSection = chooseSection(database.MENU);
            while (true) {
                if (menuSection == null) {
                    System.out.println("Enter only available sections");
                    menuSection = chooseSection(database.MENU);
                } else {
                    break;
                }
            }
            Meal meal = chooseMeal(menuSection);

            while (true) {
                if (meal == null) {
                    System.out.println("Enter only available meal!!");
                    meal = chooseMeal(menuSection);
                } else {
                    break;
                }
            }

            System.out.println("How many " + meal.getName() + "do you want?");

            int quantity = scannerInt.nextInt();

            orderService.addMeal(order, meal, quantity);

            System.out.println("Is that enough? (yes/no)");

            Table table = null;
            if (scannerString.nextLine().equals("yes")) {
                while(true) {
                    System.out.println("which table you want ordered? ");
                    for (Table table1 : database.TABLES) {
                        System.out.println(table1);
                    }
                    System.out.print("Enter table id: ");
                    int i = scannerInt.nextInt();
                    for (Table table1 : database.TABLES) {
                        if (table1.getId() == i) table = table1;
                    }

                    if(table == null){
                        System.out.println("please enter true id!!");
                    }
                    else break;

                }
                database.TABLE_WITH_ORDER.put(table, order);
                break;
            }

        }
    }

    public MenuSection chooseSection(Menu menu){
        for (MenuSection menuSection : menu.getMenuSections()) {
            System.out.println(menuSection);
        }

        System.out.println("Choose menuSection above:");



        int menuOption = scannerInt.nextInt();

        MenuSection menuSection = null;

        for (MenuSection menuSect : menu.getMenuSections()) {
            if (menuSect.getMenuSectionId() == menuOption) menuSection = menuSect;
        }
        return menuSection;
    }

    public Meal chooseMeal(MenuSection menuSection){
        for (Meal meal : menuSection.getMeals()) {
            System.out.println(meal);
        }

        System.out.println("Choose Meal above:");



        int mealOp = scannerInt.nextInt();

        Meal chosenMeal = null;

        for (Meal meal : menuSection.getMeals()) {
            if (meal.getMealId() == mealOp) chosenMeal = meal;
        }
        return chosenMeal;
    }
}
