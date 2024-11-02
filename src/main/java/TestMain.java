import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TestMain {
    public static void main(String[] args){
        //Creating a file called data
        File data = new File("Database.txt");

        //Checking if that file already exists or not
        checkFile(data);

        //For logging in and out
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
    public static void logInOut(){

    }
}
