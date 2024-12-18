package org.calma.poo.semaine14.battleship;

import org.calma.poo.semaine14.battleship.models.Game;

public class PlayState implements GameState {
    public void handle(Game game) {
        System.out.println("Jeu terminé");
        game.setState(new EndState());
    }
}
