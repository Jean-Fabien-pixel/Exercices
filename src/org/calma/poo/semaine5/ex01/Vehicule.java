package org.calma.poo.semaine5.ex01;

public class Vehicule {
    private String marque;
    private int vitesseMax;

    public Vehicule(String marque, int vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public void afficherDetails(){
        System.out.println("marque: " + marque +"\nvitesseMax: " + vitesseMax);
    }
}
