package org.calma.poo.semaine5.ex03;

public class Zebre extends Animal{
    private String territoire;

    public Zebre(String nom, String territoire) {
        super(nom);
        this.territoire = territoire;
    }

    @Override
    public void manger(){
        System.out.println("Le zèbre mange de l'herbe");
    }
}
