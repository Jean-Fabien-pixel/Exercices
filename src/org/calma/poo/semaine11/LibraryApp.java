package org.calma.poo.semaine11;

public class LibraryApp {
    public static void main(String[] args) {
        BookRepository inMemoryRepo = new InMemoryBookRepository();
        LibraryService service = new LibraryService(inMemoryRepo);

        Book book1 = new Book("1", "Les Misérables", "Victor Hugo", 1862);
        Book book2 = new Book("2", "1984", "George Orwell", 1949);


    }
}
