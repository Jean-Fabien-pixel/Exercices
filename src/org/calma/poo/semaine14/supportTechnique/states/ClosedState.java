package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public class ClosedState implements TicketState {
    @Override
    public void handleState(TicketContext context) throws TicketException {
        System.out.println("Le ticket est fermé.");
        context.notifyObservers("Closed: Ticket fermé.");
    }
}
