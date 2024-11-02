package org.example.person.employee;

import java.time.LocalDate;

public class Manager extends Employee {
    public Manager(String name, String email, String phone, LocalDate lastVisited) {
        super(name, email, phone, lastVisited);
    }
}
