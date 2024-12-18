package org.calma.poo.semaine10;

import java.util.Comparator;
import java.util.Objects;

public class Bibliotheque implements Comparable<Bibliotheque> {
    private String nom;
    private String ville;
    private int nombreDeLivres;

    public Bibliotheque(String nom, String ville, int nombreDeLivres) {
        this.nom = nom;
        this.ville = ville;
        this.nombreDeLivres = nombreDeLivres;
    }

    public String getVille() {
        return this.ville;
    }

    public int getNombreDeLivres() {
        return this.nombreDeLivres;
    }

    public String getNom() {
        return this.nom;
    }

    public int compareTo(Bibliotheque o) {
        return this.nom.compareTo(o.getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bibliotheque that = (Bibliotheque) o;
        return getNombreDeLivres() == that.getNombreDeLivres() && Objects.equals(getNom(), that.getNom()) && Objects.equals(getVille(), that.getVille());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getVille(), getNombreDeLivres());
    }
}
