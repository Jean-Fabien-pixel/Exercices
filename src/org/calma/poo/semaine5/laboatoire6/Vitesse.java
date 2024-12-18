package org.calma.poo.semaine5.laboatoire6;

public class Vitesse {
    private UniteMesure uniteMesure;
    private double vitesse;

    public UniteMesure getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(UniteMesure uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public Vitesse(UniteMesure uniteMesure, double vitesse) {
        this.uniteMesure = uniteMesure;
        this.vitesse = vitesse;
    }

    public String toString() {
        return vitesse + " " + uniteMesure;
    }
}
