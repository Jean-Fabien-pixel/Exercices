package org.calma.poo.semaine14.battleship;

import org.calma.poo.semaine14.battleship.models.Game;

public class PlacementState implements GameState {
    public void handle(Game game) {
        System.out.println("Placement terminé");
        game.setState(new PlayState());
    }
}
