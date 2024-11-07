package org.example.person.services;

import org.example.db.database;
import org.example.enums.ReservationStatus;
import org.example.restaurant.order.objects.Reservation;
import org.example.restaurant.order.objects.Table;
import org.example.utils.Input;

public class ReceptionistService implements ReceptionistServiceImp {
    public boolean createTableWithReservation() {
        Reservation chosenReservation = null;
        while (true) {

            for (Reservation reservation : database.RESERVATIONS) {
                System.out.println(reservation);
            }
            if (database.RESERVATIONS.isEmpty()) {
                System.out.println("There is not any reservation");
            } else{
                System.out.print("choose reservation you make table: ");
                return false;
            }


            int resId = Input.scannerInt.nextInt();

            for (Reservation reservation : database.RESERVATIONS) {
                if (reservation.getId() == resId) chosenReservation = reservation;
            }

            if (chosenReservation == null) {
                System.out.println("Please enter true reservation");
            } else break;
        }

        System.out.println("table choose");
        boolean isfull = false;
        for (Table table : database.TABLES) {

            for (Reservation reservation : table.getReservations()) {
                if (reservation.getTimeOfReservation().equals(chosenReservation.getTimeOfReservation())) {
                    isfull = true;
                    break;
                }
            }

            if (!isfull) {
                table.getReservations().add(chosenReservation);
                chosenReservation.setStatus(ReservationStatus.CONFIRMED);
                System.out.println("done!!");
                database.RESERVATIONS.remove(chosenReservation);
                return true;
            }

        }
        return false;
    }
}
