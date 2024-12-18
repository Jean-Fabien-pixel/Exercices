package org.calma.poo.semaine10;

public class Main {
    public static void main(String[] args) {
        Bibliotheque collegeAlma = new Bibliotheque("College", "Alma", 5);
        Bibliotheque cegepJonq = new Bibliotheque("CegepJonq", "Jonquiere", 2);
        Bibliotheque cegepChicout = new Bibliotheque("CegepChicout", "Chicoutimi", 3);

        GestionBibliotheque gestionBibliotheque = new GestionBibliotheque();
        Auteur laFouine = new Auteur("La", "Fouine");
        Livre livre1 = new Livre("L'avarice de sentiments", laFouine);
        Livre livre2 = new Livre("Essaie encore", laFouine);
        Livre livre3 = new Livre("A l'école", laFouine);

        gestionBibliotheque.afficherLivres("College");
        gestionBibliotheque.ajouterLivre("CegepJonq", livre1);
        gestionBibliotheque.ajouterLivre("CegepChicout", livre2);
        gestionBibliotheque.ajouterLivre("CegepChicout", livre3);
        gestionBibliotheque.afficherLivres("CegepJonq");
        gestionBibliotheque.afficherLivres("CegepChicout");
    }
}
