package org.example.restaurant.order.objects;

public class CheckBill {
    private int checkID;
    private double amount;
    private double tip;
    private double tax;
    private boolean isPaid;

    public void setCheckID(int checkID) {
        this.checkID = checkID;
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

    public int getCheckID() {
        return checkID;
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
