package org.calma.poo.semaine13;

public class NewOrderState implements OrderState{
     @Override
    public void confirmOrder(Order order) {
        System.out.println("Commande confirmée.");
        order.setState(new ConfirmedState());
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("Impossible de préparer une commande non confirmée.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Impossible d'expédier une commande non confirmée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Impossible de livrer une commande non confirmée.");
    }
}
