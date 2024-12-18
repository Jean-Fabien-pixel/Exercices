package org.calma.poo.semaine13;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private OrderState currentState;
    private List<Observer> observers = new ArrayList<Observer>();

    public Order(String id){
        this.currentState = new NewOrderState();
    }

    public void setState(OrderState state){
        this.currentState = state;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public void confirmOrder(){
        currentState.confirmOrder(this);
    }

    public void prepareOrder(){
        currentState.prepareOrder(this);
    }

    public void shipOrder(){
        currentState.shipOrder(this);
        notifyObservers();
    }

    public void deliverOrder(){
        currentState.deliverOrder(this);
    }
}
