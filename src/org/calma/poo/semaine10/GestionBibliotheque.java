package org.calma.poo.semaine10;

import java.util.*;

public class GestionBibliotheque {
    private Map<String, List<Livre>> catalogue;

    public GestionBibliotheque() {
        catalogue = new HashMap<String, List<Livre>>();
    }

    public void ajouterLivre(String nomBibliotheque, Livre livre) {
        if (!catalogue.containsKey(nomBibliotheque)) {
            catalogue.put(nomBibliotheque, new ArrayList<>());
        }
        catalogue.get(nomBibliotheque).add(livre);
    }

    public void afficherLivres(String nomBibliotheque) {
        List<Livre> livres = catalogue.get(nomBibliotheque);
        if (livres == null) {
            System.out.println("Cette bibliothèque ne possède aucun livre.");
        }
        else {
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionBibliotheque that = (GestionBibliotheque) o;
        return Objects.equals(catalogue, that.catalogue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(catalogue);
    }
}
