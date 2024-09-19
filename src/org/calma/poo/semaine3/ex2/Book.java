package org.calma.poo.semaine3.ex2;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String toString() {
        return " \""+this.getTitle()+"\" de "+this.getAuthor()+" ("+this.getPublicationYear()+") - " + (this.isBorrowed ? "Emprunté" : "Disponible");
    }
}
