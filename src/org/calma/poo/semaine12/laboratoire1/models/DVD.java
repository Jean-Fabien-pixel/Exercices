package org.calma.poo.semaine12.laboratoire1.models;

import java.util.Objects;

public class DVD implements Produit {
    private int id;
    private String nom;
    private double prix;
    private double duree;

    public DVD(int id, String nom, double prix, double duree) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.duree = duree;
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
        return "DVD{ " +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", duree=" + duree +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DVD dvd = (DVD) o;

        return getId() == dvd.getId() &&
                Double.compare(getPrix(), dvd.getPrix()) == 0 &&
                Objects.equals(getNom(), dvd.getNom()) &&
                Objects.equals(duree, dvd.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrix(), duree);
    }
}
