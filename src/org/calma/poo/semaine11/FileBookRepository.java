package org.calma.poo.semaine11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileBookRepository implements BookRepository {
    private String filePath = System.getProperty("user.dir") + "\\src\\org\\calma\\semaine11";

    @Override
    public void addBook(Book book) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(book.getId() + ", " + book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublicationYear());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Book getBookById(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            String[] data = line.split(", ");
            if (data[0].equals(id)) {
                return new Book(data[0], data[1], data[2], Integer.parseInt(data[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                books.add(new Book(data[0], data[1], data[2], Integer.parseInt(data[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void updateBook(Book book) {
        List<Book> books = getAllBooks();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book b : books) {
                if (book.getId().equals(book.getId())) {
                    writer.write(book.getId() + ", " + book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublicationYear());
                } else {
                    writer.write(b.getId() + ", " + b.getTitle() + ", " + b.getAuthor() + ", " + b.getPublicationYear());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(String id) {
        List<Book> books = getAllBooks();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book b : books) {
                if (b.getId().equals(id)) {
                    books.remove(b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
