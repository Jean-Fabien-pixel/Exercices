package org.calma.poo.semaine5.laboatoire6;

import java.awt.*;
import java.util.Objects;

public abstract class Vehicule {
    private Color couleur;
    private String marque;
    private int anneeFabrication;
    private Roue[] roues;

    public Vehicule(Color couleur, String marque, int anneeFabrication, Roue[] roues) {
        this.couleur = couleur;
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
        this.roues = roues;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }

    public abstract void avancer(Direction direction, Vitesse vitesse);

    public String toString() {
        return "";
    }

    public boolean equals(Vehicule vehicule) {
        return this.getMarque().equals(vehicule.getMarque()) &&
                this.getAnneeFabrication() == vehicule.getAnneeFabrication() &&
                this.getCouleur() == vehicule.getCouleur() &&
                this.getRoues() == vehicule.getRoues();
    }
}
