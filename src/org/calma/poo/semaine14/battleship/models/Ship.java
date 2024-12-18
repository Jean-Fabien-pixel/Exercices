package org.calma.poo.semaine14.battleship.models;

public class Ship {
    private String type;
    private int size;

    public Ship(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
