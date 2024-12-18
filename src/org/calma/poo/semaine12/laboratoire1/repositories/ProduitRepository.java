package org.calma.poo.semaine12.laboratoire1.repositories;

import org.calma.poo.semaine12.laboratoire1.models.Produit;

import java.util.List;

public interface ProduitRepository {
    public void ajouterProduit(Produit produit);
    public void supprimerProduit(Produit produit);
    public Produit trouverParId(int id);
    public List<Produit> trouverParType(Class<? extends Produit> type);
    public List<Produit> trouverParNom(String nom);
    public List<Produit> trouverParPrix(double minPrix, double maxPrix);
}
