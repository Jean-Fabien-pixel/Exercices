package org.calma.poo.semaine3.ex2;

import java.util.Random;

public class LybraryUser {
    private String name;
    private int userId;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public LybraryUser(String name, int borrowedCount){
        this.name = name;
        this.userId = new Random().nextInt(99999);
        borrowedBooks = new Book[borrowedCount];
    }

    public String getName() {
        return this.name;
    }

    public int getUserId() {
        return this.userId;
    }

    public void borrowBook(Book book){
        
    }

    public void returnBook(Book book){

    }

    public void showBorrowedBooks(){
        for(Book book : this.borrowedBooks){
             System.out.println(book);
        }
    }
}
