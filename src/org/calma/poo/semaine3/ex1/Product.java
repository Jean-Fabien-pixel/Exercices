package org.calma.poo.semaine3.ex1;

public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Produit : " + this.name + " | Price : " + this.price + "€ | Description : " + this.description;
    }

}
