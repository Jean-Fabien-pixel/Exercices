package org.calma.poo.semaine5.ex02;

public class Manager extends Employe {
    private int equipe;

    public Manager(String nom, double salaire, int equipe ) {
        super(nom, salaire);
        this.equipe = equipe;
    }

    @Override
    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("Equipe : " + equipe);
    }
}
