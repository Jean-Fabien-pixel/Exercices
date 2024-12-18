package org.calma.poo.semaine14.supportTechnique.states;

import org.calma.poo.semaine14.supportTechnique.TicketContext;
import org.calma.poo.semaine14.supportTechnique.TicketException;

public interface TicketState {
    void handleState(TicketContext context) throws TicketException;
}
