package org.example.restaurant.order.objects;

import org.example.person.employee.Customer;
import org.example.utils.Input;

import java.io.Serial;
import java.io.Serializable;

public class CheckBill implements Serializable {
    @Serial
    private static final long serialVersionUID = 6529685098267757690L;
    private double amount;
    private double tip;
    private double tax;
    private boolean isPaid;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "CheckBill{" +
                "amount=" + amount +
                ", tip=" + tip +
                ", tax=" + tax +
                ", isPaid=" + isPaid +
                '}';
    }

    public CheckBill(double amount, double tip, double tax, boolean isPaid) {
        this.amount = amount;
        this.tip = tip;
        this.tax = tax;
        this.isPaid = isPaid;
    }

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
