package org.example.person.employee;

import org.example.enums.LogStatus;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {
    private LocalDate lastVisited;

    public Employee(String name, String email, String phone, LocalDate lastVisited) {
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
