package org.calma.poo.semaine12.laboratoire1.factories;

import org.calma.poo.semaine12.laboratoire1.models.DVD;
import org.calma.poo.semaine12.laboratoire1.models.Livre;
import org.calma.poo.semaine12.laboratoire1.models.Logiciel;
import org.calma.poo.semaine12.laboratoire1.models.Produit;

public class ProduitFactory {
    public static Produit creerProduit(String type, int id, String nom, double prix, double duree, String auteur, String version) {
        switch (type.toLowerCase()) {
            case "livre":
                return new Livre(id, nom, prix, auteur);
            case "dvd":
                return new DVD(id, nom, prix, duree);
            case "logiciel":
                return new Logiciel(id, nom, prix, version);
            default:
                throw new IllegalArgumentException("Type inconnu : " + type);
        }
    }
}
