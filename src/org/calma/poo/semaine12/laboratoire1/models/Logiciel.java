package org.calma.poo.semaine12.laboratoire1.models;

public class Logiciel implements Produit {
    private int id;
    private String nom;
    private double prix;
    private String version;

    public Logiciel(int id, String nom, double prix, String version) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Logiciel{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", version='" + version + '\'' +
                '}';
    }
}
