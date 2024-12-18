package org.calma.poo.semaine13;

public class Application {
    public static void main(String[] args) {
        // Créer une commande
        Order order = new Order("1");

        // Ajouter des livreurs comme observateurs
        UberEat livreur1 = new UberEat("Livreur A");
        UberEat livreur2 = new UberEat("Livreur B");
        order.addObserver(livreur1);
        order.addObserver(livreur2);

        // Test des transitions
        System.out.println("État initial : Nouvelle commande");
        order.confirmOrder();
        order.prepareOrder();
        order.shipOrder(); // Notifie les livreurs
        order.deliverOrder();

        // Retirer un livreur et tester à nouveau
        order.removeObserver(livreur1);
        System.out.println("\nNouvelle commande sans un livreur :");
        Order anotherOrder = new Order("2");
        anotherOrder.addObserver(livreur2);
        anotherOrder.confirmOrder();
        anotherOrder.prepareOrder();
        anotherOrder.shipOrder();
    }
}

