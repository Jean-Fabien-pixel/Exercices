package org.calma.poo.semaine3.ex1;

public class Address {
    String street;
    String city;
    String postalCode;
    String country;

    public Address(String street, String city, String postalCode, String country) {
        this.street         = street;
        this.city           = city;
        this.postalCode     = postalCode;
        this.country        = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return street + ", " + city + ", " + postalCode + ", " + country;
    }
}
