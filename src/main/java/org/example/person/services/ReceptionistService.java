package org.example.person.services;

import org.example.db.database;
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
            System.out.print("choose reservation you make table: ");
            int resId = Input.scannerInt.nextInt();
            for (Reservation reservation : database.RESERVATIONS) {
                if (reservation.getId() == resId) chosenReservation = reservation;
            }

            if (chosenReservation == null) {
                System.out.println("Please enter true reservation");
            }
            else break;
        }


        boolean isfull = false;
        for (Table table : database.TABLES) {

            for (Reservation reservation : table.getReservations()) {
                if (reservation.getTimeOfReservation().equals(chosenReservation.getTimeOfReservation())) {
                    isfull = true;
                    break;
                }
            }

            if(!isfull){
                table.getReservations().add(chosenReservation);
                database.RESERVATIONS.remove(chosenReservation);
                return true;
            }

        }
        return false;
    }
}
