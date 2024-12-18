package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public class OpenState implements TicketState {
    @Override
    public void handleState(TicketContext context) throws TicketException {
        System.out.println("Le ticket est ouvert et en attente de traitement.");
        context.notifyObservers("Open: Ticket ouvert.");
        context.setState(new InProgressState());
    }
}
