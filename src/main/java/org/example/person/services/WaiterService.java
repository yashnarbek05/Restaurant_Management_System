package org.example.person.services;

import org.example.db.database;
import org.example.enums.OrderStatus;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.menu.objects.MenuSection;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Table;
import org.example.restaurant.order.service.OrderService;

import static org.example.utils.Input.scannerInt;
import static org.example.utils.Input.scannerString;

public class WaiterService implements WaiterServiceImp {
    public void createOrder(Menu menu, Table table){

        OrderService orderService = new OrderService();

        Order order = new Order(OrderStatus.PREPARING);
        while (true) {
            MenuSection menuSection = chooseSection(menu);
            while (true) {
                if (menuSection == null) {
                    System.out.println("Enter only available sections");
                    chooseSection(menu);
                } else {
                    break;
                }
            }
            Meal meal = chooseMeal(menuSection);

            while (true) {
                if (meal == null) {
                    System.out.println("Enter only available sections");
                    chooseMeal(menuSection);
                } else {
                    break;
                }
            }

            System.out.println("How many " + meal.getName() + "do you want?");

            int quantity = scannerInt.nextInt();



            orderService.addMeal(order, meal, quantity);

            System.out.println("Is that enough? (yes/no)");

            if (scannerString.nextLine().equals("yes")) {
                database.TABLE_WITH_ORDER.put(table, order);
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
