package org.calma.poo.semaine5.ex01;

public class Voiture extends Vehicule{
    private int nombrePortes;
    public void klaxonner(){
        System.out.println("Bip bip");

    }
    public Voiture(String marque, int vitesseMax, int nombrePortes) {
        super(marque, vitesseMax);
        this.nombrePortes = nombrePortes;
    }

}
