package org.calma.poo.semaine12.laboratoire3;

public class Friend implements Observer{
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public void notify(String update){
        System.out.println(this.name + " received a notification: " + update);
    }
}
