package org.calma.poo.semaine10;

import java.util.Objects;

public class Auteur extends Personne{
    private String prenom;
    private String nom;

    public Auteur(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(getPrenom(), auteur.getPrenom()) && Objects.equals(getNom(), auteur.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrenom(), getNom());
    }
}
