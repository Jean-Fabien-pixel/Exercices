package org.calma.poo.semaine9;

public class ReservationException extends RuntimeException {
    private Reservation reservation;
    private String additionalInfo;

    public ReservationException(String additionalInfo, Reservation reservation) {
        this.reservation = reservation;
        this.additionalInfo = additionalInfo;
    }

    public ReservationException(String additionalInfo, String qqch, Reservation reservation) {
        this.reservation = reservation;
        this.additionalInfo = additionalInfo;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
