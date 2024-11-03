package org.example.restaurant.order.services;

import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.order.objects.Order;

import java.util.Map;

public class OrderService implements OrderImp{
    @Override
    public void addMeal(Order order, Meal meal, Integer quantity) {
        if(order.getMealsWithQuantity().containsKey(meal))
            order.getMealsWithQuantity()
                    .put(meal, order.getMealsWithQuantity().getOrDefault(meal,0)+quantity);
        else order.getMealsWithQuantity().put(meal, quantity);
    }

    @Override
    public void removeMeal(Order order, Meal meal) {
        order.getMealsWithQuantity().remove(meal);
        System.out.println(meal + "removed!");
    }


    public void sout(Order order){
        System.out.println("Your order status: " + order.getStatus());
        System.out.println("Your order meals:");
        for (Map.Entry<Meal, Integer> entry : order.getMealsWithQuantity().entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
