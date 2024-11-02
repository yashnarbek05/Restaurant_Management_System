package org.example.restaurant.order.objects;

import org.example.enums.TableStatus;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int Id;
    private TableStatus tableStatus;
    private int maxCapacity;
    private int localId;
    private List<Reservation> reservations = new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }
}
