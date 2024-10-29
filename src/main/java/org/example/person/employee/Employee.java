package org.example.person.employee;

import java.util.Date;

public class Employee extends Person{
    protected int employeeID;
    protected Date dateJoined;

    Employee(){

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
