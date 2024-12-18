package org.calma.poo.semaine14.supportTechnique.observers;

public class TicketLogger implements TicketObserver {
    @Override
    public void update(String message) {
        System.out.println("[Journal] " + message);
    }
}
