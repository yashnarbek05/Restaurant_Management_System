import org.example.enums.LogStatus;
import org.example.person.employee.Employee;
import org.example.person.employee.Waiter;
import org.example.person.services.ChefService;
import org.example.person.services.ManagerService;
import org.example.person.services.ReceptionistService;
import org.example.person.services.WaiterService;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.menu.objects.Menu;
import org.example.restaurant.menu.objects.MenuSection;
import org.example.restaurant.order.objects.Table;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TestMain{

    static String[] data = new String[20];
    static Menu menu = null;
    static Table table = null;

    public static void main(String[] args){
        //Creating a file called data
        File data = new File("Database.txt");

        //Checking if that file already exists or not
        checkFile(data);

        //For logging in and out
        LogStatus logStatus = LogStatus.LOGGED_OUT;

        //login
        String login = logInOut(logStatus);

        //doing tasks
        chooseTask(login);
        logInOut(logStatus);
    }

    //To check if the file already exists, if not creating
    public static void checkFile(File data){
        try {
            if (data.createNewFile()) {
                System.out.println("Database created: " + data.getName());
            } else {
                System.out.println("Database already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Logging in and logging out
    public static String logInOut(LogStatus logStatus){
        // Checking if user is logged in or not. If yes, then log out.
        // But if not, search for login and if it is valid, log in
        if(logStatus.equals(LogStatus.LOGGED_OUT)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write your login : ");
            String login = scanner.next();

            for(int i = 0; i < 20; i++){
                if(Objects.equals(login, data[i])){
                    logStatus = LogStatus.LOGGED_IN;
                    break;
                }
            }
            return login;
        }else{
            logStatus = LogStatus.LOGGED_OUT;
            return "Logged out successfully";
        }
    }

    //file reader
    public static String[] fileReader(File file) {
        int i = 0;
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                data[i] = myReader.next();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    //switching
    public static void chooseTask(String login){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        switch(login){
            case "Manager":
                ManagerService managerService = new ManagerService();
                System.out.println("Choose what you want to do : ");
                System.out.println("1. Add user : ");
                managerService.addEmployee();
                break;
            case "Chef":
                ChefService chefService = new ChefService();
                System.out.println("Taking order...");
                chefService.takeOrder(menu);
            case "Waiter":
                WaiterService waiterService = new WaiterService();
                System.out.println("Choose what you want to do : ");
                System.out.println("1.Create order\n2.Choose section\n3.Choose meal");
                i = scanner.nextInt();
                switch (i){
                    case 1:
                        waiterService.createOrder(menu,table);
                        break;
                    case 2:
                        waiterService.chooseSection(menu);
                        break;
                    case 3:
                        Meal meal = new Meal("pilau");
                        List<Meal> meals = java.util.List.of();
                        waiterService.chooseMeal(new MenuSection("Title","Descriiption",meals));
                        break;
                    default:
                        System.out.println("Wrong input!!!");
                }
            case "Receptionist":
                ReceptionistService receptionistService = new ReceptionistService();
                receptionistService.createTableWithReservation();
                break;
            default:
                System.out.println("Wrong input, or wrong statement");
                break;
        }
        System.out.println("Type 1 to retry and anything else to log out");
        i = scanner.nextInt();
        if(i == 1){
            chooseTask(login);
        }
    }
}