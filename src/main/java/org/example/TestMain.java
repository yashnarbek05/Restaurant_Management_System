package org.example;

import org.example.db.database;
import org.example.person.employee.*;
import org.example.person.services.*;
import org.example.utils.Input;

import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;

        //position of the user. Exmpl: waiter,, manager , etc
        Person person = LoginService.login();
        String position;

        //loop
        while(true) {
            //user log in or register
            System.out.println("Type 1 to log in , 2 to register and 0 to exit program: ");
            if(scanner.nextInt()==2){
                RegisterService.register();
            } else if (scanner.nextInt()==1) {
                position = person.getClass().getSimpleName();

                while (true) {
                    //user switch between tasks
                    switch (position) {
                        //Managers methods
                        case "Manager":
                            System.out.println("MANAGER");
//                        System.out.println("Choose which task you want to do : ");
                            System.out.println("add user : ");
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
                            customer.createReservation((Customer) person);
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
                            waiterService.createOrder();
                            break;

                        //logging out
                        case "logOut":
                            System.out.println("Logging the program");
                            return;

                        //if non of the above
                        default:
                            System.out.println("Wrong account");
                            break;
                    }
                    System.out.println("Enter 0 if you want to log out, and anything else to continue : ");
                    if (scanner.nextInt() == 0) {
                        position = "logOut";
                    }
                }
            }
            else if(scanner.nextInt()==0){
                return;
            }
            else{
                System.out.println("Wrong input, please try again!");
            }
        }
    }
}
