package org.example.restaurant.order.objects;

import org.example.enums.PeopleType;
import org.example.enums.ReservationStatus;
import org.example.person.employee.Customer;

import java.time.LocalDateTime;
import java.util.Map;

import static org.example.utils.Input.random;

public class Reservation {
    private final int Id = random.nextInt();
    private LocalDateTime timeOfReservation;
    private Map<PeopleType, Integer> peopleTypeAndCount;
    private ReservationStatus status;
    private Customer customer;

    public Reservation(LocalDateTime timeOfReservation, Map<PeopleType, Integer> peopleTypeAndCount,  ReservationStatus status, String notes, Customer customer) {
        this.timeOfReservation = timeOfReservation;
        this.peopleTypeAndCount = peopleTypeAndCount;
        this.status = status;
        this.customer = customer;
    }

    public int getId() {
        return Id;
    }

    public LocalDateTime getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(LocalDateTime timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "Id=" + Id +
                ", timeOfReservation=" + timeOfReservation +
                ", peopleTypeAndCount=" + peopleTypeAndCount +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }
}
