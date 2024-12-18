package org.calma.poo.semaine11;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    Book getBookById(String id);
    List<Book> getAllBooks();
    void updateBook(Book book);
    void deleteBook(String id);
}
