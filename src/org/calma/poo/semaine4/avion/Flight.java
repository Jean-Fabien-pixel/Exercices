package org.calma.poo.semaine4.avion;

public class Flight {
    private String flightNumber;
    private String destination;
    private CrewMember[] crewMembers;
    private Seat[] seats;

    public Flight(String flightNumber, String destination, int numberOfSeatsInPlane, CrewMember[] crewMembers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.seats = new Seat[numberOfSeatsInPlane];
        this.crewMembers = crewMembers;

        for (int i = 0; i < numberOfSeatsInPlane; i++) {
            seats[i] = new Seat(i + 1);
        }
    }

    public void reserveSeat(int seatNumber, Passenger passenger) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                seat.reserve(passenger);
                break;
            }
        }
    }

    public void freeSeat(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                seat.free();
            }
        }
    }

    public void showSeatStatus() {
        System.out.println("Etat des sièges pour le vol " + flightNumber + " :");
        for (Seat seat : seats) {
            System.out.println(seat.toString());
        }
    }

    public void showCrewMembers() {
        System.out.println("Equipage du vol " + this.flightNumber + " à destination de " + this.destination + " :");
        for (CrewMember crewMember : crewMembers) {
            System.out.println(crewMember.toString());
        }
    }
}


