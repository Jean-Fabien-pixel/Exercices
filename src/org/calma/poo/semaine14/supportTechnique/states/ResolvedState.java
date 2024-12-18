package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public class ResolvedState implements TicketState {
    @Override
    public void handleState(TicketContext context) throws TicketException {
        System.out.println("Le problème a été résolu. En attente de confirmation du client.");
        context.notifyObservers("Resolved: Ticket résolu.");

        if (context.isCustomerSatisfied()) {
            System.out.println("Le client a confirmé la résolution. Fermeture du ticket.");
            context.setState(new ClosedState());
        } else {
            System.out.println("Le client n'est pas satisfait. Réouverture du ticket.");
            context.setState(new InProgressState());
        }
    }
}
