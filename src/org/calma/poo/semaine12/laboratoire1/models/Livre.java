package org.calma.poo.semaine12.laboratoire1.models;

import java.util.Objects;

public class Livre implements Produit {
    private int id;
    private String nom;
    private double prix;
    private String auteur;

    public Livre(int id, String nom, double prix, String auteur) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.auteur = auteur;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return getId() == livre.getId() &&
                Double.compare(getPrix(), livre.getPrix()) == 0 &&
                Objects.equals(getNom(), livre.getNom()) &&
                Objects.equals(auteur, livre.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrix(), auteur);
    }
}
