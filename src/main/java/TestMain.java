import org.example.enums.LogStatus;
import org.example.person.employee.Employee;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class TestMain{

    static String[] data = new String[20];

    public static void main(String[] args){
        //Creating a file called data
        File data = new File("Database.txt");

        //Checking if that file already exists or not
        checkFile(data);

        //For logging in and out
        LogStatus logStatus = LogStatus.LOGGED_OUT;

        //login
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
    public static void logInOut(LogStatus logStatus){
        // Checking if user is logged in or not. If yes, then log out.
        // But if not, search for login and if it is valid, log in
        if(logStatus.equals(LogStatus.LOGGED_OUT)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write your login : ");
            String login = scanner.next();

            for(int i=0;i<20;i++){
                if(Objects.equals(login, data[i])){
                    logStatus = LogStatus.LOGGED_IN;
                    break;
                }
            }
        }else{
            logStatus = LogStatus.LOGGED_OUT;
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

}