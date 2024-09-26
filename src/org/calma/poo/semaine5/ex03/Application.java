package org.calma.poo.semaine5.ex03;

public class Application {
    public static void main(String[] args) {
        Lion alex = new Lion("Alex", "Savane");
        alex.manger();

        Zebre marty = new Zebre("Marty", "Savane");
        marty.manger();
    }
}
