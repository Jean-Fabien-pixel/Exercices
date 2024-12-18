package org.calma.poo.semaine7;

public class Drone extends Machine implements Flyable {
    public Drone(String brand, int energyLevel){
        super(brand, energyLevel);
    }

    @Override
    public void fly(int altitude){
        if(!Sandstorm.isStormActive()){
            if (this.start() & altitude > 2 * this.getEnergyLevel()) {
                System.out.println("Le drone vole à " + altitude + " d'altitude.");
            }else{
                System.out.println("Le drone ne peut pas voler à cette hauteur car il n'a pas assez d'énergie pour !");
            }
        } else {
            System.out.println("Le drone ne peut pas voler car il y'a une tempête de sable !");
        }
    }

}
