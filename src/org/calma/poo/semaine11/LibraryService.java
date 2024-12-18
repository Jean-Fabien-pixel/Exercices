package org.calma.poo.semaine11;

import java.util.List;

public class LibraryService extends InMemoryBookRepository{
    private final BookRepository bookRepository;

    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public Book findBookById(String id) {
        return bookRepository.getBookById(id);
    }

    public List<Book> listAllBooks() {
        return bookRepository.getAllBooks();
    }

    public void updateBook(Book book) {
        bookRepository.updateBook(book);
    }

    public void deleteBook(String id) {
        bookRepository.deleteBook(id);
    }
}
