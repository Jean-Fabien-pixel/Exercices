package org.calma.poo.semaine14.battleship;

import org.calma.poo.semaine14.battleship.models.Game;

public interface GameState {
    void handle(Game game);
}
