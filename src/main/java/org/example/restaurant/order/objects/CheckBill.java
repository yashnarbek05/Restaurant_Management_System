package org.example.restaurant.order.objects;

import org.example.person.employee.Customer;
import org.example.utils.Input;

public class CheckBill {
    private final int Id = Input.random.nextInt();
    private double amount;
    private double tip;
    private double tax;
    private boolean isPaid;


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public int getId() {
        return Id;
    }

    public double getAmount() {
        return amount;
    }

    public double getTip() {
        return tip;
    }

    public double getTax() {
        return tax;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
