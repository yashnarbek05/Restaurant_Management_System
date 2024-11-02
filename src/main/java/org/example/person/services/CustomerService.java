package org.example.person.services;

import org.example.db.database;
import org.example.enums.PeopleType;
import org.example.enums.ReservationStatus;
import org.example.person.employee.Customer;
import org.example.restaurant.order.objects.Reservation;
import org.example.utils.Input;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CustomerService implements CustomerServiceImp {


    @Override
    public void createReservation(Customer customer) {
        LocalDateTime dateTime = null;
        while (true) {
            System.out.print("when do you come? (yyyy-MM-dd HH:mm): ");
            String str = Input.scannerString.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            try {
                dateTime = LocalDateTime.parse(str, formatter);
                break;
            } catch (Exception e) {
                System.out.println("Please, enter true format!");
            }
        }

        Map<PeopleType, Integer> peopleTypeIntegerMap = new HashMap<>();
        while (true) {

            for (PeopleType type : PeopleType.values()) {
                System.out.println(type);
            }
            System.out.println("Enter person type: ");
            String type = Input.scannerString.nextLine();

            PeopleType peopleType = null;
            int amount = 0;
            try {
                peopleType = PeopleType.valueOf(type.toUpperCase().trim());
                while (true) {
                    System.out.print("How many will " + type + "come? ");
                    amount = Input.scannerInt.nextInt();

                    if (amount <= 0) {
                        System.out.print("Enter positive number and bigger than 0: ");
                        amount = Input.scannerInt.nextInt();
                    } else break;
                }

            } catch (Exception e) {
                System.out.println("Please, enter true type!");
            }

            if (peopleType == null) continue;

            peopleTypeIntegerMap.put(peopleType, amount);

            System.out.print("Do you want to add other people?(yes/no): ");

            String option = Input.scannerString.nextLine();

            if(option.equals("no")) break;
        }

        database.RESERVATIONS.add(new Reservation(dateTime, peopleTypeIntegerMap, ReservationStatus.PENDING, "", customer));

        System.out.println("Done!!!");
    }
}
