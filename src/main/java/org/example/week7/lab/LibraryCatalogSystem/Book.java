package org.example.week7.lab.LibraryCatalogSystem;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

record Book(String title, String author, int publicationYear, boolean available) {}

class LibraryCatalog{
    public List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> checkAvailability (String searched){
        return books.stream()
                .filter(book -> book.title().equals(searched) && book.available())
                .findFirst();
    }

    public Optional<Book> availabilityByAuthor (String searchedAuthor){
        return books.stream()
                .filter(book -> book.author().equals(searchedAuthor) && book.available())
                .findFirst();
    }

    public void updateAvailability (String searchedTitle, boolean newStatus){
        books.stream()
                .filter(book -> book.title().equals(searchedTitle))
                .findFirst()
                .ifPresent(book -> books.set(books.indexOf(book), new Book(book.title(),
                        book.author(), book.publicationYear(), newStatus)));

    }
}

class Main {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, false),
                new Book("1984", "George Orwell", 1949, true)
        );

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        Optional<Book> availableBook = libraryCatalog.checkAvailability("1984");
        System.out.println("Is '1984' available? " + availableBook.isPresent());

        Optional<Book> availableByAuthor = libraryCatalog.availabilityByAuthor("J.D. Salinger");
        System.out.println("First available book by J.D. Salinger: " + availableByAuthor.orElse(null));

        Optional<Book> availableByAuthor2 = libraryCatalog.availabilityByAuthor("F. Scott Fitzgerald");
        System.out.println("First available book by F. Scott Fitzgerald: " +availableByAuthor2.orElse(null));

        libraryCatalog.updateAvailability("To Kill a Mockingbird", false);
        libraryCatalog.books.forEach(book -> System.out.println(book.title()+ " - Available: " + book.available()));
    }
}