package org.calma.poo.semaine12.laboratoire1;

import org.calma.poo.semaine12.laboratoire1.factories.ProduitFactory;
import org.calma.poo.semaine12.laboratoire1.models.DVD;
import org.calma.poo.semaine12.laboratoire1.models.Produit;
import org.calma.poo.semaine12.laboratoire1.repositories.ProduitRepository;
import org.calma.poo.semaine12.laboratoire1.repositories.ProduitRepositoryImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Création d'une instance de ProduitRepositoryImpl
        ProduitRepository produitRepository = new ProduitRepositoryImpl();

        // Ajout de produits via la factory
        Produit livre1 = ProduitFactory.creerProduit("livre", 1, "Le printemps de la fleur fanée", 15.99, -1, "Sylvain Keanzo", "");

        Produit dvd1 = ProduitFactory.creerProduit("dvd", 2, "Clint Eastwood", 9.99, 2.5, "", "");

        Produit logiciel1 = ProduitFactory.creerProduit("logiciel", 3, "Unity", 49.99, -1, "", "5.7.24");

        // Ajout des produits au repository
        produitRepository.ajouterProduit(livre1);
        produitRepository.ajouterProduit(dvd1);
        produitRepository.ajouterProduit(logiciel1);

        // Test de la recherche par ID
        System.out.println("Recherche par ID (ID=1) :");
        Produit rechercheParId = produitRepository.trouverParId(1);
        System.out.println(rechercheParId);

        // Test de la recherche par Type
        System.out.println("\nRecherche par Type (Type=DVD) :");
        List<Produit> rechercheParType = produitRepository.trouverParType(DVD.class);
        for (Produit p : rechercheParType) {
            System.out.println(p);
        }

        // Test de la recherche par Nom
        System.out.println("\nRecherche par Nom (Nom='Clint Eastwood') :");
        List<Produit> rechercheParNom = produitRepository.trouverParNom("Clint Eastwood");
        for (Produit p : rechercheParNom) {
            System.out.println(p);
        }

        // Test de la recherche par Fourchette de Prix
        System.out.println("\nRecherche par Prix (Entre 10 et 20) :");
        List<Produit> rechercheParPrix = produitRepository.trouverParPrix(10.0, 200.0);
        for (Produit p : rechercheParPrix) {
            System.out.println(p);
        }
    }
}
