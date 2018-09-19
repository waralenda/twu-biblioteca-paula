package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> availableBooks;
    private List<Book> unavailableBooks;


    public Library(List<Book> books) {
        this.availableBooks = books;
        this.unavailableBooks = new ArrayList<Book>();
    }

    public List<Book> getListOfBooks() {
        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.addAll(this.availableBooks);
        listOfBooks.addAll(this.unavailableBooks);
        return listOfBooks;
    }

    public List<Book> getAvailableBooks() {
        return this.availableBooks;
    }

    public List<Book> getUnavailableBooks() {
        return this.unavailableBooks;
    }


    void checkoutBook(Book b){
        if (this.getAvailableBooks().contains(b)) {
            this.availableBooks.remove(b);
            this.unavailableBooks.add(b);
            System.out.println("Thank you! Enjoy the book");
        }
        else {
            System.out.println("That book is not available. Please check your spelling or try renting a different book");
        }
    }


    void returnBook(Book b){
        if (this.getUnavailableBooks().contains(b)) {
            this.unavailableBooks.remove(b);
            this.availableBooks.add(b);
            System.out.println("Thank you for returning the book");
        }
        else {
            System.out.println("That is not a valid book to return. Please check your spelling or try renting a different book");
        }
    }


    void listBooks() {
        printFourColumns("Title", "Author", "Year Published", "Availability");
        System.out.println("-----------------------------------------------------------------------------------");
        for (Book b : this.getListOfBooks()){
            if(this.availableBooks.contains(b)){
                printFourColumns(b.getTitle(), b.getAuthor(), b.getYear(), true);
            }
            else if(this.unavailableBooks.contains(b)) {
                printFourColumns(b.getTitle(), b.getAuthor(), b.getYear(), false);
            }

        }
    }


    private void printFourColumns(Object column1, Object column2, Object column3, Object column4) {
        System.out.printf("%-22s%-22s%-22s%-22s%n", column1, column2, column3, column4);
    }

}