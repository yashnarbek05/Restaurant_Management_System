package org.example.person.services;

import org.example.db.database;
import org.example.person.employee.Person;
import org.example.utils.Input;

import java.util.List;

import static org.example.db.database.USERS;

public class RegisterService {
    public static boolean register(){
        while (true){

            System.out.print("Enter name: ");
            String name = Input.scannerString.nextLine();
            System.out.print("Enter email: ");
            String email = Input.scannerString.nextLine();

            for (Person user : USERS) {
                if (user.getEmail().equals(email)){
                    System.out.println("Email already exist do you want");

                    LoginService.login();

                }
            }
        }

    }
}
