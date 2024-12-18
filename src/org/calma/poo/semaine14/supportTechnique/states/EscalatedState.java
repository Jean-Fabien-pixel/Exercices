package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public class EscalatedState implements TicketState {
    @Override
    public void handleState(TicketContext context) throws TicketException {
        System.out.println("Le ticket est escaladé à un expert...");
        context.notifyObservers("Escalated: Ticket escaladé.");

        if (!context.hasAvailableExpert()) {
            throw new TicketException("Aucun expert n'est disponible pour ce ticket.");
        }

        System.out.println("Un expert a pris en charge le ticket.");
        context.setState(new ResolvedState());
    }
}
