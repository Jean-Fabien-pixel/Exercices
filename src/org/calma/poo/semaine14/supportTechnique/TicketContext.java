package org.calma.poo.semaine14.supportTechnique;

import org.calma.poo.semaine14.supportTechnique.observers.TicketObserver;
import org.calma.poo.semaine14.supportTechnique.states.OpenState;
import org.calma.poo.semaine14.supportTechnique.states.TicketState;

import java.util.ArrayList;
import java.util.List;

public class TicketContext {
    private TicketState ticket;
    private List<TicketObserver> observers;
    private boolean availableTechnician;
    private boolean availableExpert;
    private boolean complexIssue;
    private boolean customerSatisfied;

    public TicketContext(boolean availableTechnician, boolean availableExpert, boolean complexIssue, boolean customerSatisfied) {
        this.ticket = new OpenState();
        observers = new ArrayList<>();
        this.availableTechnician = availableTechnician;
        this.availableExpert = availableExpert;
        this.complexIssue = complexIssue;
        this.customerSatisfied = customerSatisfied;
    }

    public void setState(TicketState state) {
        this.ticket = state;
        try {
            state.handleState(this);
        } catch (TicketException e) {
            notifyObservers("Erreur : " + e.getMessage());
            System.out.println("[Erreur] " + e.getMessage());
        }
    }

    public boolean hasAvailableExpert() {
        return availableExpert;
    }

    public boolean hasAvailableTechnician() {
        return availableTechnician;
    }

    public boolean isComplexIssue() {
        return complexIssue;
    }

    public boolean isCustomerSatisfied() {
        return customerSatisfied;
    }

    public void addObserver(TicketObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (TicketObserver observer : observers) {
            observer.update(message);
        }
    }

    public void start() {
        try {
            this.ticket.handleState(this);
        } catch (TicketException e) {
            notifyObservers("Erreur initiale : " + e.getMessage());
            System.out.println("[Erreur initiale] " + e.getMessage());
        }
    }
}
