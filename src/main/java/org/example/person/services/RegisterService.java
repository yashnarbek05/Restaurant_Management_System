package org.example.person.services;

import org.example.db.database;
import org.example.person.employee.Person;
import org.example.utils.Input;

import java.util.List;

import static org.example.db.database.USERS;

public class RegisterService {
    public static boolean register() {
        while (true) {
            System.out.print("Enter name: ");
            String name = Input.scannerString.nextLine();
            if (!isValidName(name)) {
                System.out.println("Invalid name. Name should contain only alphabetic characters.");
                continue;
            }

            System.out.print("Enter email: ");
            String email = Input.scannerString.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid email. Email should be in the format of example@gmail.com.");
                continue;
            }

            System.out.print("Enter phone: ");
            String phone = Input.scannerString.nextLine();
            if (!isValidPhone(phone)) {
                System.out.println("Invalid phone number. Phone number should be exactly 12 digits.");
                continue;
            }

            if (isEmailExist(email)) {
                System.out.println("Email already exists. Do you want to log in?");
                LoginService.login();
                return false;
            }

            if (isPhoneExist(phone)) {
                System.out.println("Phone number already exists. Do you want to log in?");
                LoginService.login();
                return false;
            }

            if (isNameExist(name)) {
                System.out.println("Name already exists. Do you want to log in?");
                LoginService.login();
                return false;
            }

            Person newUser = new Person(name, email, phone);
            USERS.add(newUser);
            System.out.println("User registered successfully!");
            return true;
        }
    }

    private static boolean isEmailExist(String email) {
        for (Person user : USERS) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPhoneExist(String phone) {
        for (Person user : USERS) {
            if (user.getPhone().equals(phone)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNameExist(String name) {
        for (Person user : USERS) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidEmail(String email) {
        if (email == null || !email.endsWith("@gmail.com")) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex <= 0) {
            return false;
        }
        String localPart = email.substring(0, atIndex);
        for (char c : localPart.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '%') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidPhone(String phone) {
        if (phone == null || phone.length() != 12) {
            return false;
        }
        for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
