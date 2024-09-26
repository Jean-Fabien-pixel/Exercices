package org.calma.poo.semaine5.ex02;

public class Employe {
    private String nom;
    private double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficherDetails(){
        System.out.println("Nom : " + nom+"\nSalaire : " + salaire+" $");
    }
}
