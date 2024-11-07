import org.example.person.employee.Customer;
import org.example.person.employee.Person;
import org.example.person.services.*;
import org.example.utils.Input;

public class TestMain {
    public static void main(String[] args) {
        //position of the user. Exmpl: waiter,, manager , etc
        Person per = LoginService.login();

        //user log in
        String position = per.getClass().getSimpleName();

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
                CustomerService customerService = new CustomerService();
                customerService.createReservation((Customer) per);
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
                int i = Input.scannerInt.nextInt();
                waiterService.createOrder();
                break;

            //if non of the above
            default:
                System.out.println("Wrong account");
                break;
        }

    }
}
