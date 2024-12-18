package org.calma.poo.semaine12.laboratoire4;

import java.util.ArrayList;
import java.util.List;

public class UserObserver implements Observer {
    private String username;
    private List<String> notifications = new ArrayList<>();

    public UserObserver(String username) {
        this.username = username;
    }

    public void follow(User user) {
        user.addFollower(this);
    }

    public void unfollow(User user) {
        user.removeFollower(this);
    }

    public void update(User user, Post post, String action) {
        String message = (user != null ? user.getUsername() : "Inconnu") + " " + action + " un poste de type " + post.getType();
        notifications.add(message);
        System.out.println(username + " a reçu une notification: " + message);
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
