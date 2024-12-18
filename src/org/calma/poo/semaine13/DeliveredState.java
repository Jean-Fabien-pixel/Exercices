package org.calma.poo.semaine13;

public class DeliveredState implements OrderState {
    @Override
    public void confirmOrder(Order order) {
        System.out.println("Commande déjà livrée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("Commande déjà livrée.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Commande déjà livrée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Commande déjà livrée.");
    }
}
