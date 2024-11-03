package org.example.person.employee;

import org.example.restaurant.order.objects.CheckBill;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person{
    private LocalDate lastVisited;
    private List<CheckBill> checkBills = new ArrayList<>();


    public Customer( String name, String email, String phone, LocalDate lastVisited) {
        super(name, email, phone);
        this.lastVisited = lastVisited;
    }

    public LocalDate getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(LocalDate lastVisited) {
        this.lastVisited = lastVisited;
    }
}
