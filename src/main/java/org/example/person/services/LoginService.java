package org.example.person.services;

import org.example.person.employee.Person;
import org.example.utils.Input;

import static org.example.db.database.USERS;

public class LoginService {
    public static Person login() {
        System.out.print("Enter email: ");
        String email = Input.scannerString.nextLine();
        System.out.print("Enter phone: ");
        String phone = Input.scannerString.nextLine();
        System.out.print("Enter name: ");
        String name = Input.scannerString.nextLine();

        for (Person user : USERS) {
            if (user.getEmail().equals(email) && user.getPhone().equals(phone) && user.getName().equals(name)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Invalid credentials. Please try again.");
        return null;
    }
}
