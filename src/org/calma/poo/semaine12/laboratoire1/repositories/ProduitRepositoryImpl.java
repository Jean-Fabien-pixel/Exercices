package org.calma.poo.semaine12.laboratoire1.repositories;

import org.calma.poo.semaine12.laboratoire1.models.Produit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProduitRepositoryImpl implements ProduitRepository {
    private Map<Integer, Produit> produits = new HashMap<Integer, Produit>();

    @Override
    public void ajouterProduit(Produit produit) {
        this.produits.put(produit.getId(), produit);
    }

    @Override
    public void supprimerProduit(Produit produit) {
        this.produits.remove(produit.getId());
    }

    @Override
    public Produit trouverParId(int id) {
        for (Produit produit : produits.values()) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public List<Produit> trouverParType(Class<? extends Produit> type) {
        ArrayList<Produit> liste = new ArrayList<>();
        for (Produit produit : produits.values()) {
            if (type.isInstance(produit)) {
                liste.add(produit);
            }
        }
        return liste;
    }

    @Override
    public List<Produit> trouverParNom(String nom) {
        ArrayList<Produit> liste = new ArrayList<>();
        for (Produit produit : produits.values()) {
            if (produit.getNom().equals(nom)) {
                liste.add(produit);
            }
        }
        return liste;
    }

    @Override
    public List<Produit> trouverParPrix(double minPrix, double maxPrix) {
        ArrayList<Produit> liste = new ArrayList<>();
        for (Produit produit : produits.values()) {
            if (produit.getPrix() >= minPrix && produit.getPrix() <= maxPrix) {
                liste.add(produit);
            }
        }
        return liste;
    }
}
