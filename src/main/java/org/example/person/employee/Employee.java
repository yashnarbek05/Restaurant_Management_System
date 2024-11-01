package org.example.person.employee;

import java.util.Date;

public class Employee extends Person{
    protected int employeeID;
    protected Date dateJoined;

    public Employee(int employeeID, Date dateJoined) {
        this.employeeID = employeeID;
        this.dateJoined = dateJoined;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Date getDateJoined() {
        return dateJoined;
    }
}
