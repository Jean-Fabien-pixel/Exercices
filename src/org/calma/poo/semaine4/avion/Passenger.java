package org.calma.poo.semaine4.avion;

public class Passenger {
    private int passengerId;
    private String name;

    public Passenger(int passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String toString() {
        return passengerId + " " + name;
    }
}
