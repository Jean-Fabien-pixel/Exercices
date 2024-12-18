package org.calma.poo.semaine8;

public class Application {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.registerUser("Yoctan", 5);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
