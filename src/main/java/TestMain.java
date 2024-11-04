import org.example.Main;
import org.example.db.database;
import org.example.person.employee.*;
import org.example.person.services.LoginService;
import org.example.person.services.ManagerService;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TestMain {
    public static void main(String[] args){
        //create objects of each class for default database
        LocalDate date = null;
        Receptionist receptionist = new Receptionist("Bush","bush@gmail.com","952220182",date);
        Chef chef = new Chef("Yashnarbek","yashnarbek@gmail.com","999999999",date);
        Waiter waiter = new Waiter("Zohida","zohida@gmail.com","333333333",date);
        Manager manager = new Manager("Jasur","jasur@gmail.com","777777777",date);

        //put the into default database
        database.USERS.add(receptionist);
        database.USERS.add(chef);
        database.USERS.add(waiter);
        database.USERS.add(manager);

        //position of the user. Exmpl: waiter,, manager , etc
        String position;

        //user log in
        position = LoginService.login().getClass().getSimpleName();

        //user switch between tasks
        switch(position){
            case "Manager":
                System.out.println("Manager");

                break;
            case "Chef":
                System.out.println("Chef");
                break;
            case "Customer":
                System.out.println("Customer");
                break;
            case "Receptionist":
                System.out.println("Receptionist");
                break;
            case "Waiter":
                System.out.println("Waiter");
                break;
            default:
                System.out.println("Wrong account");
                break;
        }
    }
}
