import org.example.Main;
import org.example.person.services.LoginService;
import org.example.person.services.ManagerService;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TestMain {
    public static void main(String[] args){
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
