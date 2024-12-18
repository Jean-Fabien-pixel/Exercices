package org.calma.poo.semaine10;

import java.util.Objects;

public class Personne {
    private String prenom;
    private String nom;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public String toString() {
        return "Personne : "+this.prenom + " "+ this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(getPrenom(), personne.getPrenom()) && Objects.equals(getNom(), personne.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrenom(), getNom());
    }
}
