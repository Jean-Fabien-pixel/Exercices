package org.calma.poo.semaine12.laboratoire3;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Observer> friends = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addFriend(Observer friend) {
        this.friends.add(friend);
    }

    public void removeFriend(Observer friend) {
        this.friends.remove(friend);
    }

    public void postUpdate(String update) {
        System.out.println(this.name + " posted: " + update);
        this.notifyFriends(this.name + " posted a new update: " + update);
    }

    public void notifyFriends(String update) {
        for (Observer friend : this.friends) {
            friend.notify(update);
        }
    }
}
