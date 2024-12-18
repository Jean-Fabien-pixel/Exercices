package org.calma.poo.semaine14.battleship.models;

public class Grid {
    public void placeShip(Ship ship, int row, int col, char direction) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void takeShot(int row, int col) {

    }

    public boolean allShipSunk() {
        return false;
    }
}
