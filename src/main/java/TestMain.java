import org.example.Main;
import org.example.db.database;
import org.example.person.employee.*;
import org.example.person.services.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class TestMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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

        //loop
        while(true) {
            //user log in
            position = LoginService.login().getClass().getSimpleName();

            //user switch between tasks
            switch (position) {
                //Managers methods
                case "Manager":
                    System.out.println("MANAGER : ");
                    System.out.println("Choose which task you want to do : ");
                    System.out.println("add users : ");
                    RegisterService.register();
                    break;

                //Chefs methods
                case "Chef":
                    System.out.println("Chef");
                    ChefService chefService = new ChefService();
                    chefService.takeOrder();
                    break;

                //Customers methods
                case "Customer":
                    System.out.println("Customer");
                    CustomerService customer = new CustomerService();
                    customer.createReservation(new Customer("custom", "custom@gmail.com", "1000", date));
                    break;

                //Receptionists methods
                case "Receptionist":
                    System.out.println("Receptionist");
                    ReceptionistService receptionistService = new ReceptionistService();
                    receptionistService.createTableWithReservation();
                    break;

                //Waiters methods
                case "Waiter":
                    System.out.println("Waiter");
                    System.out.println("Choose which task to do : ");
                    System.out.println("1.Create order\n2.Choose section\n3.Choose meal");
                    WaiterService waiterService = new WaiterService();
                    int i = scanner.nextInt();
                    //waiterService.createOrder();
                    break;


                case "exit":
                    System.out.println("Exiting the program");
                    return;
                //if non of the above
                default:
                    System.out.println("Wrong account");
                    break;
            }
        }
    }
}
