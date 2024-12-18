package org.calma.poo.semaine10;

import java.util.Comparator;

public class VilleComparator implements Comparator<Bibliotheque> {
    public int compare(Bibliotheque b1, Bibliotheque b2) {
        return b1.getVille().compareTo(b2.getVille());
    }
}
