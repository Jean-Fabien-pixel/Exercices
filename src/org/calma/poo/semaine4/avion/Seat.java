package org.calma.poo.semaine4.avion;

public class Seat {
    private int seatNumber;
    private boolean isOccupied;
    private Passenger passenger;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isOccupied = false;
        this.passenger = null;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public void reserve(Passenger passenger) {
        this.passenger = passenger;
        this.isOccupied = true;
        System.out.println("Siège "+ seatNumber + " réservé par " + passenger.getName());
    }

    public void free() {
        if (this.isOccupied) {
            System.out.println("Siège " + this.seatNumber + " libéré par " + passenger.getName());
            this.isOccupied = false;
            this.passenger = null;
        }
        else {
            System.out.println("Ce siège n'est pas occupé par quelqu'un");
        }
    }

    public String toString() {
        if (this.isOccupied) {
            return ("Siège " + this.seatNumber + " (Occupé par " + passenger.getName() +")");
        }
        else {
            return ("Siège " + this.seatNumber + " (libre)");
        }
    }
}
