package org.calma.poo.semaine3.ex1;

public class Application {
    public static void main(String[] args) {
        //Création de quelques produits
        Product product1 = new Product("Ordinateur portable", 1200.99, "Ordinateur performant pour le travail.");
        Product product2 = new Product("Souris sans fil", 29.99, "Souris ergonomique avec Bluetooth.");
        Product product3 = new Product("Clavier Mécanique", 89.99, "Clavier mécanique avec rétroéclairage.");

        // Création d'une adresse pour le client
        Address address = new Address("123 Rue de la Paix", "Paris", "75001", "France");

        //Création d'un client
        Customer customer = new Customer("Yoctan", address);

        //Création d'une commande pour le client
        Order order = new Order(customer);

        //Ajout des produits à la commande
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        //Affichage de la commande
        System.out.println(order.toString());
    }
}
