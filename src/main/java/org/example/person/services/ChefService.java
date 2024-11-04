package org.example.person.services;


import org.example.db.database;
import org.example.enums.OrderStatus;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.order.objects.Order;
import org.example.restaurant.order.objects.Table;
import org.example.utils.Input;
import org.w3c.dom.CDATASection;

import java.util.Map;

public class ChefService implements ChefServiceImp {

    public boolean takeOrder() {
        for(Map.Entry<Table, Order> tableOrderEntry: database.TABLE_WITH_ORDER.entrySet()){
            System.out.println(tableOrderEntry.getKey() + ": " + tableOrderEntry.getValue());
        }

        System.out.print("Choose order above? (enter order id please): ");
        int orId = Input.scannerInt.nextInt();
        for(Map.Entry<Table, Order> tableOrderEntry: database.TABLE_WITH_ORDER.entrySet()){
            if (tableOrderEntry.getValue().getOrderID() == orId) {
                tableOrderEntry.getValue().setStatus(OrderStatus.COMPLETE);
                return true;
            }
        }
        return false;
    }

}
