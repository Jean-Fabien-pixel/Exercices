package org.calma.poo.semaine9;

public class Destination extends DestinationData {
    private int id;
    private String name;

    public Destination(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
