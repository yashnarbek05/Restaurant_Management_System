package org.example;

import org.example.db.database;
import org.example.db.databaseService;
import org.example.enums.PeopleType;
import org.example.enums.ReservationStatus;
import org.example.enums.TableStatus;
import org.example.person.employee.Customer;
import org.example.person.employee.Receptionist;
import org.example.person.services.ReceptionistService;
import org.example.restaurant.menu.objects.Meal;
import org.example.restaurant.order.objects.CheckBill;
import org.example.restaurant.order.objects.Reservation;
import org.example.restaurant.order.objects.Table;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        databaseService da = new databaseService();
    }
}

//    public void WriteObjectToFile(List<Object> list, String name) throws IOException {
//        FileOutputStream fileOut = new FileOutputStream(name);
//        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//        for (Object serObj : list) {
//            try {
//                objectOut.writeObject(serObj);
//                System.out.println("The Object  was succesfully written to a file");
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//
//        }
//        objectOut.close();
//    }

//    public List<Object> readObjectToFile(String name) throws IOException {
//        FileInputStream fileOut = new FileInputStream(name);
//        ObjectInputStream objectIn = new ObjectInputStream(fileOut);
//        List<Object> objects = new ArrayList<>();
//
//        while (true) {
//            try {
//                Object obj = objectIn.readObject(); // Deserialize the object
//                objects.add(obj);
//            } catch (EOFException e) {
//                break; // End of file reached
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return objects;
//    }
