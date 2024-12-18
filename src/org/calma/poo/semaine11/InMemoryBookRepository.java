package org.calma.poo.semaine11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {
    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public Book getBookById(String id) {
        return books.get(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void updateBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public void deleteBook(String id) {
        books.remove(id);
    }
}
