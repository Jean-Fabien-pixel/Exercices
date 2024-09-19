package org.calma.poo.semaine3.ex1;

public class Customer {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {return name;}

    public String getAddress() {return this.address.toString();}

    public String toString() {
        return ("Commande pour : " + this.name + "\n" +
                "Adresse de livraison : "+ this.address);
    }
}
