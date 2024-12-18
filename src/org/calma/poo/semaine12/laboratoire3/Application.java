package org.calma.poo.semaine12.laboratoire3;

public class Application {
    public static void main(String[] args) {
        User john = new User("John");
        Observer alice = new Friend("Alice");
        Observer bob = new Friend("Bob");

        john.addFriend(alice);
        john.addFriend(bob);

        john.postUpdate("Hello, World!");
        john.removeFriend(alice);
        john.postUpdate("It's a sunny day!");
    }
}
