package org.calma.poo.semaine10;

import java.util.Comparator;

public class NombreDeLivresComparator implements Comparator<Bibliotheque> {
    public int compare(Bibliotheque b1, Bibliotheque b2) {
        return b1.getNombreDeLivres() - b2.getNombreDeLivres();
    }
}
