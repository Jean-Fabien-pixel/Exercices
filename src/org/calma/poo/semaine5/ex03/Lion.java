package org.calma.poo.semaine5.ex03;

public class Lion extends Animal{
    private String territoire;

    public Lion(String nom, String territoire){
        super(nom);
        this.territoire = territoire;
    }

    @Override
    public void manger(){
        System.out.println("Le lion chasse et mange");
    }
}
