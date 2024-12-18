package org.calma.poo.semaine14.supportTechnique;

import org.calma.poo.semaine14.supportTechnique.observers.EmailNotifier;
import org.calma.poo.semaine14.supportTechnique.observers.TicketLogger;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test 1 : Toutes les ressources disponibles ===");
        TicketContext ticket1 = new TicketContext(true, true, true, true);
        ticket1.addObserver(new EmailNotifier());
        ticket1.addObserver(new TicketLogger());
        ticket1.start();

        System.out.println("\n=== Test 2 : Aucun technicien disponible ===");
        TicketContext ticket2 = new TicketContext(false, true, true, true);
        ticket2.addObserver(new EmailNotifier());
        ticket2.addObserver(new TicketLogger());
        ticket2.start();

        System.out.println("\n=== Test 3 : Aucun expert disponible ===");
        TicketContext ticket3 = new TicketContext(true, false, true, true);
        ticket3.addObserver(new EmailNotifier());
        ticket3.addObserver(new TicketLogger());
        ticket3.start();

//        System.out.println("\n=== Test 4 : Client insatisfait ===");
//        TicketContext ticket4 = new TicketContext(true, true, false, false);
//        ticket4.addObserver(new EmailNotifier());
//        ticket4.addObserver(new TicketLogger());
//        ticket4.start();
    }
}
