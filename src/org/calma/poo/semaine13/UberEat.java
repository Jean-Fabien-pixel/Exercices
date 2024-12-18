package org.calma.poo.semaine13;

public class UberEat implements Observer {
    private String name;

    public UberEat(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Livreur " + name + " a été notifié : la commande est prête pour l'expédition.");
    }
}
