package org.calma.poo.semaine9;

import java.util.Objects;

public class Reservation extends TrainTicketReservation{
    private int ticketNumber;
    private String destination;
    private String cardNumber;

    public Reservation(int ticketNumber, String destination, String cardNumber) {
        this.ticketNumber = ticketNumber;
        this.destination = destination;
        this.cardNumber = cardNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return this.ticketNumber == that.ticketNumber && Objects.equals(this.destination, that.destination) && Objects.equals(this.cardNumber, that.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ticketNumber, this.destination, this.cardNumber);
    }
}
