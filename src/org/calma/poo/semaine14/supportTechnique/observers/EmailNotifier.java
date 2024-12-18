package org.calma.poo.semaine14.supportTechnique.observers;

public class EmailNotifier implements TicketObserver {
    @Override
    public void update(String message) {
        System.out.println("[Email] Notification envoyée : " + message);
    }
}
