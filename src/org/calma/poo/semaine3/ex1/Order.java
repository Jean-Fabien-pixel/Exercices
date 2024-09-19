package org.calma.poo.semaine3.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private Customer customer;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public double calculateTotal(){
        double total = 0;
        for (Product product : this.productList) {
            total += product.getPrice();
        }
        return total;
    }

    public String toString() {
        String recu = customer.toString() + "\n";
        for (Product product : this.productList) {
            recu += product.toString()+"\n";
        }
        recu += "Total : " + this.calculateTotal() + "€";
        return recu;
    }
}
