package org.calma.poo.semaine14.battleship.models;

import org.calma.poo.semaine14.battleship.GameState;
import org.calma.poo.semaine14.battleship.PlacementState;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private GameState currentState;
    private List<Ship> ships;

    public Game() {
        players = new ArrayList<>();
        ships = new ArrayList<>();
        currentState = new PlacementState();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void start() {
        Player player1 = new Player(new Grid(), "P1");
        Player player2 = new Player(new Grid(), "P2");
        this.addPlayer(player1);
        this.addPlayer(player2);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Le jeu a débuté...");
        System.out.println("P1: ");

    }

    public void setState(GameState state) {
        currentState = state;
    }
}
