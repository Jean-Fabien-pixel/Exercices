package org.calma.poo.semaine5.laboatoire6;

import java.awt.*;

public class Roue {
    private float grosseur;
    private Color couleur;

    public Roue(float grosseur, Color couleur) {
        this.grosseur = grosseur;
        this.couleur = couleur;
    }

    public float getGrosseur() {
        return grosseur;
    }
    public void setGrosseur(float grosseur) {
        this.grosseur = grosseur;
    }

    public Color getCouleur() {
        return couleur;
    }
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String toString() {
        return "grosseur:" + grosseur +
                ", couleur:" + couleur;
    }
}
