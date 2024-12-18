package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public class InProgressState implements TicketState {
    @Override
    public void handleState(TicketContext context) throws TicketException {
        System.out.println("Le ticket est en cours de traitement par un technicien...");
        context.notifyObservers("In Progress: Traitement en cours.");

        if (!context.hasAvailableTechnician()) {
            throw new TicketException("Aucun technicien n'est disponible pour traiter ce ticket.");
        }

        if (context.isComplexIssue()) {
            System.out.println("Le problème est trop complexe. Escalade du ticket...");
            context.setState(new EscalatedState());
        } else {
            System.out.println("Le problème a été résolu par un technicien.");
            context.setState(new ResolvedState());
        }
    }
}
