package org.calma.poo.semaine14.battleship;

import org.calma.poo.semaine14.battleship.models.Game;

import java.util.ArrayList;
import java.util.List;

public class GameSubject {
    private List<GameObserver> observers = new ArrayList<GameObserver>();

    public void addObserver(GameObserver observer){
        this.observers.add(observer);
    }

    public void removeObserver(GameObserver observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(GameObserver observer : observers){
            observer.update(new Game());
        }
    }
}
