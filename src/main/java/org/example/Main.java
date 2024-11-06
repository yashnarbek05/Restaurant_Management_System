package org.example;

import org.example.db.databaseService;
import org.example.person.employee.Customer;
import org.example.person.employee.Person;
import org.example.person.services.*;
import org.example.utils.Input;

public class Main {
    static {
        databaseService.load();
    }
    public static void main(String[] args) {

        Person person;
        String position;
        int logout;

        //loop
        while (true) {
            //user log in or register
            System.out.print("Type 1 to log in , 2 to register and 0 to exit program: ");
            int option = Input.scannerInt.nextInt();
            if (option == 2) {
                RegisterService.register();
            } else if (option == 1) {
                person = LoginService.login();
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
                            WaiterService waiterService = new WaiterService();
                            waiterService.createOrder();
                            break;

                        //logging out
                        case "logOut":
                            System.out.println("Login out...");
                            return;

                        //if non of the above
                        default:
                            System.out.println("Wrong account");
                            break;
                    }

                    System.out.println("Enter 0 if you want to log out, and anything else to continue : ");
                    logout = Input.scannerInt.nextInt();
                    if (logout == 0) {
                        position = "logOut";
                    }
                }
            } else if (option == 0) {
                return;
            } else {
                System.out.println("Wrong input, please try again!");
            }
        }
    }
}
