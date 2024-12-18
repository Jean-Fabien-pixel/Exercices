package org.calma.poo.semaine13;

public class ShippedState implements OrderState {
    @Override
    public void confirmOrder(Order order) {
        System.out.println("Commande déjà confirmée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("Commande déjà expédiée.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Commande déjà expédiée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Commande livrée.");
        order.setState(new DeliveredState());
    }
}
