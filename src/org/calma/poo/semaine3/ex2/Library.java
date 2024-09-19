package org.calma.poo.semaine3.ex2;

import java.util.ArrayList;

public class Library {
    private Book[] books;
    private int bookCount;

    Library(int bookCount) {
        this.books = new Book[bookCount];
        this.bookCount = bookCount;
    }

    public void addBook(Book book) {
        for (Book b : this.books) {
            if(b == null){
                b = book;
                break;
            }
        }
    }

    public void showAvailableBooks() {
        for (Book b : this.books) {
            if(b != null ){
                if(!b.isBorrowed()){
                    System.out.println(b.toString());
                }
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book b : this.books) {
            if(b.getTitle().toLowerCase().equals(title.toLowerCase().trim())){
                return b;
            }
        }
        return null;
    }
}
