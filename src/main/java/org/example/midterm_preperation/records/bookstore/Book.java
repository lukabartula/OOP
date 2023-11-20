package org.example.midterm_preperation.records.bookstore;

import java.util.Arrays;
import java.util.List;

/*
 Create a record named Book with attributes:
bookId (int), title (String), author (String), and price (double).
Implement a class named Bookstore with a method named calculateTotalBookCost,
which takes a list of books and computes the total cost of all books in the list.
 */


record Book(int book_id, String author, String bookName, double price) {}

class Bookstore{

    public static double totalBookCost(List<Book> books){
        return books.stream()
                .mapToDouble(b -> b.price())
                .sum();
    }
}

class RunBookstore{
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1,"F. Scott Fitzgerald","The Great Gatsby",  25.5),
                new Book(2, "Harper Lee", "To Kill a Mockingbird",45.7),
                new Book(3,  "George Orwell","1984", 33.3)
        );
        System.out.println(
                Bookstore.totalBookCost(books)
        );
    }
}
