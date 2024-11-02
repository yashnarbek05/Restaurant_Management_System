package org.example.restaurant.order.objects;

import org.example.enums.ReservationStatus;
import org.example.enums.TableStatus;
import org.example.person.employee.Customer;

import java.time.LocalDateTime;

public class Reservation {
    private int Id;
    private LocalDateTime timeOfReservation;
    private int peopleCount;
    private ReservationStatus status;
    private String notes;
    private Customer customer;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDateTime getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(LocalDateTime timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
