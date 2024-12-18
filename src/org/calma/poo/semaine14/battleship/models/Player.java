package org.calma.poo.semaine14.battleship.models;

public class Player {
    private Grid grid;
    private String name;

    public Player(Grid grid, String name) {
        this.grid = grid;
        this.name = name;
    }

    public Grid getGrid() {
        return grid;
    }

    public String getName() {
        return name;
    }
}
