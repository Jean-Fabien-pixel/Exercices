package org.calma.poo.semaine5.laboatoire6;

import java.awt.*;

public class Moto extends Vehicule {
    public Moto(Color couleur, String marque, int anneeFabrication, Roue[] roues) {
        super(couleur, marque, anneeFabrication, roues);
    }

    @Override
    public void avancer(Direction direction, Vitesse vitesse) {
        System.out.println(
                "La moto avance dans le direction " + direction + " à " + vitesse
        );
    }
}
