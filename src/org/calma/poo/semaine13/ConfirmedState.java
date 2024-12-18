package org.calma.poo.semaine13;

public class ConfirmedState implements OrderState {
    @Override
    public void confirmOrder(Order order) {
        System.out.println("Commande déjà confirmée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("Commande en préparation.");
        order.setState(new ProcessingState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Impossible d'expédier une commande non préparée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Impossible de livrer une commande non préparée.");
    }
}
