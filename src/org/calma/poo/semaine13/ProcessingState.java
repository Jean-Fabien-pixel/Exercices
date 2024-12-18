package org.calma.poo.semaine13;

public class ProcessingState implements OrderState {
     @Override
    public void confirmOrder(Order order) {
        System.out.println("Commande déjà confirmée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("Commande déjà en préparation.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Commande expédiée.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Impossible de livrer une commande non expédiée.");
    }
}
