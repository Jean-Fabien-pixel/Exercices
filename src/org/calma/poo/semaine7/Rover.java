package org.calma.poo.semaine7;

import java.util.Random;

public class Rover extends Machine implements DataCollector {
    public Rover(String brand, int energyLevel) {
        super(brand, energyLevel);
    }

    @Override
    public String[] collectData() {
        String[] alienThings = {
                "Vaisseau spatial",
                "Rayon laser",
                "Planète inconnue",
                "Extraterrestre à trois yeux",
                "Cristal énergétique",
                "Robot intergalactique",
                "Portail dimensionnel",
                "Arme plasma",
                "Civilisation avancée",
                "Base secrète sur la Lune"
        };
        Random random = new Random();

        // Générer un nombre aléatoire entre 1 et 10
        int randomNumber = random.nextInt(alienThings.length) + 1;

        if (this.start() & this.getEnergyLevel() >= 10) {
            String[] data = new String[4];
            data[0] = this.getBrand();
            data[1] = String.valueOf(this.getEnergyLevel());
            data[2] = this.getStatus().name();
            data[3] = String.valueOf(alienThings[randomNumber]);

            this.setEnergyLevel(this.getEnergyLevel() - 10);
            for(String d: data){
                System.out.println(d);
            }
            return data;  // N'oublie pas de retourner le tableau !
        } else {
            System.out.println("Le rover est inactif ou n'a pas assez d'énergie.");
        }
        return null;
    }
}

