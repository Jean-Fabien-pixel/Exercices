package org.calma.poo.semaine10;

import java.util.Objects;

public class Livre {
    private String titre;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "\n\tauteur = " + auteur.getPrenom() + " " + auteur.getNom() +
                ", \n\ttitre = '" + titre + '\'' +
                "\n\t}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(getTitre(), livre.getTitre()) && Objects.equals(getAuteur(), livre.getAuteur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitre(), getAuteur());
    }
}
