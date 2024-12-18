package org.calma.poo.semaine14.battleship;

import org.calma.poo.semaine14.battleship.models.Game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== BATTLESHIP GAME ===");
            System.out.println("1. Nouvelle Partie");
            System.out.println("2. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Lancer une nouvelle partie
                    Game game = new Game();
                    game.start();
                    break;

                case 2:
                    // Quitter le programme
                    System.out.println("Merci d'avoir joué ! À bientôt !");
                    exit = true;
                    break;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }
}

