package org.example.week6.lab.exercise8;

import java.util.ArrayList;

class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        String copyOfWord = word;

        copyOfWord = copyOfWord.trim();
        searched = searched.trim();

        copyOfWord = copyOfWord.toUpperCase();
        searched = searched.toUpperCase();

        return copyOfWord.contains(searched);
    }
}

class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title(){
        return this.title;
    }
    public String publisher(){
        return this.publisher;
    }
    public int year(){
        return this.year;
    }
    @Override
    public String toString(){
        return this.title + ", " + this.publisher + ", " + this.year;
    }

}

class Library extends StringUtils{
    ArrayList<Book> library = new ArrayList<>();

    public Library() {

    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book b : this.library) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : this.library){
            if (Library.included(b.title(), title)) {
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : this.library) {
            if (Library.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : this.library) {
            if (b.year() == year) {
                found.add(b);
            }
        }

        return found;
    }
}

class Main{
    public static void main(String[] args) {
        /*Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);*/


        Library Library = new Library();
        /*Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);
        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.printBooks();*/

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }

    }
}




