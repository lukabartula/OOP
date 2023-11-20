package org.example.midterm_preperation.hashmaps;


import java.util.HashMap;
import java.util.Optional;

class Book {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
}

public class Library{
    private HashMap<String, Book> bookCollection = new HashMap<String, Book>();

    public void addBook(Book book){
            bookCollection.put(stringCleaner(book.getName()), book);
    }

    public void removeBook(String bookName){
            bookCollection.remove(stringCleaner(bookName));
    }
    private String stringCleaner(String string){
            string.trim();
            string.toLowerCase();

            return string;
    }

    public Book getBook(String key){
        return bookCollection.get(key);
    }

}

class Main {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("Author1", "Book1", 1.5);
        Book book2 = new Book("Author2", "Book2", 2.0);
        Book book3 = new Book("Author3", "Book3", 1.8);

        // Creating a library
        Library library = new Library();

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Removing a book from the library
        library.removeBook("Book2");

        // Retrieving a book from the library
        String bookKey = "Book1";
        Book retrievedBook = library.getBook(bookKey);

        // Displaying the retrieved book

        if (retrievedBook != null) {
            System.out.println("\nRetrieved Book: " + retrievedBook);
        } else {
            System.out.println("\nBook not found with key: " + bookKey);
        }
    }
}

