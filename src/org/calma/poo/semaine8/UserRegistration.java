package org.calma.poo.semaine8;

public class UserRegistration {
    public void registerUser(String name, int age) {
        registerUser(name, age, false);
    }

    public void registerUser(String name, int age, boolean parentalConsent) throws InvalidAgeException {
        if (age < 18 && !parentalConsent) {
            throw new InvalidAgeException("L'âge doit être supérieur ou égal à 18 ou un consentement parental est requis.");
        }
        System.out.println("Utilisateur enregistré : " + name);
    }
}
